<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="kr.co.sist.vo.TestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<%
//데이터
TestVO[] tVO={new TestVO("정주은",20), new TestVO("정현지",21), new TestVO("송성우",25), new TestVO("이유리",22), new TestVO("홍아람",24)};

//1. JSONObject 생성
JSONObject jsonObj=new JSONObject(); //

//2.값할당
jsonObj.put("prdName","차차"); //prdName:"차차"
jsonObj.put("info","차차의 친구들 목록"); //info:"차차의 친구들"
jsonObj.put("dataSize",tVO.length); //datSize:5
jsonObj.put("resultFlag",tVO.length>0); //resultFlag:true
jsonObj.put("prdDate",new SimpleDateFormat("yyyy-MM-dd").format(new Date())); //prdDate:"2022-10-13"

//3. data 넣기
//3-1. JSONArray 생성
JSONArray jsonArr=new JSONArray(); // []
//3-2 JSONArray 값 할당
JSONObject jsonTemp=null;

for(TestVO temp:tVO) {
	//JSONObject 생성
	jsonTemp=new JSONObject();
	
	//JSONObject 값 할당
	jsonTemp.put("name", temp.getName());
	jsonTemp.put("age", temp.getAge());
	
	//JSONObject을 JSONArray 추가
	jsonArr.add(jsonTemp);
	
}//end for

//데이터를 가진 JSONArray를 JOSNObject추가
jsonObj.put("data",jsonArr);
out.print(jsonObj.toJSONString());

%>