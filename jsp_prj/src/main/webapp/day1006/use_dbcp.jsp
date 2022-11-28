<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="DBCP를 사용한 DB Connection" %>
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
//DBCP (Data Base Connection Pool)을 사용한  Connection 얻기
// setting : 
//	1. ojdbc8.jar를 CATALINA_HOME/lib에 배치
//  2. server.xml에 필요한 <Context>에 <Resource>를 추가한다.
// 사용.
try{
//1. JNDI 사용객체 생성.  Context ctx=new InitialContext();
Context ctx=new InitialContext();
//2. 실행환경에서 DBCP를 찾고, DataSource 얻는다.
//  DataSource ds=(DataSource)ctx.lookup("java:comp/env/Resource설정된name속성")
DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/dbcp");

//3. DataSource에서 Connection 얻기.  Connection con=ds.getConnection();
Connection con=ds.getConnection();
out.println("DBCP에서 얻어온 Connection : "+ con);
con.close(); //DBCP는 close하면 DB와 연동이 끊어지는 것이 아닌 Pool로 다시 들어간다.  :  Connection의 재사용
}catch(NamingException ne){
	ne.printStackTrace();
	out.println("JNDI 객체사용 중 에러 발생");
}catch(SQLException se){
	se.printStackTrace();
	out.println("Connection 얻는 중 에러 발생");
}
%>
</body>
</html>








