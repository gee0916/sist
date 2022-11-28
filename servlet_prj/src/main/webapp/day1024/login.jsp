<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="쿠키로그인체크" %>
  <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">
#wrap{ width: 310px; margin:0px auto }
#loginHeader{ text-align: center;margin-top: 50px; margin-bottom: 40px}
#saveFlag{ width: 50px; height: 50px;}
.size { width: 400px; height: 50px; font-size: 18px; margin-bottom: 10px}

.btnDesign{  width: 410px; height: 50px; background-color: #4C87EE;
 font-weight: bold; color:#FFFFFF; font-size: 18px }
 
 #idWarnMsg, #passWarnMsg { font-weight: bold; font-size: 15px; color: #FF0000;
 	margin-bottom: 10px; display: none}
 
</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- Bootstrap JS -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script type="text/javascript">
$(function(){
	$("#btnLogin").click(function(){
		$("#frm").submit();
	});
})
</script>

</head>
<body>
<div id="loginContent">
<form name="frm" id="frm" action="login_add_cookie" method="post">
<div style="position: relative;">
<input type="text" name="id" id="id" class="inputBox size" placeholder="아이디"
	maxlength="20" autofocus="autofocus"  value="${ saveId }"/>
<input type="checkbox" name="saveFlag" id="saveFlag"${ saveFlag?"checked='checked'":"" }
 style="position: absolute;top:0px;left: 410px"/>
</div>
	<br>
<div id="idWarnMsg">아이디는 필수 입력</div>
<input type="password" name="password" id="password" class="inputBox size" placeholder="비밀번호"
	maxlength="20"/><br>
	
<div id="passWarnMsg">비밀번호는 필수 입력</div>
<input type="button" value="로그인" id="btnLogin" class="inputBtn btnDesign"/>
<input type="hidden" name="os" value=<%= request.getHeader("sec-ch-ua-platform") %>/>
</form>
</div>
</body>
</html>