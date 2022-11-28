<%@page import="java.util.Date"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="kr.co.sist.vo.LatLngVO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="kr.co.sist.dao.MapDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="경도 위도 조회"%>
<%
JSONObject jsonObj=new JSONObject();

jsonObj.put ("date", new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));

MapDAO md=MapDAO.getInstance();
boolean flag=false;
try{
	List<LatLngVO> list=md.selectLatLng();
	jsonObj.put("dataSize", list.size());
	jsonObj.put("searchFlag", list.isEmpty());
	flag=true;
	
	JSONArray jsonArr=new JSONArray();
	JSONObject jsonTemp=null;
	
	for(LatLngVO llVO:list) {
		jsonTemp=new JSONObject();
		jsonTemp.put("lat", llVO.getLat());
		jsonTemp.put("lng", llVO.getLng());
		jsonTemp.put("title", llVO.getTitle());
	
		jsonArr.add(jsonTemp);
	}
	
	jsonObj.put("data", jsonArr);
}catch (SQLException e) {
	e.printStackTrace();
}
	jsonObj.put("dataResult", flag);
	out.print(jsonObj.toJSONString());
%>
