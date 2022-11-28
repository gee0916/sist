<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="EL을 사용한 파라메터 출력" %>
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

</script>

</head>
<body>
<div>
<% request.setCharacterEncoding("UTF-8"); %>
이름 : ${ param.name }<br/>
나이 : ${ paramValues.age[0] } , ${ paramValues.age[1] }<br/>
${ param.name == null?"아래 링크를 클릭해주세요": "" }<br>
<!-- 현재 페이지로 name이 "차차"가 넘어갈 수 있도록 링크를 만들어 보세요 -->
<a href="el_param.jsp?name=차차&age=20&age=21">이름보기</a>
</div>
<div>
이름 : ${ param.name }<br/>
나이 : ${ paramValues.age[0] } , ${ paramValues.age[1] }<br/>
${ empty param.name ?"아래 링크를 클릭해주세요": "" }<br>
<!-- 현재 페이지로 name이 "차차"가 넘어갈 수 있도록 링크를 만들어 보세요 -->
<a href="el_param.jsp?name=chacha&age=19&age=20">이름보기</a>
</div>
<div>
<form action="el_param.jsp" method="post">
<input type="hidden" name="name" value="차차"/>
<label> 나이</label> <input type="checkbox" name="age" value="30"/>30
 <input type="checkbox" name="age" value="31"/>31
 <input type="checkbox" name="age" value="32"/>32
<br/>
<input type="submit" value="전송" />
</form>
</div>
</body>
</html>






