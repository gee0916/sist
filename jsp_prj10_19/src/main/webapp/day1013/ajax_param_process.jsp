<%@page import="java.util.Calendar"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<% 
String msg = request.getParameter("msg");
String name=request.getParameter("name");
String age=request.getParameter("age");

System.out.println("Web param 형식 : "+ msg);

int nowYear = Calendar.getInstance().get(Calendar.YEAR);
//응답 데이터 생성
JSONObject json = new JSONObject();

//값설정
json.put("msg",name+"님 안녕하세요?");
json.put("bYear",nowYear-Integer.parseInt(age)+1);

out.print(json.toJSONString());
%>