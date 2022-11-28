<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/common/css/main_v1_220901.css"/>
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
<div>
<% String method=request.getMethod().toLowerCase(); %>
<img src="http://localhost/jsp_prj/day0927/images/<%=method %>.png" style="width: 100px">
</div>

<div>
<%  
	//Get방식에는 영향이 없다
	request.setCharacterEncoding("UTF-8");
	//name 속성이 유일한 HTML Form Control의 값 받기
	//request.getParameter("이름")
	//text=&pwd=&hid=get방식의+히든&sel=자바&col=%23000000&ta=
	String txt=request.getParameter("text"); //input type="hidden"
	String password=request.getParameter("pwd"); //input type="hidden"
	String hid=request.getParameter("hid"); //input type="hidden"
	String checkbox=request.getParameter("cb"); //input type="checkbox"
	String radio=request.getParameter("gender"); //input type="ta"
	String select=request.getParameter("sel"); //input type="sel"
	String col=request.getParameter("col"); //input type="color"
	String ta=request.getParameter("ta"); //input type="ta"
%>
<ul>
<li><strong>text 값:</strong><%=txt %> </li>
<li><strong>password 값:</strong><%=password %> </li>
<li><strong>hidden 값:</strong><%=hid %> </li>
<li><strong>checkbox 값:</strong><%=checkbox %> </li>
<li><strong>radio 값:</strong><%=radio %> </li>
<li><strong>select 값:</strong><%=select %> </li>
<li><strong>color 값:</strong><%=col %> </li>
<li><strong>textarea 값:</strong><%=ta.replaceAll("\n", "<br>") %> </li>
<li><input type="button" value="뒤로" class="inputBtn" onclick="history.back()"></li>
</ul>

</div>
</body>
</html>