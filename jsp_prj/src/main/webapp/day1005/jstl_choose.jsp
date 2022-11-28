<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL choose" %>
 <!-- 1. tag lib 지시자 선언 -->
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
<!-- 2. JSTL에서 제공하는 태그 사용 -->
<%--
 <c:choose> : 여러 조건을 비교 할 때 사용.
 <c:choose>
 	<c:when test="비교조건">
 	   조건에 맞을 때 수행 코드
 	 </c:when>
 	 <c:when test="비교조건">
 	   조건에 맞을 때 수행 코드
 	 </c:when>
 	 .
 	  <c:otherwise>
 	  	모든 조건에 맞지 않을 때 수행 코드
 	  </c:otherwise>
 </c:choose>
 --%>
<a href="jstl_choose.jsp?grade=guest">손님</a>
<a href="jstl_choose.jsp?grade=user">사용자</a>
<a href="jstl_choose.jsp?grade=manager">관리자</a>
<div>
<c:if test="${ not empty param.grade }">
<img src="images/${ param.grade }.png">
</c:if>
<c:choose>
<c:when test="${ param.grade eq 'guest' }">
<a href="read.jsp">읽기</a>
</c:when>
<c:when test="${ param.grade eq 'user' }">
<a href="read.jsp">읽기</a> | 
<a href="write.jsp">쓰기</a> 
</c:when>
<c:when test="${ param.grade eq 'manager' }">
<a href="read.jsp">읽기</a> | 
<a href="write.jsp">쓰기</a> |
<a href="modify.jsp">변경</a> |
<a href="remove.jsp">삭제</a> 
</c:when>
<c:otherwise>
위의 링크를 클릭해주세요.
</c:otherwise>
</c:choose>
</div>


</body>
</html>








