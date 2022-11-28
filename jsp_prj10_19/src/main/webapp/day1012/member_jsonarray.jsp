<%@page import="kr.co.sist.util.cipher.DataEncrypt"%>
<%@page import="kr.co.sist.util.cipher.DataDecrypt"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.vo.WebMemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.dao.WebMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="회원정보를 JSONArray 저장"%>
<%
WebMemberDAO wmDAO=WebMemberDAO.getInstance();
List<WebMemberVO> list=null;
try{
	list=wmDAO.selectWebMember();
	
}catch (SQLException se){
	se.printStackTrace();
}
//1. JSONArray 생성 (List)
JSONArray jsonArr=new JSONArray();
if(list==null || list.size()==0) {
	JSONObject json=new JSONObject();
	json.put("msg", "데이터가 존재하지 않습니다.");
	jsonArr.add(json);
}else {
	JSONObject jsonTemp=null;
	
	String key="abcdfghijklmnop1234~";
	DataDecrypt de=new DataDecrypt(DataEncrypt.messageDigest("SHA-1", key));
	
	for(WebMemberVO wmVO:list) {
	//2. JSONObject 생성 (Map)
		jsonTemp=new JSONObject();
		
	//3. JSONObject 값 할당. put(이름.값);
		jsonTemp.put("id", wmVO.getId());
		jsonTemp.put("pass", wmVO.getPass());
		//암호화된 데이터를 복호화하여 보여준다.
		jsonTemp.put("name", de.decryption(wmVO.getName()));
		jsonTemp.put("eamil", de.decryption(wmVO.getEmail()));
	//4. JSONObject을 JSONArray할당. add(객체);
		jsonArr.add(jsonTemp);
	}//end for
//5. JSONObject을 JSONArray출력
}
	out.print(jsonArr.toJSONString());
%>