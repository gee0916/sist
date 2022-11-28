<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSP tag중 Scriptlet의 사용법"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//scriptlet: JSP에서 method안의 Java Code를 정의해야할 때 사용
//변수, 연산, 제어
//JSP가 요청되어 Java Source Code로 변경될 때 _JspService method안에 코드가 생성된다
int i=23; //지역변수
%>
<%-- 초기화하지 않은 지역변수는 에러가 발생 <%= i %> --%>
오늘은 <%= i %>일 입니다 <br>
<div>
<%
//연산
int nextDay=i+1;
%>
내일은 <strong><%= nextDay %></strong>일 입니다.
</div>
<div>
<%
for(int j=0; j<10; j++) {
%>
안녕하세요? <br>
<%
}//end for
%>
</div>

</body>
</html>