<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL if 사용" %>
<!-- 1. taglib 지시자 선언 -->
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
<!-- 2. JSTL에서 제공하는 태그  사용. -->
<c:if test="${ empty param.nick }">
아래의 링크를 클릭해주세요.<br/>
</c:if>
<c:if test="${ not empty param.nick  }">
<c:out value="${ param.nick }"/>님 어서오고!
</c:if>
<a href="jstl_if.jsp?nick=test">클릭</a><br/>

<c:if test="${ empty sessionScope.id }">
로그인 해주세요.<a href="jstl_if.jsp?id=chacha">로그인</a>
</c:if>
<c:if test="${ not empty param.id }">
<% session.setAttribute("id", request.getParameter("id")); %>
</c:if>
<c:if test="${ not empty sessionScope.id }">
<c:out value="${ id }"/>님 로그인 하셨습니다.
</c:if>
</body>
</html>








