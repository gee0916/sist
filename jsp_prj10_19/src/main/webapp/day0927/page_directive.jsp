<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="페이지지시자의 사용법"
    isThreadSafe="true" session="true" buffer="8kb" autoFlush="true" 
    isELIgnored="true" 
    errorPage="error_process.jsp"
    import="java.util.Date, java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap Css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap Js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script type="text/javascript">
</script>
</head>
<body>
EL의 사용 : 9+27=${9+27}

<%
String className="java.lang.String";
if(new Random().nextBoolean()){
	className="java.lang.String1";
}

Class cla=Class.forName(className);

%>
로딩된 클래스 : <%=cla %> <br>

<%
Date d=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd EEEE");
%>
<%=sdf.format(d) %>
</body>
</html>