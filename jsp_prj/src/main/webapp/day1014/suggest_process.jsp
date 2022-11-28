<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="netscape.javascript.JSObject"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.sist.vo.SuggestVO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.dao.SuggestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<%
String keyword= request.getParameter("keyword");

if(keyword==null) {
	keyword="";
}//end if

SuggestDAO sDAO=SuggestDAO.getInstance();

List<SuggestVO> list=null;
try {
	list=sDAO.selectSuggest(keyword);
}catch(SQLException se) {
	list=new ArrayList<SuggestVO>();
	se.printStackTrace();
}//end catch

JSONObject jsonObj=new JSONObject();
jsonObj.put("dataSize",list.size());
jsonObj.put("isEnpty",list.isEmpty());
jsonObj.put("prdDate",new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));

JSONArray jsonArr=new JSONArray();
JSONObject jsonTemp=null;

for(SuggestVO sVO:list) {
	jsonTemp=new JSONObject();
	jsonTemp.put("num", sVO.getNum());
	jsonTemp.put("keyword",sVO.getKeyword());
	
	jsonArr.add(jsonTemp);
}

jsonObj.put("data",jsonArr);
out.print(jsonObj.toJSONString());

%>
