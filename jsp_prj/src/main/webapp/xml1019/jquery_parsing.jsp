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
$(function() {
	$("#btn1").click(function() {
		$.ajax({
			url:"parsing.xml",
			dataType:"xml",
			error:function(xhr) {
				alert(xhr.status);
			},
			success:function(xml) {
				//<root>
				//<msg>이것이 파싱!!</msg>
				//</root>
				
				//입력된 XML문서를 1. jQueryObject에 설정하고 $(xml)
				//jQueryObject에서 제공하는 2. find함수를 사용하여 노드를 찾고, 
				//3. text함수를 사용하여 문자열을 파싱한다
				
				var parsingData=$(xml).find("msg").text();
				alert(parsingData)
			}
		})
	})
	
	$("#btn2").click(function() {
		
		$.ajax({
			url:"parsing2.xml",
			dataType:"xml",
			error:function(xhr) {
				alert(xhr.status);
			},
			success:function(xml) {
				//<root>
				//<msg>수요일</msg>
				//<msg1>목요일</msg1>
				//<msg>금요일</msg>
				//<msg>토요일</msg>
				//<msg>일요일</msg>
				//<msg1>월요일</msg1>
				//<msg>이것이 파싱</msg>
				//</root>
				
				//입력된 XML문서를 1. jQueryObject에 설정하고 $(xml)
				//jQueryObject에서 제공하는 2. find함수를 사용하여 노드를 찾고, 
				//3. each함수를 사용하여 찾아낸 모든 노드를 반복시키고
				//4. text함수를 사용하여 문자열을 파싱한다
				
				var output="";
				$(xml).find("msg").each(function(i, ele) {
					output+= $(ele).text()+"<br/>";
				})
				$("#output").html(output);
			}
		})
		
	})
})

function setURL(){
	$.ajax({
		url:"news_title.jsp",
		dataType:"xml",
		error:function( xhr ){
			console.log("select 문제 : "+ xhr.status)
		},
		success:function( xml ){
			var sel=document.getElementById("news");
			$( xml ).find("data").each(function(i, data){
				sel.options[i+1]=new Option( $(data).find("title").text(), $(data).find("url").text());
			})
		}
	});//ajax
	
}//setURL
</script>
</head>
<body>
<div id="control">
<input type="button" value="자식노드 하나일때" class="btn" id="btn1"/>
<input type="button" value="자식노드 여러개일때" class="btn" id="btn2"/>
<br>
<!-- 페이지가 로딩되면 news_title.jsp를 호출하여 select에 설정 -->
<select id="news" onclick="setURL();">
<option>-- 뉴스 목록 --</option>
</select>
</div>
<div id="output"></div>
</body>
</html>