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
<%
// ip주소가 211.63.89.133, 154, 140, 142, 143, 149, 152라면
//	"https://www.police.go.kr/index.do"로 이동하는 코드 작성
/* 	String ip=request.getRemoteAddr();
	if(ip.equals("211.63.89.133") || ip.equals("211.63.89.154") || ip.equals("211.63.89.140") || ip.equals("211.63.89.142") ||
			ip.equals("211.63.89.143") || ip.equals("211.63.89.149") || ip.equals("211.63.89.152")) {
		response.sendRedirect("https://www.police.go.kr/index.do");
		return;
	 }*/
	
String[] blockedIp= {"211.63.89.133", "211.63.89.154", "211.63.89.140", "211.63.89.142", "211.63.89.143", "211.63.89.149", "211.63.89.152"};
	 
	 String ip=request.getRemoteAddr();
	 for(String block:blockedIp) {
		 if(block.equals(ip)) {
			 response.sendRedirect("https://www.police.go.kr/index.do");
			 return;
		 }
	 }
	
%>
정상적인 요청이 있었을 때 보여줄 내용 <br>
<img src="images/redirect.png">

</body>
</html>