<%@page import="kr.co.sist.dao.WebMemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="VO를 사용한 파라메터받기" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.130/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- Bootstrap JS -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script type="text/javascript">

</script>

</head>
<body>
<% //POST방식의 요청 한글 처리
request.setCharacterEncoding("UTF-8"); %>
<!--1. bean생성 -->
<jsp:useBean id="bmVO" class="kr.co.sist.vo.BeanMemberVO" scope="page"/>
<!--2. setter method 호출 -->
<jsp:setProperty property="*" name="bmVO"/>

<%

//ip주소는 web parameter 아님 = > setProperty로는 입력되지 않는다
//id="bmVO"는 객체명이고 scriplet에서 자바코드로 혼용사용이 가능
String ip=request.getRemoteAddr();
bmVO.setIpAddr(ip);

//tel_flag과 email_flag는 char(1)이므로 체크되지 않은 상태에서 가입이 되면
//null(4자)이 insert되므로 에러가 발생 => 전처리
bmVO.setTelFlag(bmVO.getTelFlag()==null?"N":bmVO.getTelFlag());
bmVO.setEmailFlag(bmVO.getEmailFlag()==null?"N":bmVO.getEmailFlag());

//DB작업을 수행
WebMemberDAO wmDAO=WebMemberDAO.getInstance();
boolean flag=wmDAO.insertPreMember(bmVO);
if(flag) {
%>

<%-- <%= bmVO %> --%>
<span style="font-size: 20px;font-weight: bold">${ param.id }</span>님 
회원 가입을 축하드립니다.<br/>
님께서 입력하신 정보는 아래와 같습니다.<br/>
<ul>
<li>이름 : <strong>${ param.name }</strong></li>
<li>생년월일 : <strong>${ param.birth}</strong></li>
<li>전화번호 : <strong>${ param.phone}</strong></li>
<li>이메일 : <strong>${ param.email1} ${ param.email2 }</strong></li>
</ul>
<%} %>
</body>
</html>







