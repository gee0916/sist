<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL의 core 사용" %>
<!-- 1. JSTL을 사용하기 위한 지시자 선언 -->
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
<!-- 2. JSTL에서 제공하는 태그 사용. -->
<%--
변수 선언. => 선언된 변수명은 EL에서 사용가능.
<c:set var="변수명" value="값"/>
변수 삭제.
<c:remove var="변수명"/>
변수 출력
<c:out value="값" /> => tag가 들어있지 않은 값을 출력 할 때.(tag를 그대로 출력)
<c:out value="값" escapeXml="false"/> => tag를 rendering 하여 보여줄 때.
 --%>
 변수 선언: 
 <% String msg="오늘은 <strong>수요일</strong> 입니다."; %>
 <c:set var="name" value="차차"/>
 <c:set var="age" value="20"/>
 <c:set var="msg" value="<%= msg %>"/>
 <br/>
  출력 :<br />
  이름 : ${ name }, 나이 : ${ age }<br/>
  &lt;c:out &gt;의 사용<br/>
  이름 : <c:out value="name"/>, 나이 : <c:out value="age"/><br/>
  &lt;c:out &gt;의 EL 사용<br/>
  이름 : <c:out value="${ name }"/>, 나이 : <c:out value="${ age }"/><br/>
  <c:out value="${ msg }"/><br/>
  <c:out value="${ msg }" escapeXml="false"/><br/>
  
  변수 삭제 : 삭제된 변수는 출력이 되지 않는다. <br/>
  <c:remove var="msg"/>
  이름 : <c:out value="${ name }"/><br/>
  메시지 : <c:out value="${ msg }"/><br/>
  
 
 </body>
</html>










