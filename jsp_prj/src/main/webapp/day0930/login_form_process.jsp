<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="VO를 사용한 파라메터 처리" %>
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
request.setCharacterEncoding("UTF-8");
%>
<!-- 1. parameter 받을 VO 생성 -->
<%-- <jsp:useBean id="객체명" class="객체화할 클래스" scope=""/> --%>
<jsp:useBean id="lVO" class="kr.co.sist.vo.LoginVO" />
<!-- 2. VO에 setter method(property) 호출 -->
<%-- <jsp:setProperty name="객체명" property="*"/> --%>
<jsp:setProperty property="*" name="lVO"/>
<%-- 입력 값 : <%= lVO %> --%>
아이디 : <jsp:getProperty property="id" name="lVO"/><br/>
비번 : <jsp:getProperty property="password" name="lVO"/><br/>
OS : <jsp:getProperty property="os" name="lVO"/><br/>
</body>
</html>






