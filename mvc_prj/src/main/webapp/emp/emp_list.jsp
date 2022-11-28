<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="사원리스트"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
$(function(){
	
	$("#btn").click(function(){
		chkNull();
	});//click
	
	$("#keyword").keydown(function( evt ){
		if(evt.which == 13 ){
			chkNull();
		}//end if
	});//click
});//ready

function chkNull(){
	var keyword=$("#keyword").val();
	if( keyword.trim() == ""){
		alert("검색어는 필수 입력");
		return;
	}//end if
	
	var selVal=$("select[name=fieldName]").val();
	var value=$("#keyword").val();
	
	if(selVal=="1") {
		
	}
	
	
	$("#frm").submit();
}//chkNull

</script>
</head>
<body>
currentPage - 현재페이지: <c:out value="${ currentPage }"/><br>
totalCount - 총 게시물 수: <c:out value="${ totalCount }"/><br>
pageScale - 한 화면에 보여줄 게시물 수: <c:out value="${ pageScale }"/><br>
totalPage - 총 페이지 수: <c:out value="${ totalPage }"/><br>
startNum - 페이지 시작 번호: <c:out value="${ startNum }"/><br>
endNum - 페이지 끝 번호: <c:out value="${ endNum }"/><br>

<div style="width: 800px; height: 400px;">
<table class="table table-hover">
<tr>
	<th style="width: 70">번호</th>
	<th style="width: 350">사원명(사원번호)</th>
	<th style="width: 130">매니저번호</th>
	<th style="width: 100">부서번호</th>
	<th style="width: 150">입사일</th>
</tr>
<c:if test="${dataResult }">
<tr>
	<td colspan="5">조회된 사원 정보가 없습니다.</td>
</tr>
</c:if>
<c:forEach varStatus="i" var="emp" items="${dataList }">
<tr>
	<td><c:out value="${totalCount-((currentPage-1)*pageScale+i.index) }"/></td>
	<td>
		<strong><c:out value="${emp.ename }"/></strong>
		(<c:out value="${emp.empno }"/>)
	</td>
	<td><c:out value="${emp.mgr }"/></td>
	<td><c:out value="${emp.deptno }"/></td>
	<td><fmt:formatDate value="${emp.hiredate }" pattern="yyyy-MM-dd EEEE"/></td>
</tr>
</c:forEach>
</table>
</div>

<div style="text-align: center;">
<a href="emp_search.do?cmd=S0001">전체글</a><br>
<form action="emp_search.do" method="post" name="frm" id="frm">
<input type="hidden" name="cmd" value="S0001"/>
<select name="fieldName">
<option value="1" ${param.fieldName eq '1'? "selected='selected'":"" }>사원명</option>
<option value="2" ${param.fieldName eq '2'? "selected='selected'":"" }>부서번호</option>
<option value="3" ${param.fieldName eq '3'? "selected='selected'":"" }>매니저번호</option>
</select>
<input type="text" name="keyword" class="inputBox" id="keyword">
<input type="text" style="display: none">
<input type="button" value="검색" class="inputBox" id="btn">
</form>
</div>


<div style="text-align: center;">
<c:forEach var="i" begin="1" end="${totalPage }" step="1" >
[<a href="emp_search.do?cmd=S0001&current_page=${i }&fieldName=${param.fieldName}${not empty param.keyword ? '&keyword=':''}${param.keyword }"><c:out value="${i }"/></a>]
</c:forEach>

</div>
</body>
</html>