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
<%
//Post방식일때의 한글 처리
request.setCharacterEncoding("UTF-8");

//name=dsfa&hobby=등산&hobby=영화감상&hobby=게임&hobby=운동
//name 속성이 유일한 Control 값 받기
String name=request.getParameter("name");

//name 속성이 중복되는 Control 값 받기:getParmeterValues
String[] hobby=request.getParameterValues("hobby");


%>
<div>
이름 : <%=name %> <br>
취미:

<ul>
<%try { %>
<% for(int i=0; i<hobby.length; i++) { %>
<li><%=hobby[i]%></li>
<%} %>
<%
} catch (NullPointerException npe) {
	out.println("<li>선택한 취미 없음 </li>");
}
%>
<a href="#void" onclick="history.back()">다시입력</a>
</ul>
</div>
</body>
</html>