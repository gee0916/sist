<%@page import="day0926.ZipcodeVO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="day0926.ZipcodeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap Css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap Js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script type="text/javascript">
</script>
</head>
<body>

<!-- 	1. ZipcodeDAO클래스를 객체화한다
	2. 상도동을 입력하여 우편번호를 조회한다
	-> 자바코드 => 스트립틀릿
	3. 조회결과를 테이블에 출력한다
	- 자바코드와 HTML태그가 결합 -->

 <%
 	ZipcodeDAO zDAO=new ZipcodeDAO();
 	String dong="상도동";
 	List<ZipcodeVO> list=zDAO.selectZipcode(dong);
 %>
 <%=dong%>으로 검색한 결과 <br>
 <table class="table table-bordered">
 <tr>
 <th>우편번호</th>
 <th>주소</th>
 </tr>
 <%if(list.isEmpty()) {%>
 <tr>
 <th colspan="2"><%=dong %>은 존재하지 않습니다 </th>
 <tr>
 <%} %>
 <% for(ZipcodeVO zVO: list) { %> 
 <tr>
 <td> <%=zVO.getZipcode() %> </td>
 <td>
 	<%=zVO.getSido() %> <%=zVO.getGugun() %> <%=zVO.getDong() %> <%=zVO.getBunji() %> 
 </td>
 </tr>
 <%} %>
 </table>
 
</body>
</html>