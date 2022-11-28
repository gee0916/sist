<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="JSON Array Parsing"%>
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
	$("#btn").click(function() {
		$.ajax({
			url:"json_arr_process.jsp",
			type:"post",
			dataType:"json",
			error:function(xhr) {
				alert("문제: "+xhr.status);
			},
			success:function(jsonArr){
				/* for(var i=0; i<jsonArr.length; i++) {
					alert(jsonArr[i].id+"/"+jsonArr[i].name)
				} */
				/* $.each(jsonArr,function(i,jsonObj){
					alert(jsonObj["id]"+"/"+jsonObj["name"]);
				}); */
				//옵션의 갯수:length
				//alert($("#sel option").length)
				var sel=document.getElementById("sel");
				sel.length=1; //남아있을 옵션의 개수 설정
				//옵션 생성: select 컨트롤명.options[i]=new Option("보여질값", "value값");
				$.each(jsonArr,function(i,jsonObj){
					sel.options[i+1]=new Option(jsonObj["id"],jsonObj["name"]);
				})
			}
			
		})
	})
	
})
</script>
</head>
<body>
<div>
<input type="button" value="JSONArray Parsing" class="inputBtn" id="btn">
</div>
<select id="sel">
<option value="none">--선택--</option>
<option value="none">--선택--</option>
<option value="none">--선택--</option>
<option value="none">--선택--</option>
</select>
</body>
</html>