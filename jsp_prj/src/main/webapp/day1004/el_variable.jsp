<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="EL - 변수 사용." %>
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
String msg="오늘은 화요일 입니다.";
%>
<!-- EL에서는 변수를 직접 접근하여 출력할 수 없다. -->
메시지 : ${ msg }<br/>
<%
//EL에서는 변수를 Scope객체에 설정한 후 사용.
String pageMsg="페이지 scope에 설정";
//1. scope 객체에 값 설정
pageContext.setAttribute("pageMsg", pageMsg);
request.setAttribute("requestMsg", pageMsg);
session.setAttribute("sessionMsg", pageMsg);
application.setAttribute("applicationMsg", pageMsg);
%>

<!-- 2. EL에서 사용 -->
<!-- pageContext 객체를 EL에서는 pageScope으로 접근 -->
페이지 : ${ pageScope.pageMsg }<br/>
리퀘스트 : ${ requestScope.requestMsg }<br/>
세션 : ${ sessionScope.sessionMsg }<br/>
애플리케이션 : ${ applicationScope.applicationMsg }<br/>
<!-- EL에서 Scope객체는 생략하여 사용할 수 있다.-->
페이지 : ${ pageMsg }<br/>
리퀘스트 : ${ requestMsg }<br/>
세션 : ${ sessionMsg }<br/>
애플리케이션 : ${ applicationMsg }<br/>
<%
//scope 객체의 이름이 같다면 page -> request -> session -> application순으로 사용된다.
pageContext.setAttribute("name", "page 차차");
request.setAttribute("name", "req 차차");
session.setAttribute("name", "ses 차차");
application.setAttribute("name", "app 차차");
%>
${ name }
</body>
</html>








