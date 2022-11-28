<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="srciptlet의 사용"%>
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
<script type="text/javascript">
</script>
</head>
<body>
<% 
String name="정현지";
%>
<label>이름</label>
<input type="text" name="name" class="inputBox" value="<%= name %>">
<br>
<% //1~100까지 웹 브라우저에 출력하는 코드 작성 %>
<select>
<%for(int i=1; i<=100; i++) {%>
<option value="<%=i %>"> <%= i%> </option>
<%}%>
</select>
<% //1~6까지 출력하는 코드
for(int i=1; i<=6; i++) {%>
<h<%=i %>>안녕하세요?<%=i %></h<%=i %>>
<% } %>

<%
String[] names={"김도희", "김소현", "김태규", "차승주", "송성우", "정선홍"};
%>
<!-- 모든 이름을 순서 목록태그와 <li>태그를 사용하여 출력,
이름이 "차승주"인 경우만 진하게로 보여준다 -->

<ol>
<% for(int i=0; i< names.length; i++ ) {
	if(names[i].equals("차승주")) { %>
		<li><strong><%=names[i] %></strong></li>
	<%} else {%>
		<li><%=names[i] %></li>
	<% } %>
<% } %>
</ol>

<!-- Java에서 날짜 객체를 생성하고, 이전 3년부터 이후 3년까지의 년을 <select>에 넣어서 보여준다 -->

<% 
Calendar cal=Calendar.getInstance();
int year=cal.get(Calendar.YEAR);
%>
<select>
<% for(int i=-3; i< 4; i++) { %>
<option <%=year+i==year? "selected='selected'":"" %>><%=year+i %></option>
<%} %>
</select>
</body>
</html>