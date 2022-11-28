<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<%

//37.4993412,127.0332097
JSONObject jsonObj=new JSONObject();
jsonObj.put("lat", 37.4993412);
jsonObj.put("lng", 127.0332097);
out.print(jsonObj.toJSONString());

%>