<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style type="text/css">

</style>
<script type="text/javascript">
$(function(){
	$("#btnGet").click(function(){
		var num=parseInt(Math.random()*2);
		
		if(num==0){
			alert("유효성검증실패");
			return;
		}
		$("getFrm").submit(); //유효성검증후 전송
	});
	
	$("#getLoc").click(function(){
		if(confirm("이동하시겠습니까?")){
			location.href="http://localhost/jsp_prj/day0927/respone.jsp";
		}
	});
	
	$("#btnPost").click(function(){
		$("#postFrm").submit();
	});
});
</script>
</head>
<body>
<div id = "get">
<strong>get방식의 요청</strong>
링크 : <a href="http://localhost/jsp_prj/day0927/respone.jsp">요청</a>
폼태그 : <!-- form태그의 method 속성은 생략되면 get -->
<form method="get" id="getFrm" action="http://localhost/jsp_prj/day0927/respone.jsp">
<input type="button" value="요청"  class="btn btn-light" id="btnGet"/>
</form><br/>
자바스크립트 :
<a href="#void" id ="getLoc">location</a>
</div>
<div id="post">
<strong>post방식의 요청</strong>
<form method="post" id="postFrm" action="http://localhost/jsp_prj/day0927/respone.jsp">
<input type="button" value="요청"  class="btn btn-danger" id="btnPost"/>
</form>
</div>


</body>
</html>