<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="AJAX사용"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">
#divBtn{height: 40px;}
#output{height: 100px;}
</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap Css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap Js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<!--  동기식 200-응답성공
$.ajax({
	url:"요청할 URL",
	type:"요청방식 - GET, POST",
	data: "QueryString",
	async:"비동기 동작여부 true, false",
	dataType:"서버에서 응답되는 형식",
	error:function(xhr) {
		xhr.status - 에러코드를 볼때, xhr.status.Text - 에러의 텍스트
		404-페이지없음, 500-코딩 에러,
		200-응답은 성공적이나 응답된 데이터가 파싱할 수 없는 형태
	},
	success:function(data) {
		응답성공 했을 때 처리할 코드
	}
});
 -->
<script type="text/javascript">
$(function() {
	
	//text 요청
	$("#btnTxt").click(function() {
		$.ajax({
			url:"response_text.txt",
			type:"get",
			dataType:"text",
			error:function(xhr) { //xhr => XMLHttpRequest
				alert("에러발생:"+xhr.status+"/"+xhr.statusText);
			},
			success:function(data) {
				var arr=data.split(","); //데이터를 잘라서
				
				//화면을 구성할 내용을 만들고
				var output="<ul>";
				for( var i = 0 ; i < arr.length ; i++){
					output +="<li>"+ arr[i]+"</li>";
				}//end for
				 output+="</ul>";
				
				//웹브라우저에 출력
				$("#output").html( output );
			}//success
		});//ajax
	})//click
	
	//html요청
	$("#btnHtml").click(function() {
		$.ajax({
			url:"response_html.html",
			type:"get",
			async:"true",
			dataType:"html",
			error: function(xhr) {
				$("#output").html("에러발생:" +xhr.status+"/"+xhr.statusText);
			},
			success:function(data) {
				$("#output").html(data);
			}
		})
	})
	
	//json 요청
	$("#btnJson").click(function() {
		$.ajax({
			url:"response_json.json",
			dataType:"json",
			error:function( xhr ){
				console.log( " JSON에러 :"+ xhr.status );
			},
			success:function( data ){
				var output ="";
				output+="이름 : <strong>"+ data.name +"</strong><br/>";
				output+="나이 : <strong>"+ data.age +"</strong><br/>";
				output+="주소 : <strong>"+ data.addr +"</strong><br/>";
				
				$("#output").html( output );
			}
 		})
	})
	
	//xml요청
	$("#btnXml").click(function() {
		$.ajax({
			url:"response_xml.xml",
			dataType:"xml",
			error:function(xhr){
				$("#output").html("XML문제 발생:"+xhr.status);
			},
			success:function(data){
				var output="";
				output+= $( data ).find("msg").text(); //parsing
				
				$("#output").html( output );
			}
		})
	})
	
})//ready
</script>

</head>
<body>
<div id="divBtn">
<input type="button" value="text요청" class="inputBtn" id="btnTxt"/>
<input type="button" value="HTML요청" class="inputBtn" id="btnHtml"/>
<input type="button" value="JSON요청" class="inputBtn" id="btnJson"/>
<input type="button" value="XML요청" class="inputBtn" id="btnXml"/>
</div>
<div id="output">

</div>
<div id="footer">
<img src="http://localhost/jsp_prj/day1007/images/id_background.png">
</div>
</body>
</html>