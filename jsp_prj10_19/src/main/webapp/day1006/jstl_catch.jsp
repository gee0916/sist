<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL 예외처리" %>
    <!-- 1. 지시자 선언 -->
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
<!-- 2. JSTL tag사용 -->
<%--
<c:catch> 는 <c:if>와 함께 사용.
-예외를 잡는 일만 
 : <c:catch var="예외처리객체명"> 예외발생예상코드</c:catch>
-예외처리 객체가 생성되었다면 예외가 발생한 것이고, 비교를 하여 예외발생 메시지를 출력.
<c:if test="예외처리객체명 ne null"> 예외가 발생 했을 때 처리할 코드 </c:if>
 --%>
 <c:catch var="e">
<%
// _jspService method 내에서는 try~catch 코드를 감싸고 있다. => 컴파일 예외에 대한
// 에러가 발생하지 않는다.
Class.forName("java.lang.String1");
%>
클래스 로딩 완료
</c:catch>
<c:if test="${ not empty e }">
예외발생 : 
<c:out value="${ e }"/>
</c:if>
</body>
</html>






