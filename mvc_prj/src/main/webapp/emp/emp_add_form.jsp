<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="EmpFormAction에서 보내온 데이터르 사용하여 보여주는 일"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">
td, th{font-size:  20px; height: 30px;}
</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap Css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap Js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script type="text/javascript">
$(function() {
	$("#btn").click(function() {
		var empno=$("#empno").val();
		var ename=$("#ename").val();
		var mgr=$("#mgr").val();
		
		if(empno.trim() == "") {
			alert("사원번호는 필수입력!!");
			$("#empno").focus();
			return;
		}
		
		if(ename.trim() == "") {
			alert("사원명은 필수입력!!");
			$("#ename").focus();
			return;
		}
		
		if(mgr.trim() == "") {
			alert("매니저번호는 필수입력!!");
			$("#mgr").focus();
			return;
		}
		
		if(empno.replace(/[0-9]/g,"")!="") {
			alert("사원번호는 숫자로만 구성됩니다.");
			$("#empno").val();
			$("#empno").focus();
			return;
		}
		
		if(mgr.replace(/[0-9]/g,"")!="") {
			alert("매니저번호는 숫자로만 구성됩니다.");
			$("#mgr").val();
			$("#mgr").focus();
			return;
		}
		
		if(ename.replace(/[a-zA-Zㄱ-힣]/g,"")!="") {
			alert("사원명은 문자열로만 구성됩니다.");
			$("#ename").val();
			$("#ename").focus();
			return;
		}
		
		$("#empFrm").submit();
		
	})
})
</script>
</head>
<body>
<form action="emp_add_process.do" method="post" name="empFrm" id="empFrm">
<input type="hidden" name="cmd" value="E0002"/>
<table>
<tr>
<th colspan="2" align="center">사원정보입력</th>
</tr>
<tr>
	<td>부서번호</td>
	<td>
	<select name="deptno">
	<c:forEach var="deptno" items="${deptData }">
	<option value=${deptno }><c:out value="${deptno }"/></option>
	</c:forEach>
	</select>
	</td>
</tr>
<tr>
	<td>사원번호</td>
	<td><input type="text" name="empno" id="empno" class="inputBox"/></td>
</tr>
<tr>
	<td>사원명</td>
	<td><input type="text" name="ename" id="ename" class="inputBox"/></td>
</tr>
<tr>
	<td>매니저번호<td>
	<td><input type="text" name="mgr" id="mgr" class="inputBox"/></td>
</tr>
<tr>
	<td colspan="2">
		<input type="button" id="btn" class="inputBtn" value="입력"/>
		<input type="reset" class="inputBtn" value="초기화"/>
	</td>
</tr>
</table>
</form>
</body>
</html>