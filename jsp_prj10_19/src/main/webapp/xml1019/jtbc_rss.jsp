<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="java.net.URL"%>
<%@page import="org.jdom2.Document"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="RSS Parsing"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://211.63.89.149/common/css/main_v1_220901.css"/>
<style type="text/css">

</style>
<!-- jQuery google CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- Bootstrap Css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- Bootstrap Js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script type="text/javascript">

</script>
</head>
<body>
<%
String[] newsTitle="속보,정치,경제,사회,국제,문화,연예,스포츠,풀영상,뉴스랭킹,뉴스룸,아침&,썰전 라이브,정치부회의".split(",");
String[] url="newsflash,politics,economy,society,international,culture,entertainment,sports,fullvideo,newsrank,newsroom,morningand,ssulzunlive,politicaldesk".split(",");
//https://fs.jtbc.co.kr/RSS/.xml
%>
<table>
<tr>
<% for(int i=0; i<newsTitle.length; i++) { %>
<td style="width:  80px; text-align: center;">
<a href="jtbc_rss.jsp?url=<%=url[i] %>"><%=newsTitle[i] %></a>
</td>
<%}%>
</tr>
</table>
<%
String paramUrl=request.getParameter("url");
if(paramUrl!=null) {
	//1. Builder 생성
	SAXBuilder sb=new SAXBuilder();
	//2. XML 문서 얻기: URL 클래스를 사용하면 외부 서버에 존재하는 XML과 연결할 수 있따
	Document doc=sb.build(new URL("https://fs.jtbc.co.kr/RSS/"+paramUrl+".xml"));
	//3. 최상위 노드 얻기
	Element rssNode=doc.getRootElement(); //<rss>
	//4. 자식노드나, 자식 노드들 얻기 파싱
	Element channelNode=rssNode.getChild("channel"); //<channel>
	
	Element descriptionNode=channelNode.getChild("description"); //<description>
	Element pubDateNode=channelNode.getChild("pubDate"); //<pubDate>
	%>
	<strong><%=descriptionNode.getValue() %></strong>
	( <%=pubDateNode.getValue() %> )  <br>
	<%
	
	//item노드는 channel node의 자식이고 여러개 이므로 getChildren()를 사용
	//특정노드만 얻기
	List<Element> itemNodes=channelNode.getChildren("item");
	
	out.println("조회건수:" + itemNodes.size()+"건<br>");
	
	Element titleNode=null;
	Element linkNode=null;
	Element descNode=null;
	
	for(Element someNode: itemNodes) {
		titleNode=someNode.getChild("title");
		linkNode=someNode.getChild("link");
		descNode=someNode.getChild("description");
%>
<div style="width: 800px; border: 1px solid #333; margin-bottom: 1px">
<div style="height: 25px;">
<Strong><a href="<%=linkNode.getValue() %>"><%=titleNode.getValue() %></a></Strong>
</div>
<div style="height: 40px; overflow: auto">
<%=descNode.getValue() %>
</div>
</div>
<%
	}//end for
}else {
%>
	뉴스를 클릭해주세요.
<%	
}//end if
%>
</body>
</html>