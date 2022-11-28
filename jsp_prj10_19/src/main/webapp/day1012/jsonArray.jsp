<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="kr.co.sist.vo.TestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<%
TestVO[] tVO={new TestVO("차차",20), new TestVO("추추",21), new TestVO("처처",25)};
//1. JSONArray 생성 (List)
JSONArray jsonArr=new JSONArray();

JSONObject json=null;
for(int i=0; i<tVO.length; i++) {
//2. JSONObject 생성 (Map)
json=new JSONObject();	
//3. JSONObject 값 할당. put(이름.값);
json.put("name",tVO[i].getName());
json.put("age",tVO[i].getAge());
//4. JSONObject을 JSONArray할당. add(객체);
jsonArr.add(json);
}//end for
//5. JSONObject을 JSONArray출력
out.print(jsonArr.toJSONString());

%>