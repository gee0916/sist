<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="" session="true"%>
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
String name=request.getParameter("name");
//세션의 생존시간 (동작이 발생한후 다음 동작이 발생하기 전 시간)
//초*분*시*일*월*년
//60*60*24*30*12*1
session.setMaxInactiveInterval(60*2);
//세션에 값 설정 
//*주의: 중요도가 높은 값은 저장하지 않는다.
//DBMS에서 검색된 많은 양의 정보
session.setAttribute("name", name);

%>
<strong><%=name %></strong>님 어서오고 <br>
<!-- Query String으로 만들어서 붙이면 중요하지 아넣은 정보는 괜찮으나, 중요도가 높은 정보는 유출의 위험이 따른다 -->
<%-- <%=name%>님의 작업페이지로 <a href="why_seseeion_c.jsp">로 이동</a> --%>
 <%=name%>님의 작업페이지로 <a href="use_session_c.jsp"> 이동</a>

</body>
</html>