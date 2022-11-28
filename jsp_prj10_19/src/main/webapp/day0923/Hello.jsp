<!-- 1. page directive (페이지 지시자) 선언 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 2. HTML 코드 작성 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 3. 코드사이에서 JSP tag, 내장객체, 액션태그, EL, JSTL를 정의 -->

안녕하세요. JSP <br>
<%
//JSP tag중: Scriptlet
String name="시크릿주주";
%>
내 이름은 <strong><%= /* JSP tag중: Expression */ name %></strong> 입니다 <br>
오늘은 2022년 9월 23일 입니다.


</body>
</html>