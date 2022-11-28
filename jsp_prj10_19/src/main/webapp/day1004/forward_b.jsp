<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="디자인에 집중하는 JSP" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.130/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- Bootstrap JS -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		$("#forwardFrm").submit();
	});
	setSelect("<%= request.getParameter("group") %>");
});//ready

function setSelect( paramData ){
	if( paramData != null ){
		var select= paramData.charAt(6);
		$("#group option:eq("+ (select-1)+")").prop("selected",true);
	}//end if
}//setSelect
</script>

</head>
<body>
<form action="forward_a.jsp" method="get" id="forwardFrm">
<select name="group" class="inputBox" id="group">
<option value="group_1">1조 - 송성우</option>
<option value="group_2">2조 - 최정민</option>
<option value="group_3">3조 - 홍다영</option>
</select>
<input type="button" value="조원검색" id="btn" class="inputBtn"/>
</form>
<div style="width: 300px">
<%
String[] gm=(String[])request.getAttribute("gm");
if( gm == null){
	out.println("조원 검색을 수행해주세요.");
}else{
	%>
	<table class="table table-hover">
	<tr>
		<th>번호</th><th>이름</th>
	</tr>
	<%
	for(int i=0 ; i <gm.length ; i++){
	%>
	<tr>
		<td><%= i+1 %></td>
		<td><%= gm[i] %></td>
	</tr>
	<%
	}//end for
	%>
	</table>
	<%
}//end 
%>
</div>
<div>
오늘 메시지 "<strong><%= request.getParameter("todayMsg") %></strong>"
</div>
</body>
</html>







