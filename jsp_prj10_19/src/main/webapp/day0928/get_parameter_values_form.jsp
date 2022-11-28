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
$(function() {
	$("#getBtn").click(function() {
		$("#getFrm").submit();
	})
	$("#postBtn").click(function() {
		$("#postFrm").submit();
	})
	
})

</script>
</head>
<body>
<div id="get">
<strong>name 속성이 중복되는 HTML Form Control의 값 전송연습</strong>
<form method="get" action="get_parameter_values_form_process.jsp" id="getFrm">
<label>이름</label>
<input type="text" name="name" class="inputBox"/><br>

<label>취미</label>
<input type="checkbox" name="hobby" value="등산"/>등산<br>
<input type="checkbox" name="hobby" value="영화감상"/>영화감상<br>
<input type="checkbox" name="hobby" value="게임"/>게임<br>
<input type="checkbox" name="hobby" value="운동"/>운동<br>
<input type="button" value="GET전송" class="inputBtn" id="getBtn"/><br>
</form>
</div>

<div id="post">
<strong>name 속성이 중복되는 HTML Form Control의 값 전송연습</strong>
<form method="get" action="get_parameter_values_form_process.jsp" id="getFrm">
<label>이름</label>
<input type="text" name="name" class="inputBox"/><br>

<label>취미</label>
<input type="checkbox" name="hobby" value="등산"/>등산<br>
<input type="checkbox" name="hobby" value="영화감상"/>영화감상<br>
<input type="checkbox" name="hobby" value="게임"/>게임<br>
<input type="checkbox" name="hobby" value="운동"/>운동<br>
<input type="button" value="POST전송" class="inputBtn" id="getBtn"/><br>
</form>
</div>
</body>
</html>