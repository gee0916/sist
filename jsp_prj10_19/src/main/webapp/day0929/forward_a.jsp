<%@page import="kr.co.sist.vo.ImgVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="forward 방식의 페이지 전송"%>
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
//forward가 사용되는 페이지에서는 접속자에게 응답되지 않기 때문에
//뷰 코드를 만들지 않는다 => 업무로직이나 데이터 처리에 집중

//업무를 처리한 결과가 발생
String[] names= {"정주은", "정현지", "차승주", "송성우", "이유리", "홍아람"};
List<ImgVO> list=new ArrayList<ImgVO>();
list.add(new ImgVO("img_1.gif", "음.. 인정", "이 이미지는 긍정의 의미로 사용됩니다"));
list.add(new ImgVO("img_2.gif", "아차", "이 이미지는 아차 싶을 때 사용됩니다"));
list.add(new ImgVO("redirect.png", "redirect", "<strike> M자 탈모인의 선도주자 </strike>이 이미지로 redirect를 떠올리세요"));

//뷰페이지로 보내기위해 scope객체에 설정 (forward method가 호출되기전에만 하면됨)
request.setAttribute("names", names);
request.setAttribute("images", list);

//파라메터 받기
String move=request.getParameter("move");
String flag=request.getParameter("flag");
log("----------------------move param:"+move);
log("----------------------flag param:"+flag);

//1. 이동할 페이지 설정
RequestDispatcher rd=request.getRequestDispatcher("forward_b.jsp");

//2. 이동
rd.forward(request, response);
%>
<!-- <img src="images/img_1.gif"> -->
</body>
</html>