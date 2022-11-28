<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="json=sibple library를 사용한 JSONObjext생성" %>
    
   <%
   //1. JSONObject 생성
   JSONObject json=new JSONObject();
   
   //2. JSONObject 값 할당 (값은 순차적으로 입력되지 않는다)
   json.put("name","차차");
   json.put("age",20);
   json.put("flag",true);
   
   //3. 출력
   out.print(json.toJSONString());
   %>
