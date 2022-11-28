<%@page import="java.io.IOException"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="업로드 파일 처리" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.130/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- Bootstrap JS -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script type="text/javascript">

</script>

</head>
<body>
<%-- <% 
// enctype="multipart/form-data" 인 경우에는  request.parameter로 값을 받을 수 없다.
	String uploader=request.getParameter("uploader"); 
	String age=request.getParameter("age"); 
%>
업로더 : <strong><%= uploader %></strong><br/>
나이 : <strong><%= age %></strong><br/> --%>
<%
//1. 업로드 경로 얻기 
File uploadDir=new File("E:/dev/workspace/jsp_prj/src/main/webapp/upload/");
//2. 업로드할 파일 크기를 연산
//5MByte까지의 파일을 업로드
int maxSize=1024*1024*600;
//3. 업로드  : MultipartRequest를 생성하면 파일이 업로드 된다.
//MultipartRequest(request, saveDirectory,maxPostSize, encoding,policy)

MultipartRequest mr=new MultipartRequest(request, uploadDir.getAbsolutePath(), 
		maxSize, "UTF-8", new DefaultFileRenamePolicy());

//4. 웹 파라메터 처리
String uploader=mr.getParameter("uploader");
String age=mr.getParameter("age");
//5. file control 처리
//원본 파일명
String originalName=mr.getOriginalFileName("upfile");
//변경된 파일명
String reName=mr.getFilesystemName("upfile");

boolean flag=false;
File temp=new File(uploadDir.getAbsolutePath()+"/"+reName);
int checkSize=1024*1024*5;
if( temp.length()  > checkSize){
	 flag=true;
	 temp.delete();//파일 삭제
}//end if

if( !flag ){
%>
	파일이 업로드 되었습니다.<br/>
	업로더 : <%= uploader %><br/>
	나이 : <%= age %><br/>
	파일명 : <%= originalName %> ( <%= reName %> )
<%} else {  %>
	업로드 파일은 5MByte까지만 가능 합니다.
<%}//end else %>
[  <a href="http://localhost/jsp_prj/day1012/file_list.jsp">파일목록</a> |
 <a href="http://localhost/jsp_prj/day1012/upload_form.jsp">업로드</a> ]
</body>
</html>





