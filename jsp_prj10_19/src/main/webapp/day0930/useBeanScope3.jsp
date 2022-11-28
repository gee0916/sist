<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
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
<!-- useBean 액션태글르 사용하여 CounterVO를 cVO라는 객체명으로 생성 -->

<!-- 
page : 요청할 때마다 객체가 생성된다. 생성된 객체 이 JSP에서만 사용
request: 요청할 때마다 객체가 생성된다. forward로 이동한 페이지에서 객체를 사용
session: 접속자의 web browser마다 객체가 하나 생성되고, 모든 JSP에서 객체를 사용
application: 최초접속자에 의해 하나의 객체가 생성되고, 모든 접속자는 하나의 객체를 사용하게 된다.
 -->
<jsp:useBean id="cVO" class="kr.co.sist.vo.CounterVO" scope="application"></jsp:useBean>
<!-- setter 호출 -->
<jsp:setProperty property="cnt" name="cVO" value="1"/>
<!-- getter 호출 -->
당신은 이 페이지에 <strong><jsp:getProperty property="cnt" name="cVO"/></strong> 번째 접속자입니다. <br>

<div>
<!-- scriptlet을 사용하여 접속자의 숫자를 이미지로 출력 -->
<%
	String cnt=Integer.toString(cVO.getCnt());
	int cntImg=0;
	for(int i=0; i<cnt.length(); i++) {
		cntImg=cnt.charAt(i)-'0';
%>
	<img src="images/num_<%=cntImg %>.png">
<%
	}
%>
</div>
<a href="useBeanScope2.jsp">이동</a>

</body>
</html>