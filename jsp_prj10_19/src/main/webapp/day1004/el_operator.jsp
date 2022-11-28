<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="EL(Expression Langage)사용" 
    isELIgnored="false"
    %>
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
EL(Expression Lanage)은 JSP에서 Web Broswer로 출력하기위해 만들어진 언어<br/>
문자는 존재하지 않는다.<br/>
${ "안녕하세요" }<br>
${ '안녕하세요' }<br>
<div>
연산자 : 단항, 산술, 관계, 논리, 삼항<br/>
<%-- ${ ~10 } EL에서는 Java의 모든 연산자를 사용할 수 없다. --%>
단항 : !true = ${ !true } ( ${ not true } )<br/>
산술 : +, -, *, /, %  ( / 연산의 결과는 Java 와 다르게 실수가 나온다.)<br/>
10+4 = ${ 10 + 4  }<br/>
10-4 = ${ 10 - 4  }<br/>
10*4 = ${ 10 * 4  }<br/>
10/4 = ${ 10 / 4  }<br/>
10%4 = ${ 10 % 4  }<br/>

관계 : >( gt ), <( lt ) , >= (ge), <= (le) , == (eq), != (ne)<br/>
10 > 4 = ${ 10 > 4  } ( ${ 10 gt 4  } )<br/>
10 < 4 = ${ 10 < 4  } ( ${ 10 lt 4  } )<br/>
10 >= 10 = ${ 10 >= 10  } ( ${ 10 ge 10  } )<br/>
10 <= 10 = ${ 10 <= 10  } ( ${ 10 le 10  } )<br/>
10 == 10 = ${ 10 == 10  } ( ${ 10 eq 10  } )<br/>
<%-- 10 != 10 = ${ 10 != 10  } ( ${ 10 ne 10  } )<br/> --%>

논리 : && ( and ) , || ( or )<br/>
10 > 5 && 5 < 10 = ${ 10 > 5 && 5 < 10  } (  ${ 10 gt 5 and 5 lt 10  } )<br/>
10 < 5 || 5 > 10 = ${ 10 < 5 || 5 > 10  } (  ${ 10 lt 5 or 5 gt 10  } )<br/>

삼항 : ? : <br>
10은 ${ 10 < 0 ?"음수":"양수" } ( ${ 10 lt 0 ?"음수":"양수" } )<br/>
-10은 ${ -10 < 0 ?'음수':'양수' } ( ${ -10 lt 0 ?"음수":"양수" } )<br/>

</div>
</body>
</html>











