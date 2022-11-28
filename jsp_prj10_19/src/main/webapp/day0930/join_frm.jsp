<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/common/css/main_v1_220901.css"/>
<style type="text/css">
tr{ height: 30px }
#passMsg{ color:#FF0000 }
</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#btnAdd").click(function(){
		//null 검사
		chkNull();
	});
	
	$("#passcheck").focusout(function(){
		//비밀번호와 비밀번호 확인의 값이 같은지를 비교
		chkPass();
	});
});

function chkPass(){
	var pass1=$("#pass").val();
	var pass2=$("#passcheck").val();
	
	var flag=false;
	if(pass1 != pass2){
		flag=true;
		$("#passMsg").html("비밀번호와 비밀번호확인 일치하지 않습니다.");
		for(var i= 0 ; i < 5 ; i++){
			$("#passMsg").fadeIn(500).fadeOut(500);
		}//end for
		$("#pass").val("");
		$("#passcheck").val("");
		$("#pass").focus();
	}//end if
	return flag;
}//chkPass

function chkNull(){
	//필수 입력에 대한 체크 수행
	//아이디 필수 입력
	var id=$("#id").val();
	if( id.trim() == ""){
		alert("아이디 필수 입력");
		$("#id").val("");
		$("#id").focus();
		return;
	}//end if
	
	if($("#pass").val().trim() == ""){
		alert("비밀번호 필수 입력");
		$("#pass").val("");
		$("#pass").focus();
		return;
	}//end if
	
	var flag=chkPass();
	if(flag){
		return;
	}//end if
	
	$("#memberFrm").submit();
}
</script>
</head>
<body>
<a href="#void">링크</a>
<h2>회원가입</h2>
	<form method="post" action="join_bean_process.jsp" id="memberFrm">
	
		<table border="0">
			<tr>
				<td ><span class="red">*</span>아이디</td>
				<td><input type="text" name="id" id="id" class="inputBox"></td>
			</tr>
			<tr>
				<td><span class="red">*</span>비밀번호</td>
				<td><input type="password" id="pass"   name="pass" class="inputBox"><label
					for="passcheck"><small>&nbsp;&nbsp;비밀번호 확인</small></label> 
					<input type="password" id="passcheck" name="passchk"  class="inputBox"><label for="pass"> <small>&nbsp;&nbsp;
					<span id="passMsg"></span>
					<span class="red">*</span>8~12자의
							영문,숫자,특수문자 3가지를 조합하여 입력</small></label>
					</td>
			</tr>
			<tr>
				<td><span class="red">*</span>이름</td>
				<td><input type="text" class="inputBox"  name="name"></td>
			</tr>
			<tr>
				<td><span class="red">*</span>생일</td>
				<td><input type="date" class="inputBox"  name="birth"></td>
			</tr>
			<tr>
				<td><span class="red">*</span>나이</td>
				<td><input type="text" class="inputBox"  name="age"></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="tel" class="inputBox" style="width: 100px" name="phone"></td>
			</tr>
			<tr>
				<td><span class="red">*</span>휴대폰</td>
				<td><input type="tel" class="inputBox"  name="tel1"> <input type="checkbox"  name="telFlag" value="Y"><small>수신</small></td>
			</tr>
			<tr>
				<td><span class="red">*</span>이메일</td>
				<td><input type="email" class="inputBox"  name="email1" style="width:150px">@ 
						<select class="inputBox"  name="email2" >
						<option>선택해주세요</option>
						<option>googl.com</option>
						<option>daum.net</option>
						<option>nate.com</option>
						<option>naver.com</option>
						<option>hotmail.com</option>
						<option>직접입력</option>
						</select> <input type="checkbox"  name="emailFlag" value="Y"><small>수신</small></td>
			</tr>
			<tr>
				<td><span class="red">*</span>성별</td>
				<td><input type="radio" id="man" name="gender" value="m">
					<label>남자</label> 
					<input type="radio" 	id="woman" name="gender" value="w"><label>여자</label>
				</td>
			</tr>
			<tr>
				<td>소재지</td>
				<td><select class="inputBox"  name="loc">
						<option>선택해주세요</option>
						<option>서울</option>
						<option>경기</option>
						<option>강원</option>
						<option>충청도</option>
						<option>경상도</option>
						<option>전라도</option>
						<option>제주도</option>
				</select></td>
			</tr>
			<tr>
				<td><span class="red">*</span>우편번호</td>
				<td><input type="text" class="inputBox"  name="zipcode"></td>
			</tr>
			<tr>
				<td ><span class="red">*</span>주소</td>
				<td><input type="text" class="inputBox" style="width:400px" name="addr1"> <br> 
						<input type="text" class="inputBox" style="width:400px"  name="addr2">
				</td>
			</tr>
			<tr>
				<td ><span class="red">*</span>관심언어</td>
				<td> 
						<input type="checkbox" name="lang" value="java"> 자바
						<input type="checkbox" name="lang" value="C/C++"> C/C++
						<input type="checkbox" name="lang" value="VB"> 비주얼베이직 
						<input type="checkbox" name="lang" value="PyThon"> PyThon
						<input type="checkbox" name="lang" value="C#"> C#
				</td>
			</tr>
		</table>
		<br>
		<table>
			<tr align="center">
				<td><input type="button" value="확인" id="btnAdd" class="inputBtn">
				<input type="reset" value="취소" class="inputBtn"></td>
		</table>
	</form>

</body>
</html>