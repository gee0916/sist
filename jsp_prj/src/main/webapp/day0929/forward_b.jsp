<%@page import="kr.co.sist.vo.ImgVO"%>
<%@page import="java.util.List"%>
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
forward_a.jsp에서 업무처리한 결과를 받아 사용자에게 결과를 보여주는 일 => 디자인에 집중 <br>

<%
String[] nameArr=(String[])request.getAttribute("names");
List<ImgVO> listImg=(List<ImgVO>)request.getAttribute("images");
%>
<a href="forward_a.jsp?move=forward&flag=true">파라메터 요청</a>
<br>
<!-- forward로 이동한 페이지에서는 이전 페이지의 parameter를 처리할 수 있다 -->
move: <%=request.getParameter("move") %> <br>
flag: <%=request.getParameter("flag") %> <br>
<br>

<select>
<option> ---- 조원 선택 ---- </option>
<% for(String name:nameArr) { %>
<option value="<%=name %>"><%=name %></option>
<%} %>
</select>
<br>
<% for(ImgVO img:listImg) { %>

<div class="card" style="width: 18rem;">
  <img src="images/<%=img.getImg() %>" class="card-img-top" alt="더 이상 설명 생략">
  <div class="card-body">
    <h5 class="card-title"><%=img.getTitle() %></h5>
    <p class="card-text"><%=img.getContent() %></p>
    	<a href="#" class="btn btn-primary">구매각?</a>
  </div>
</div>
<%} %>

</body>
</html>