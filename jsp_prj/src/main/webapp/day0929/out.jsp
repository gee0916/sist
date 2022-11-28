<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
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
</script>
</head>
<body>
<%
//out 객체를 사용하지 않고 1~10까지 출력 (scriptlet을 끊고 다시 열어야한다)
for(int i =1; i< 11; i++) { %>
<%=i %>
<%} %>
<hr>

<%
//out 객체를사용하여 1 ~ 10 까지 출력( scriptlet을 끊지 않고 사용가능)
for(int i=1; i<11; i++) {
	out.println(i);
}
%>
<hr>
<%
String name="차차";
out.print(name); //print는 출력 후 줄 변경하지 않는다
%> 맨
<hr>
도와줘요~ <%
out.println(name); //println은 출력 후 줄 변경을 한다
%> 맨
<hr>
<% 
String flag=request.getParameter("flag");
if(flag==null) { //최초호출이니? 또는 이름에 해당하는 파라메터가 없니?
		out.println("아래 이미지 링크를 크릭해 주세요");
}else {
		out.print("<img src='images/img_");
		out.print(flag);
		out.println(".gif'/>");
}//end else
%>
<br>
<a href="out.jsp?flag=1">1번 이미지</a>
<a href="out.jsp?flag=2">2번 이미지</a>
</body>
</html>