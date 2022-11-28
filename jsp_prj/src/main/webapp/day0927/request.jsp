<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="request 내장객체를 사용한 접속자 정보 얻기"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
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
<div>
<ul>
<li>HttpServletRequest 인터페이스를 구현한 클래스: <strong> <%=request %></strong></li>
<li>접속자 ip: <strong> <%=request.getRemoteAddr() %></strong></li>
<li>접속자 port: <strong> <%=request.getRemotePort() %></strong></li>
<li>접속 URL: <strong> <%=request.getRequestURI() %></strong></li>
<li>요청방식: <strong> <%=request.getMethod() %></strong></li>
<li>요청 프로토콜: <strong> <%=request.getProtocol() %></strong></li>
<li>서버명: <strong> <%=request.getServerName() %></strong></li>
<li>서버포트: <strong> <%=request.getServerPort() %></strong></li>
<li>요청 URI: <strong> <%=request.getRequestURI() %></strong></li>
<li>요청 Servlet명: <strong> <%=request.getServletPath() %></strong></li>
<li>요청 QueryString(get방식에만 존재): <strong> <%=request.getQueryString() %></strong></li>
<li>요청 Parameter(이름 유일): <strong> <%=request.getParameter("nick") %></strong></li>
<li>요청 Parameter(이름 중복): <strong> <%=request.getParameter("age") %></strong></li>
<li>요청 Parameter(이름 중복 배열로 처리): <strong> 
<%
String[] ages= request.getParameterValues("age");
if(ages!=null){
	for(String age:ages) {
		out.print(age);
		out.print(" ");
	}
}
	
%></strong></li>
</ul>
<ul>header 정보:
<%
	Enumeration<String> en=request.getHeaderNames();
	String headerName="";
	while(en.hasMoreElements()) {
		headerName=en.nextElement();
		out.print("이름:");
		out.print(headerName);
		out.print(", 값:");
		out.print(request.getHeader(headerName));
		out.print("<br>");
	}
%>
</ul>
</div>
<div>
<a href="request.jsp?nick=chacha&age=20&age=21">GET요청</a>
<br>
<form action="request.jsp" method="post">
<input type="hidden" value="chaseungju" name="nick">
<input type="hidden" value="22" name="age">
<input type="hidden" value="23" name="age">
<input type="submit" value="POST요청" class="btn btn-success"> 
</form>
</div>
</body>
</html>