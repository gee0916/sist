<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="표현식"%>
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
<script type="text/javascript">
</script>
</head>
<body>
<% //scriptlet에서 변수 선언
String name="정현지";
Calendar cal=Calendar.getInstance();
%>
<%= name %>님 안녕하세요? <br>
오늘은 <%=cal.get(Calendar.YEAR) %> - <%=cal.get(Calendar.MONTH)+1 %> - 
	<%=cal.get(Calendar.DAY_OF_MONTH) %> 입니다. <br>
 <%=cal.get(Calendar.YEAR)  +"-"+ (cal.get(Calendar.MONTH)+1) +"-"+ 
	cal.get(Calendar.DAY_OF_MONTH) %> <br>
<!-- Error: out.print()는 parameter가 하나만 존재하기 때문에 에러 발생 -->
<%--  <%=cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+1),
	cal.get(Calendar.DAY_OF_MONTH) %> <br> --%>
</body>
</html>