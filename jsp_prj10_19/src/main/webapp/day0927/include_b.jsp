<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 들어가는 JSP는 하나의 HTML처럼 보일 수 있도록 부분에 코드만 가진다
여러 JSP에서 사용하는 공통 코드를 가진다 -->

<%!
public String toDate() {
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	return sdf.format(new Date());
}
%>


<%
String msg="오늘은 화요일 입니다.";
%>

<div>
내부 JSP <br>
<img src="http://localhost/jsp_prj/day0927/images/img4.png">
</div>
