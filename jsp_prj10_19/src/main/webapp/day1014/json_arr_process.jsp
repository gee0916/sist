<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.vo.WebMemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.dao.WebMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="DB에서 조회한 결과를 JSONArray 생성"%>
<%

WebMemberDAO wmDAO=WebMemberDAO.getInstance();

List<WebMemberVO> list=null;

try {
	list=wmDAO.selectWebMember();	
}catch (SQLException se) {
	se.printStackTrace();
}//end for

//1. JSONArray 생성
JSONArray ja=new JSONArray();
		
JSONObject jo=null;
if(list.isEmpty()) { //예외가 발생했거나 조회결과가 없을 때
	jo=new JSONObject();
	jo.put("id",null);
	jo.put("name",null);
}else{ //검색결과가 존재하는 경우
	for(WebMemberVO wmVO:list) {
	//2. JSONObject 생성
	jo=new JSONObject();
	//3. JSONObject 값할당
	jo.put("id",wmVO.getId());
	jo.put("name",wmVO.getName());
	//4. JSONObject을 JSONArray설정
	ja.add(jo);
	}	
}//end else
//5. JSONArray출력
out.print(ja.toJSONString());

%>