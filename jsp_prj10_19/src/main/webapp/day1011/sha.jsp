<%@page import="kr.co.sist.util.cipher.DataDecrypt"%>
<%@page import="kr.co.sist.util.cipher.DataEncrypt"%>
<%@page import="org.apache.tomcat.util.codec.binary.Base64"%>
<%@page import="java.security.MessageDigest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="SHA" %>
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
<%
String plainText="정주은씨 점심 뭐먹음? 뼈숯불구이"; // 일반 문자열

//SHA(Secure Hash Algorithm) 으로 암호화를 하는 클래스 
// 일반문자열을 원래의 문자열로 돌아갈 수 없는 유일한 문자열로 만드는 것.
//1. 알고리즘을 설정하여 MessageDigest 객체를 얻는다.
MessageDigest md=MessageDigest.getInstance("MD5");
//2. 일반 문자열을 byte[]의 배열로 만들어서 암호화를 수행.
md.update(plainText.getBytes());
//3. 암호화된 byte[]을 얻는다. > 알아볼수 있는 []로 변환 > 자바에서 편하게 
// 사용하기위해 []을 문자열로 얻기 
%>
일반 문자열 :  <%= plainText %>
암호화된 문자열 : <%= new String( Base64.encodeBase64(md.digest())) %>
<br/>
<%
String md5=DataEncrypt.messageDigest("MD5", plainText);
%>
<%= md5 %>
<br/>
<%
String name="차차"; //plain Text
//String key="abcdfghijklmnop1234~";
//키를 넣어서  암호화 객체를 생성한다.
DataEncrypt de=new DataEncrypt( "abcdfghijklmnop1234~" );//b6djmvOkiMY4pF4FjgocoQ==
//2. 암호화된 데이터를 얻기
String chipherText=de.encryption(name);
%>
암호화된 문자열 : <%= chipherText %><br/>
<% 
//복호화 : 암호화된 문자열을 원본 문자열로 변경.
//키를 넣어서  복호화 객체를 생성한다.
DataDecrypt dd=new DataDecrypt( "abcdfghijklmnop1234~" );
String plainName=dd.decryption(chipherText);
%>
복호화된 문자열 : <%= plainName %>
</body>
</html>







