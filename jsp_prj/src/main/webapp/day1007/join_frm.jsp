<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
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
	
	//아이디 중복확인 창
	$("#btnDup").click(function(){
		window.open("id_dup.jsp","id_dup","width=510,height=310")
	});//click
	
	//우편번호 찾기
	$("#btnZip").click(function(){
		 findZipcode();
	});//click
	
});//ready

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
<!-- 다음 우편번호 API 시작-->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function findZipcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('zipcode').value = data.zonecode;
                document.getElementById("addr1").value = roadAddr;
                document.getElementById("addr2").focus();
            }//oncomplete
        }).open();
    }
</script>
<!-- 다음 우편번호 API 끝-->
<script type="text/javascript">
$(function() {
	$("#btnDup2").click(function(){
		//AJAX로 아이디 중복확인 10-13-2022 코드 추가
		var id=$("#id2").val();
		if(id.trim()=="") {
			alert("아이티 필수 입력");
			$("#id2").focus();
			return;
		}//end if
		let paramJson={"id":id};
		
		$.ajax({
			url:"http://localhost/jsp_prj/day1013/ajax_id_dup.jsp",
			data: paramJson,
			type:"post",
			dataType:"json",
			error:function(xhr){
				alert("문제가 발생했습니다. 잠시 후 다시 시도해 주세요.");
				console.log("id 중복 검사중 문제 발생:"+xhr.status);
			},
			success:function(jsonObj) {
				let msg="<strong>사용중인 아이디</strong>";
				let color="#FF0000";
				if(! jsonObj.idFlag) { //파싱한 값
					msg="사용가능"
					color="#0000FF";
				}//end else
				$("#idResult").html(msg);
				$("#idResult").css("color",color);
				
				for(var i=0; i<8; i++) {
					$("#idResult").fadeIn(500).fadeOut(500);
				}//end for
				
				if(msg=="<strong>사용중인 아이디</strong>"){
					$("#idResult").fadeIn(500);
				}
			}
		});//ajax
	})
})
</script>
</head>
<body>
<a href="#void">링크</a>
<h2>회원가입</h2>
	<form method="post" name="memberFrm" action="join_bean_process.jsp" id="memberFrm">
	
		<table border="0">
			<tr>
				<td ><span class="red">*</span>아이디</td>
				<td><input type="text" name="id" id="id" class="inputBox" readonly="readonly">
						<input type="button" value="중복확인" class="inputBox" id="btnDup"/>
				</td>
			</tr>
			<tr>
				<td ><span class="red">*</span>아이디</td>
				<td><input type="text" name="id2" id="id2" class="inputBox">
						<input type="button" value="중복확인" class="inputBox" id="btnDup2"/>
						<span id="idResult"></span>
				</td>
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
				<td>
				<input type="text" class="inputBox"  name="zipcode" id="zipcode" readonly="readonly">
				<input type="button" value="우편번호찾기" class="inputBtn" id="btnZip"/>
				</td>
			</tr>
			<tr>
				<td ><span class="red">*</span>주소</td>
				<td><input type="text" class="inputBox" style="width:400px" name="addr1" id="addr1" readonly="readonly"> <br> 
						<input type="text" class="inputBox" style="width:400px"  name="addr2" id="addr2">
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