<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL forTokens" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
//Data
String csvData="차승주,정주은,홍아람,정현지,이유리,송성우~최정민.정선홍.하지윤.유원준.유설빈";
//scope 객체에 할당
pageContext.setAttribute("csvData", csvData);
%>
<%--
//CSV데이터를 토큰으로 잘라 반복시킬 때
<c:forTokens var="변수명" items="CSV데이터" delims="기준으로 자를 문자">
 ${ 변수명 } // CSV데이터가 토근으로 구분된 값
 </c:forTokens> 
--%>
<ul>
<c:forTokens var="data" items="${ csvData }" delims=",.~">
<li><c:out value="${ data }"/></li>
</c:forTokens>
</ul>

</body>
</html>







