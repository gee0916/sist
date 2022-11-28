<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="공통디자인" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.130/html_prj/common/css/main_v1_220901.css"/>
<style type="text/css">
#wrap{ width: 310px; margin:0px auto }
#loginHeader{ text-align: center;margin-top: 50px; margin-bottom: 40px}
.size { width: 400px; height: 50px; font-size: 18px; margin-bottom: 10px}

.btnDesign{  width: 410px; height: 50px; background-color: #4C87EE;
 font-weight: bold; color:#FFFFFF; font-size: 18px }
 
 #idWarnMsg, #passWarnMsg { font-weight: bold; font-size: 15px; color: #FF0000;
 	margin-bottom: 10px; display: none}
 
</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#id").keydown( function(evt) {
		if( evt.which ==13 ){// 눌린키의 키코드를 which 속성으로 받을 수 있다.
			chkNull();
		}//end if
	});//keydown
	$("#password").keydown( function(evt) {
		if( evt.which ==13 ){// 눌린키의 키코드를 which 속성으로 받을 수 있다.
			chkNull();
		}//end if
	});//keydown
	
	$("#btnLogin").click(function(){
		chkNull();
	});
});//ready


function chkNull(){
	//아이디에 입력한 값을 얻는다.
	var id=$("#id").val();
	if(id.trim() == ""){
		$("#idWarnMsg").show();
		$("#id").val("");//입력된 공백 아이디를 초기화한다.
		return;
	}else{
		$("#idWarnMsg").hide();
		$("#password").focus();
	}//end if
	
	//비밀번호에 입력한 값을 얻는다.
	var pass=$("#password").val();
	if( pass.trim() == ""){
		$("#passWarnMsg").show();
		$("#password").val("");//입력된 공백 아이디를 초기화한다.
		return;
	}else{
		$("#passWarnMsg").hide();
	}//end if
	
	//아이디와 비밀번호가 모두 입력된 후 form 태그의 action으로 설정된페이지로 요청을
	//보낸다.
	$("#frm").submit();
	
}//chkNull
</script>
</head>
<body>
<div id="wrap">
<div id="loginHeader">
<img src="http://localhost/html_prj/common/images/sist.png"/>
</div>
<div id="loginContent">
<form name="frm" id="frm" action="login_form_process.jsp">
<input type="text" name="id" id="id" class="inputBox size" placeholder="아이디"
	maxlength="20" autofocus="autofocus"/><br>
<div id="idWarnMsg">아이디는 필수 입력</div>
<input type="password" name="password" id="password" class="inputBox size" placeholder="비밀번호"
	maxlength="20"/><br>
<div id="passWarnMsg">비밀번호는 필수 입력</div>
<input type="button" value="로그인" id="btnLogin" class="inputBtn btnDesign"/>
<input type="hidden" name="os" value=<%= request.getHeader("sec-ch-ua-platform") %>/>
</form>
</div>
<div id="loginFooter"></div>
</div>
</body>
</html>