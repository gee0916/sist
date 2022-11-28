<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.dao.WebMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<%
String paramId=request.getParameter("id");
WebMemberDAO wmDAO=WebMemberDAO.getInstance();

try{
//DB에서 조회
boolean idFlag=wmDAO.selectId(paramId);

//조회결과를 JSONObjext 저장
JSONObject jsonObj=new JSONObject();
jsonObj.put("idFlag",idFlag);

//JSONObject 출력
out.print(jsonObj.toJSONString());

}catch(SQLException se) {
	se.printStackTrace();
}

%>