<%@page import="kr.co.sist.vo.WebMemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.dao.WebMemberDAO"%>
<%@page import="kr.co.sist.dao.WebMemberXML"%>
<%@ page language="java" contentType="application/vnd.ms-excel"
    pageEncoding="UTF-8" info=""%>
   <% response.setHeader("Content-Disposition", "attachement;filename=mamber_data.xls"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">
th, td {border: 1px solid #444}
th {background-color: #c39336}
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
<%
WebMemberDAO wmDAO=WebMemberDAO.getInstance();
List<WebMemberVO> list=wmDAO.selectWebMember();
%>
<table class="table table-striped" style="width: 1140px; border: 1px solid #444">
<tr>
<th style="width: 100px; height:25px ">번호</th>
<th style="width: 300px;">아이디</th>
<th style="width: 250px;">비밀번호</th>
<th style="width: 250px;">이름</th>
<th style="width: 240px;">이메일</th>
</tr>
<%
WebMemberVO wmVO=null;
for(int i=0; i<list.size(); i++) {
	wmVO=list.get(i);
%>
<tr>
<td><%= i+1 %></td>
<td><%= wmVO.getId() %></td>
<td><%= wmVO.getPass() %></td>
<td><%= wmVO.getName() %></td>
<td><%= wmVO.getEmail() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>