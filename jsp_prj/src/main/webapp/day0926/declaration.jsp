<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
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
<%! // declartion: JSP에서 instance 변수, static변수, method를 선언할 때 사용.
	// JSP가 Jav로 변경될 때  _jspSecvice method가 아닌 class field에 코드가 생성된다
int i;
static int j;
public static final int MAX=100;

public String getName() {
	return "주주";
} 
%>

<mark><%=getName() %></mark>님 어서오고! <br>
instance variable: i사용 <%=i %> <br>
static variable: j사용 <%=j %><br>
constant 사용: <%=MAX %><br>

<!-- 1. java.util.List에 "정선홍", "유설빈", "정주은", "차승주", "송성우"를 넣고 반환하는 method를 만든다 -->
<%!

public List<String> getList() {
List<String> nameList=new ArrayList<String>();
nameList.add("정선홍");
nameList.add("유설빈");
nameList.add("정주은");
nameList.add("차승주");
nameList.add("송성우");
	return nameList;
}

%>

<!-- 2. method를 호출하여 input type="button"에 value로 설정하여 출력 -->
<%

List<String> nameList=getList();
for(int i=0; i<nameList.size(); i++) {%>
<input type="button" value="<%=nameList.get(i) %>" class="btn btn-warning">
<% }%>

</body>
</html>