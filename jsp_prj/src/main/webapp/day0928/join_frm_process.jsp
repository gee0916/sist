<%@page import="kr.co.sist.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="입력값 받기"%>
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
<%

MemberVO mVO=new MemberVO();
//파라메터 받기
request.setCharacterEncoding("UTF-8");
mVO.setId(request.getParameter("id"));
mVO.setPass(request.getParameter("pass"));
mVO.setName(request.getParameter("name"));
mVO.setBirth(request.getParameter("birth"));
mVO.setPhone(request.getParameter("phone"));
mVO.setTel1(request.getParameter("tel2"));
mVO.setEmail1(request.getParameter("email1"));
mVO.setEmail2(request.getParameter("email2"));
mVO.setGender(request.getParameter("gender"));
mVO.setLoc(request.getParameter("loc"));
mVO.setZipcode(request.getParameter("zipcode"));
mVO.setAddr1(request.getParameter("addr1"));
mVO.setAddr2(request.getParameter("addr2"));
mVO.setLang(request.getParameterValues("lang"));

%>

<%=mVO %>
</body>
</html>