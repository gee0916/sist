<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">
#get, #post{ border:1px solid #333; width: 400px; height: 350px; margin-bottom: 10px;
  padding-left: 15px }
</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- Bootstrap JS -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script type="text/javascript">
$(function(){
	$("#getBtn").click(function(){
		$("#getHid").val("get방식의 히든");
		$("#getFrm").submit();
	});
	$("#postBtn").click(function(){
		$("#postHid").val("post방식의 히든");
		$("#postFrm").submit();
	});
});//ready
</script>

</head>
<body>
<div>
name 속성이 유일한 HTML Form Control의 값 전송연습.
</div>
<div id="get">
<strong><span class="badge bg-secondary">GET방식의 전송</span></strong>
<form method="get" action="get_parameter_form_process.jsp" id="getFrm" >
<label>text</label>
<input type="text" name="text" class="inputBox"/><br/>

<label>password</label>
<input type="password" name="pwd" class="inputBox"/><br/>

<label>hidden</label>
<input type="hidden" name="hid" id="getHid" /><br/>

<label>checkbox</label>
<input type="checkbox" name="cb" value="확인"/>확인<br/>

<label>radio</label>
<input type="radio" name="gender" value="남자"/>남자
<input type="radio" name="gender" value="여자"/>여자
<br/>

<label>select</label>
<select name="sel">
<option value="자바">Java</option>
<option value="오라클">Oracle</option>
<option value="HTML">HTML</option>
</select>
<br/>
<label>color</label>
<input type="color" name="col"/><br/>

<label>textarea</label>
<textarea name="ta" class="inputBox" style="width: 300px;height: 100px"></textarea>
<br/>
<input type="button" value="GET방식전송" class="inputBtn" id="getBtn"/>
</form>

</div>
<div id="post">
<strong><span class="badge bg-secondary">POST방식의 전송</span></strong>
<form method="post" action="get_parameter_form_process.jsp" id="postFrm" >
<label>text</label>
<input type="text" name="text" class="inputBox"/><br/>

<label>password</label>
<input type="password" name="pwd" class="inputBox"/><br/>

<label>hidden</label>
<input type="hidden" name="hid" id="postHid"  /><br/>

<label>checkbox</label>
<input type="checkbox" name="cb" value="확인"/>확인<br/>

<label>radio</label>
<input type="radio" name="gender" value="남자"/>남자
<input type="radio" name="gender" value="여자"/>여자
<br/>

<label>select</label>
<select name="sel">
<option value="자바">Java</option>
<option value="오라클">Oracle</option>
<option value="HTML">HTML</option>
</select>
<br/>
<label>color</label>
<input type="color" name="col"/><br/>

<label>textarea</label>
<textarea name="ta" class="inputBox" style="width: 300px;height: 100px"></textarea>
<br/>
<input type="button" value="POST방식전송" class="inputBtn" id="postBtn"/>
</form>

</div>

</body>
</html>