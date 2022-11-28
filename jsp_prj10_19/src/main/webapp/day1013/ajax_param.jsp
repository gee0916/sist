<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="AJAX param"%>
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
	$("#btnQuery").click(function(){
	
		var name=$("#name").val();
		var age=$("#age").val();
		// QueryString으로 Web Parameter 전달
		var param="msg=QueryString형식&name="+name+"&age="+age;
		
		$.ajax({
			url:"ajax_param_process.jsp",
			type:"get",
			data: param,
			dataType:"json", //서버에서 응답되는 데이터를 눈으로 확인 할 때에는 text로 설정.
			error:function( xhr ){
				alert("죄송합니다. 잠시 후 다시 시도.");
				console.log("에러 : "+ xhr.status);
			},
			success: function( jsonObj ){
				//JSONObject Parsing
				// 문법 : JSONObject.이름
				//서버에서 응답된 데이터를 파싱하여 설정한다.
				$("#msg").val( jsonObj.msg );
				$("#bYear").val( jsonObj.bYear );
				
				//파싱데이터로 문자열을 설정 
				$("#msgOutput").text( jsonObj.msg );
				
				for( var i= 0 ; i < 10 ; i++){
				$("#msgOutput").fadeIn(500).fadeOut(500);
				}//end for
			}//success
		});//ajax
		
	});//click
	
	$("#btnJson").click(function(){
		var name=$("#name").val();
		var age=$("#age").val();
		
		// JSONObject으로 Web Parameter 전달
		var jsonParam={ "msg":"JSONObject으로 Web Parameter 전달",
				"name":name ,"age":age};
		$.ajax({
			url:"ajax_param_process.jsp",
			type:"get",
			data: jsonParam,
			dataType:"json",
			error:function( xhr ){
				alert("죄송합니다. 잠시 후 다시 시도.");
				console.log("에러 : "+ xhr.status);
			},
			success: function( jsonObj ){
				//서버에서 응답된 데이터를 파싱하여 설정한다.
				$("#msg").val( jsonObj.msg );
				$("#bYear").val( jsonObj.bYear );
				//msgOutput2에 응답된 msg를 파싱하여 흘러가는 글자로 출력
				
				$("#bYear").html("<marquee scrollamount='10'>"+jsonObj.msg+"</marguee>")
			}
		});//ajax
		
		
	});//click
});//ready
</script>

</head>
<body>
<div>
<label>이름</label><input type="text" name="name" class="inputBox" id="name"/>
<br/>
<label>나이</label><input type="text" name="age" class="inputBox" id="age"/>
<br/>
<input type="button" value="QueryString입력" class="inputBtn" id="btnQuery"/>
<input type="button" value="JSON입력" class="inputBtn" id="btnJson"/>
</div>
<div id="output">
<strong>결과 창</strong>
<input type="text" name="msg" class="inputBox" id="msg"/>
<span id="msgOutput"></span>
<br/>
<input type="text" name="bYear" class="inputBox" id="bYear"/>
<div id="msgOutput2"></div>
</div>
</body>
</html>