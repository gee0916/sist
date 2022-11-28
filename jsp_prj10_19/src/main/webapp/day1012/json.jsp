<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSONObject 출력"%>
<%
//JSON 이나  XML은 이중언어간의 데이터 전달용 사용
//사용자에게 보여줄 목적의 언어가 아니므로 직접 호출할 필요가 없다
String name="차차";
int age=20;
//JSONObject => {이름: 값; 이름:값,,, }
//JSP에서 사용할 때에는 이름에 "를 붙여 사용
%>

{"name":"<%=name %>", "age":"<%=age %>"}