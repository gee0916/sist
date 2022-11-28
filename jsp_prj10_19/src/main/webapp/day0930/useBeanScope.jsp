<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="scope 특성." %>
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
<!-- useBean 액션태그를 사용하여 CounterVO 를 cVO 라는 객체명으로 생성. -->
<!-- 
page : 요청할 때마다 객체가 생성된다. 생성된 객체 이 JSP에서만 사용.
request : 요청할 때마다 객체가 생성된다. forward로 이동한 페이지에서 객체를 사용.
session : 접속자의 web browser마다 객체가 하나생성되고, 모든 JSP에서
            객체를 사용할 수 있다.     
application : 최초접속자에 의해 하나의 객체가 생성되고, 모든 접속자는
   				하나의 객체를 사용하게된다.            
 -->
<jsp:useBean id="cVO" class="kr.co.sist.vo.CounterVO" scope="application"/>
<!-- setter 호출 -->
 <jsp:setProperty property="cnt" name="cVO" value="1"/>
<!-- getter호출 -->
당신은 이 페이지에 <strong><jsp:getProperty name="cVO" property="cnt"/></strong>
번째 접속자 입니다.<br>
<div>
<!-- scriptlet을 사용하여 접속자의 숫자를 이미지로 출력. -->
<%
String cnt=String.valueOf(cVO.getCnt());
for(int i=0 ; i < cnt.length() ; i++){
%>
<img src="images/num_<%= cnt.charAt(i) %>.png"/>
<%
}//end for
%>
</div>

<a href="useBeanScope2.jsp">이동</a>
</body>
</html>







