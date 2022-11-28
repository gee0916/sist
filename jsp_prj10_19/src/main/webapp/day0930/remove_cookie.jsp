<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="쿠키삭제" %>
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

</script>

</head>
<body>
<%
//쿠키삭제 : method가 없음. ( 비연결성의 특징 )
//1. 삭제하려는 이름의 쿠키를 생성.
Cookie cookieName=new Cookie("name","");
//2. 생존시간을 0으로 설정.
cookieName.setMaxAge(0);
//3. 쿠키 심기
response.addCookie( cookieName );
%>
쿠키 삭제 완료.
<a href="read_cookie.jsp">읽기</a>
</body>
</html>






