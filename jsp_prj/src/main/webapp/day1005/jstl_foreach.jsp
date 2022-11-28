<%@page import="java.util.Calendar"%>
<%@page import="java.sql.CallableStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL 인덱스를 사용하는 foreach" %>
<!-- taglib 지시자 선언 -->
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
$(function(){
	$("#cYear").change(function(){
		setSelDate();
	});
	$("#cMonth").change(function(){
		setSelDate();
	});
});//ready
function setSelDate(){
	$("#calFrm").submit();
}//setSelDate
</script>

</head>
<body>
<!-- JSTL에서 제공하는 태그 사용 -->
<%--
인덱스를 사용한 반복
<c:forEach var="변수명" begin="시작값" end="끝값" step="증가값">
${ 변수명 } 
</c:forEach>
 --%>
 <c:forEach var="i" begin="1" end="10" step="1">
 <c:out value="${ i }"/>
 </c:forEach>
 <!-- 1950에서 부터 현재 년도까지 1씩 증가하는 값을 select으로 작성. -->
 <%
 session.setAttribute("year", Calendar.getInstance().get(Calendar.YEAR));
 session.setAttribute("month", Calendar.getInstance().get(Calendar.MONTH)+1);
 session.setAttribute("lastDay", 
		 Calendar.getInstance().getActualMaximum(Calendar.DATE));
 session.setAttribute("day", 
		 Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
 %>
 
 <select>
 <c:forEach var="year" begin="1950" end="${ sessionScope.year }" step="1">
 <option value="${ year }"><c:out value="${ year }"/></option>
 </c:forEach>
 </select>년
 <!-- select 으로 1~12월까지를 출력 -->
 <select>
 <c:forEach var="month" begin="1" end="12" step="1">
 <option value="${ month }"${ month eq sessionScope.month?" selected='selected'":"" }><c:out value="${ month }"/></option>
 </c:forEach>
 </select>월
 <!-- select으로 1~마지막 일 까지 출력 -->
 <select>
 <c:forEach var="day" begin="1" end="${ lastDay }" step="1">
 <option value="${ day }"><c:out value="${ day }"/></option>
 </c:forEach>
 </select>일
 <%
 Calendar cal=Calendar.getInstance();// 시스템(서버)의 현재 날짜
 //선택한 날짜로 설정하여 변경.
 //파라메터를 받는다.
 String paramYear=request.getParameter("cYear");
 String paramMonth=request.getParameter("cMonth");
 
 if( paramMonth != null){
	 cal.set(Calendar.YEAR, Integer.parseInt(paramYear));//선택한 년으로 달력객체가 설정
	 cal.set(Calendar.MONTH,Integer.parseInt(paramMonth)-1);
 }//end if
 //변경된 년,월로 마지막 일자를 얻는다. 
 int selectYear=cal.get(Calendar.YEAR);
 int selectMonth=cal.get(Calendar.MONTH)+1;
 int lastDay=cal.getActualMaximum(Calendar.DATE);
 
 pageContext.setAttribute("sYear", selectYear);
 pageContext.setAttribute("sMonth", selectMonth);
 pageContext.setAttribute("sDay", lastDay);
 
 %>
 
 <div>
 <form name="calFrm" id="calFrm" action="jstl_foreach.jsp">
 <select name="cYear" id="cYear">
 <c:forEach var="year" begin="1950" end="${ sessionScope.year }" step="1">
 <option value="${ year }"${ year eq sYear?" selected='selected'":"" }><c:out value="${ year }"/></option>
 </c:forEach>
 </select>년
 <select name="cMonth" id="cMonth">
 <c:forEach var="month" begin="1" end="12" step="1">
 <option value="${ month }"${ month eq sMonth?" selected='selected'":"" }><c:out value="${ month }"/></option>
 </c:forEach>
 </select>월
 <select name="cDay" id="cDay">
 <c:forEach var="day" begin="1" end="${ sDay }" step="1">
 <option value="${ day }"><c:out value="${ day }"/></option>
 </c:forEach>
 </select>일
 </form>
 </div>
</body>
</html>








