<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="쿠키 심기" %>
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
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- Bootstrap JS -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script type="text/javascript">
</script>

</head>
<body>
<% 
//쿠키심기
//1. 쿠키생성
Cookie nameCookie=new Cookie("name","chacha");
Cookie ageCookie=new Cookie("age","20");
//2. 쿠키생존시간 설정 ( 브라우저가 열려있는 동안까지만 유지)
nameCookie.setMaxAge(60*60*24*1);
ageCookie.setMaxAge(60*60*24*1);
//3. 쿠키 심기( 출력 스트림)
response.addCookie(nameCookie);
response.addCookie(ageCookie);
%>
쿠키 심기 완료<br>
쿠키 <a href="read_cookie.jsp">읽기</a>
</body>
</html>






