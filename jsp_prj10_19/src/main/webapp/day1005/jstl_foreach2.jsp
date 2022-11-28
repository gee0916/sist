<%@page import="kr.co.sist.vo.TestVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL List사용 foreach" %>
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
<%
//1. 배열  생성
String[] arr={"현대","기아","쉐보레","삼성","BENZ","BMW","AUDI"};
//2. scope객체에 할당.
pageContext.setAttribute("maker", arr);
%>
<%--
//배열, List반복
<c:forEach var="element 값을 저장할 변수명" items="${ 배열 또는 list명 }">
  ${ element 값을 저장할 변수명 }
 </c:forEach>
 --%>
 <c:forEach var="maker" items="${ maker }">
 <input type="radio" value="${ maker }" name="maker"/><c:out value="${ maker }"/>
 </c:forEach>
 <br/>
 <%
 //1. 리스트생성
 List<String> list=new ArrayList<String>();
 list.add("최정민");
 list.add("유설빈");
 list.add("정주은");
 list.add("차차승주");
 //2. EL에서 사용하기위해 scope객체에 값 할당
 pageContext.setAttribute("names", list);
 %>
 <!-- 3. JSTL을 사용하여 반복 -->
 <c:forEach var="name" items="${ names }">
 <input type="text" value="${ name }" class="inputBox"/>
 </c:forEach>
 <%
 //VO를 사용한 List
 //1. List 생성
 List<TestVO> voList=new ArrayList<TestVO>();
  voList.add(new TestVO("차승주",20));
 voList.add(new TestVO("최정민",21));
 voList.add(new TestVO("유설빈",22));
 voList.add(new TestVO("정선홍",23));
 voList.add(new TestVO("정주은",21)); 
 //2. EL에서 값을 사용하기위해 Scope 객체에 할당한다.
 pageContext.setAttribute("voList", voList);
 %>
 <table class="table table-hover" style="width: 400px">
 <tr>
 <th style="width: 100px">번호</th>
 <th style="width: 200px">이름</th>
 <th style="width: 100px">나이</th>
 </tr>
 <c:if test="${ empty voList }">
 <tr>
 <td colspan="2">조회결과가 없습니다.</td>
 </tr>
 </c:if>
<%-- List가 VO를 가지고 있다면
<c:forEach var="VO객체명" items="${ VO를가진 List }">
  ${ VO객체명.getter명 } // vo.getName() // Error 
    //name
 --%>
 <c:forEach varStatus="i" var="vo" items="${ voList }">
 <tr>
 <td><c:out value="${ i.count }"/>,<c:out value="${ i.index }"/>,${ i.last }, ${i.first } </td>
 <td><c:out value="${ vo.name }"/></td>
 <td><c:out value="${ vo.age }"/></td>
 </tr>
 </c:forEach>
 </table>
 
</body>
</html>










