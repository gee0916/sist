<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="suggest 폼"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.130/jsp_prj/common/css/main_v1_220901.css"/>
<style type="text/css">
#wrap{ margin:0px auto; width: 1005px;height: 778px;}
#bgImg{  width: 1005px;height: 778px; position: relative;}
#suggestDiv{ position: absolute; top:51px; left: 147px; width: 438px}
#suggestView{ position: absolute; top:96px; left: 147px; display:none; 
					background-color: #FFFFFF; width: 438px;
					border: 1px solid #333				
}
td{ 	font-size: 25px; height: 30px }
</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- Bootstrap JS -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<script type="text/javascript">
$(function(){
	$("#suggest").keyup(function( evt ){
		if($("#suggest").val().length > 0){
			$.ajax({
				url:"suggest_process.jsp",
				data:"keyword="+$("#suggest").val(),
				type:"get",
				dataType:"json",
				error:function( xhr ){
					console.log("에러발생 : "+ xhr.status);
				},
				success:function( jsonObj ){
					if( !jsonObj.isEmpty ){
						$("#suggestView").show();
						
						var output="<table>";
						$(jsonObj.data).each(function( i, json){
							output+="<tr><td onclick=\"setKey('"+json.keyword+"')\">"
							+json.keyword+"</td></tr>";
						});
						output+="</table>";
						
						$("#suggestView").html( output );
					}else{
						$("#suggestView").hide();
					}//end else
				}//end if
			});//ajax
		}//end if
	});//keyup
});//ready

function setKey( keywork ){
	$("#suggest").val( keywork );
	$("#suggestView").hide();
}//setKey
</script>

</head>
<body>
<div id="wrap">
<div id="bgImg">
<img src="images/bg.png"/>
<div id="suggestDiv">
<input type="text" name="suggest" id="suggest" style="width: 438px;height: 43px" autofocus="autofocus" />
</div>
<div id="suggestView"></div>
</div>
</div>
</body>
</html>