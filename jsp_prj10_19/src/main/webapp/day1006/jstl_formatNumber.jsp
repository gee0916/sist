<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.sist.vo.ProductVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSTL FMT" %>
<!--  fmt를 사용하기위한 지시자 선언 
 uri="http://java.sun.com/jsp/jstl/fmt"
-->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
int price=2022;
pageContext.setAttribute("price", price);
%>
0패턴 사용 : <br/>
<fmt:formatNumber pattern="0,000,000" value="${ price }"/><br/>
#패턴 사용 : <br/>
<fmt:formatNumber pattern="#,###,###" value="${ price }"/><br/>
<%
List<ProductVO> list=new ArrayList<ProductVO>();
list.add(new ProductVO("초코쿠키","초콜렛 칩이 한가득...","guest.png",24000));
list.add(new ProductVO("오렌지쿠키","생오렌지를 갈아서 한가득...","user.png",5900));
list.add(new ProductVO("블루베리치즈","블루베리와 치즈가 ...","manager.png",50000));

pageContext.setAttribute("prdList", list);
%>
<div class="row">
<c:forEach var="prd" items="${ prdList }">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
      	<img src="../day1005/images/${ prd.img }"/>
        <h5 class="card-title"><c:out value="${ prd.name }"/></h5>
        <p class="card-text">
        설명 : <c:out value="${ prd.info }"/><br>
        가격 : \<fmt:formatNumber pattern="#,###,###" value="${ prd.price }"/>
        </p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
</c:forEach>
  
</div>
</body>
</html>








