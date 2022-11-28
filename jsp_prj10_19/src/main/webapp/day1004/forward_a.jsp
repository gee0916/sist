<%@page import="java.util.Random"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="forward action" %>
<%
//GET방식일지라도 <jsp:param>으로 한글 데이터를 전송할 때에는 POST방식의
//한글 처리를 해야한다. 
request.setCharacterEncoding("UTF-8");

Map<String,String[]> groupMember=new HashMap<String,String[]>();
groupMember.put("group_1", "차승주,정주은,홍아람,정현지,이유리".split(","));
groupMember.put("group_2", "정선홍,하지윤,유원준,유설빈".split(","));
groupMember.put("group_3", "남상민,송인화,김태규,김소현,김도희".split(","));

String selectGroup=request.getParameter("group");
if( selectGroup == null ){//최초호출
	selectGroup="group_1";
}//end if

//업무로직의 처리
String[] gm=groupMember.get(selectGroup);
//업무처리후 생성된 배열은 web parameter로 넘길 수 없다. => scope객체 사용.
request.setAttribute("gm", gm);
//페이지 이동

String[] msg={"흑흑","모래모래","자갈자갈","포항항항"};
String paramMsg=msg[new Random().nextInt( msg.length )];
%>
<%-- 파라메터를 생성하지 않는 경우
 <jsp:forward page="forward_b.jsp"/> --%>
 <%-- 파라메터를 생성 하는 경우 --%>
 <jsp:forward page="forward_b.jsp">
 	<jsp:param name="todayMsg" value="<%= paramMsg %>"/>
 </jsp:forward>








	
