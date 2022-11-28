<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="스크립틀렛 연습"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap Css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap Js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script type="text/javascript">
function result(j,i) {
	alert(j+"*"+i+"="+j*i);
}
</script>
</head>
<body>
&lt;% scriptlet - JSP에서 method안 자바 코드를 정의할 때 사용하는  JSP태그 %&gt; <br>
<%
String[] subject={ "Java SE", "Oracle DBMS", "JDBC", "HTML", "CSS", "JavaScript", "JSP",
					"XML", "JSON", "AJAX", "Model2", "AWS", "MyBatis", "Spring"};
%>

<ul>
<% for(int i=0; i<subject.length; i++) {%>
<li> <%= subject[i] %> </li>
<%} %>
</ul>

<!-- <select>을 만들고 과목을 넣어서 보여준다
단, 현재 학습하고 있는 JSP과목을 선택해서 보여줄 것 -->
<select>
<% for(int i=0; i<subject.length; i++) {%>
<option <%=subject[i].equals("JSP")? "selected='selected'":"" %>> <%= subject[i] %> </option>
<%} %>
</select> <br>
<!-- 테이블을 만들고 구구단 전단의 식만 출력하고, 식을 클릭했을 때 경고창으로 연산 결과를 출력하는 코드를 작성  -->
<table class="table table-dark table-striped">
<% for(int i=1; i<=9; i++) {%>
<tr>
<% 		for(int j=2; j<=9; j++) {%>
<td><a href="#void" onclick="result(<%=j%>,<%=i%>)"><%=j %>X<%=i %></a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>