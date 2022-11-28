<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="쿠키 읽기" %>
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
<%
//1.쿠키들 읽기 : Cookie[] cookies=request.getCookies();
Cookie[] cookies=request.getCookies();
//쿠키가 존재한다면
if( cookies != null){
	out.println("읽어 들인 쿠키의 수 : "+ cookies.length+"<br>");
	//out.println( cookies[0].getName());
	Cookie cookie=null;
	String name="";
	String value="";
	boolean flag=false;
	//2. 읽어들인 쿠키들을 반복시켜
	for(int i= 0 ; i < cookies.length ; i++){
		cookie=cookies[i];
		//쿠키의 이름
		name=cookie.getName();
		//쿠키의 값을 얻는다.
		value=cookie.getValue();
		if(cookies.length==1 && name.equals("JSESSIONID")){
			%>
			쿠키 없음.<br>
			쿠키<a href="add_cookie.jsp">심기</a>
			<%
		}else{
			flag=true;
		%>
		이름 : <%= name %>,
		값 : <%= value %><br>
		<%
		}//end else
	}//end for
	if( flag ){
	%>
	쿠키 <a href="remove_cookie.jsp">삭제</a>
	<%
	}//end if
}//end if
%>
</body>
</html>




