<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap Css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap Js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script type="text/javascript">
</script>
</head>
<body>
<h2>업로드된 파일</h2>
<div style="width: 600px">
<div style="text-align: right">
<a href="http://localhost/jsp_prj/day1007/upload_form.jsp">업로드</a>
</div>
<table class="table table-hover">
<tr>
<th>파일명</th>
<th>크기</th>
<th>업로드</th>
</tr>
<%
//1. 특정폴더의 파일 리트스를 얻는다
File file=new File("E:/dev/workspace/jsp_prj/src/main/webapp/upload");
File[] listFile=file.listFiles();
out.println(listFile.length);
if(listFile.length==0) {
%>
<tr>
<td colspan="3" style="text-align: center;">
업로드된 파일이 없습니다 <br>
<a href="http://localhost/jsp_prj/day1007/upload_form.jsp">업로드</a>
</tr>
<%
}//end if
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");

for(File tempFile:listFile) {
%>
<!-- 웹브라우저는 연결된 파일을 브라우저안에서 보여줄 수 없다면 (브라우저가 해석할 수 없다면 ) 다운로드를 수행한다 
	연결된 파일을 브라우저에서 해석 할 수 있다면 다운로드를 수행할 수 있다 -->
<tr>
<td style="width: 400px">
<%-- <a href="../upload/<%=tempFile.getName()%>"><%=tempFile.getName() %></a> --%>
<a href="download.jsp?filename=<%=tempFile.getName()%>"><%=tempFile.getName() %></a>
</td>
<td style="width: 160px">
<%=tempFile.length() %>
</td>
<td style="width: 140px">
<%=sdf.format(new Date(tempFile.lastModified())) %>
</td>
</tr>
<%	
}//end for
%>
</table>
</div>
</body>
</html>