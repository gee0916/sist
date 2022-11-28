<%@page import="org.jdom2.output.Format"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="org.jdom2.Element"%>
<%@page import="org.jdom2.Document"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8" info="" trimDirectiveWhitespaces="true"%>
<%
String[] newsTitle="속보,정치,경제,사회,국제,문화,연예,스포츠,풀영상,뉴스랭킹,뉴스룸,아침&,썰전 라이브,정치부회의".split(",");
String[] url="newsflash,politics,economy,society,international,culture,entertainment,sports,fullvideo,newsrank,newsroom,morningand,ssulzunlive,politicaldesk".split(",");

//1. XML문서객체 생성
Document doc=new Document();

//2. 최상위 노드를 생성
Element newsRootNode=new Element("newsData");

//3. 자식노드를 생성
Element cntNode=new Element("dataCnt");
cntNode.setText(String.valueOf(newsTitle.length));

//4. 자식노드를 부모노드에 배치
newsRootNode.addContent(cntNode);

//3,4 반복
Element dataNode=null;
Element titleNode=null;
Element urlNode=null;
for(int i=0; i<newsTitle.length; i++) {
	dataNode=new Element("data");
	titleNode=new Element("title");
	urlNode=new Element("url");
	//생성된 노드에 값 할당
	titleNode.setText(newsTitle[i]);
	urlNode.setText(url[i]);

	//생성된 노드를 부모노드에 배치
	dataNode.addContent(titleNode);
	dataNode.addContent(urlNode);
	
	//자식 노드를 가진 노드를 최상위 부모노드에 배치
	newsRootNode.addContent(dataNode);
}//end for

//5. 모든 자식노드를 가진 부모노드를 XML문서객체에 배치
doc.addContent(newsRootNode);

//6. XML출력 객체 생성
XMLOutputter xOut=new XMLOutputter(Format.getPrettyFormat());

//7. 생성된 XML문서를 출력.
xOut.output(doc, out);
%>