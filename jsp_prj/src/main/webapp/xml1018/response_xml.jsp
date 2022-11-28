<%@page import="org.jdom2.output.Format"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="org.jdom2.Document"%>
<%@page import="kr.co.sist.dao.WebMemberXML"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8" info="XML응답" trimDirectiveWhitespaces="true"%>
<%
WebMemberXML wmXML=new WebMemberXML();
Document doc=wmXML.creatXML();

//출력
XMLOutputter xOut=new XMLOutputter(Format.getPrettyFormat());
xOut.output(doc, out);
%>
