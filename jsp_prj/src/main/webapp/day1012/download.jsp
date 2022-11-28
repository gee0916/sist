<%-- 1.응답방식을 HTML어ㅔ서 스트림을 응답하도록 변경 --%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="application/octet-stream"
    pageEncoding="UTF-8" info=""%>
<%
String downfile=request.getParameter("filename");
/* downfile=new String(downfile.getBytes(),"UTF-8"); */
//2. 다운로드하는 파일명을 변경
//한글파일명을 다운로드할 수 있도록 파일명에 대한 charset변경
downfile=new String(downfile.getBytes(),"8859_1");
response.setHeader("Content-Disposition", "attachment;fileName="+downfile);
///////////다운설정/////////////////////

//3.전달된 파일명으로 다운로드할 파일에 연결
File file=new File("E:/dev/workspace/jsp_prj/src/main/webapp/upload/"+downfile);

if(file.exists()) { //파일이 존재하면 
	FileInputStream fis=null;
	OutputStream os=null;
	try {
	//4.다운로드할 파일에 입력스트림을 연결
		fis=new FileInputStream(file);
	
	//파일의 크기대로 파일을 저장할 수 있는 배열 생성
	byte[] tempData=new byte[512];
	int size=0;
	
//	while((leng=fis.read())!=-1) { //파일의 끝이 아닐때까지 데이터읽기
//		data[i]=(byte)leng; //파일의 내용을 배열에 저장
//		i++;
//	}//end while
		
////////파일 읽기////////////////////////////////////////////////////////////
		//파일 출력
		//HTML을 응답한느 내장 객체를 초기화
		out.clear();
		//출력스트림을 재설정
		out=pageContext.pushBody();
		
		os=response.getOutputStream();
		//os.write(data);
		while((size=fis.read(tempData))!=-1) { //HDD내용을 512 byte읽어들인다
			os.write(tempData, 0, size); //읽어들인 내용을 0번째 방부터 읽어들인 크기까지 쓴다
		}//end whlie
		
		os.flush();
////////파일 쓰기////////////////////////////////////////////////////////////
		
		
	}finally {
		if(fis!=null) {fis.close();} //end if
		if(os!=null) {os.close();} //end if
	}//en finally
	
}//end if

%>