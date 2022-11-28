<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="useBean action tag 사용" %>
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
<!-- 1. 객체생성 : 기본생성자를 사용 -->
<jsp:useBean id="tVO" class="kr.co.sist.vo.TestVO" scope="page"/>
<!-- 2. setter method 호출 -->
<jsp:setProperty property="name" name="tVO" value="차차"/>
<jsp:setProperty property="age" name="tVO" value="20"/>
<!-- 3. getter method 호출 -->
이름 : <jsp:getProperty property="name" name="tVO"/><br/>
나이 : <jsp:getProperty property="age" name="tVO"/><br/>
<div>
useBean태그의 id는 객체명이므로 자바코드에서 객체를 사용할 수 있다.<br/>
<%
tVO.setName("송성우");
tVO.setAge(21);
%>
이름 : <%= tVO.getName() %><br/>
나이 : <%= tVO.getAge() %><br/>
</div>
</body>
</html>











