package kr.co.sist.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import kr.co.sist.vo.WebMemberVO;

public class WebMemberXML {
	
	public Document creatXML() {
		Document doc=null;
		
		WebMemberDAO wmDAO=WebMemberDAO.getInstance();
		List<WebMemberVO> list=null;
		try {
			list=wmDAO.selectWebMember();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		//1. XML문서객체 생성
		doc=new Document();
		
		//2. 근노드 생성
		Element rootNode=new Element("members");
		
		if(list != null ) {
			Element memberNode=null;
			Element idNode=null, passNode=null, nameNode=null, emailNode=null;
			
			for(WebMemberVO wmVO:list) {
				//id, pass, name, email
				memberNode=new Element("member");
				
				//3. 자식노드 생성 (3,4,5 반복)
				idNode=new Element("id");
				passNode=new Element("pass");
				nameNode=new Element("name");
				emailNode=new Element("email");
				
				//4. 자식노드에 값 설정
				idNode.setText(wmVO.getId());
				passNode.setText(wmVO.getPass());
				nameNode.setText(wmVO.getName());
				emailNode.setText(wmVO.getEmail());
				
				//자식노드 (id,pass,,)들을 자식 노드 (memberNode)에 배치
				memberNode.addContent(idNode);
				memberNode.addContent(passNode);
				memberNode.addContent(nameNode);
				memberNode.addContent(emailNode);
				//5. 자식노드를 근노드에 배치
				rootNode.addContent(memberNode);
			}//end for
		}//end if
		//6. 근노드를 XML 문서객체에 배치
		doc.addContent(rootNode);
		
		return doc;
	}//creatXML
	
	public void xmlOutpur(Document doc) throws IOException {
		//7. XML문서객체를 출력
		XMLOutputter xOut=new XMLOutputter(Format.getPrettyFormat());
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("E:/dev/workspace/jsp_prj/src/main/webapp/xml1018/web_member.xml");
			xOut.output(doc, fos);
		}finally {
			if(fos!=null) {fos.close(); } //end if
		}
	}

	public static void main(String[] args) {
		//DBCP는 Tomcat에 설정되어있음 Tomcat과 연결된 JVM에서만 사용할 수 있다
		//main가 존재하면 별도의 JVM이 동작되기 때문에 JNDI로 DBCP를 찾아갈 수 없다.
		WebMemberXML wmXML=new WebMemberXML();
		wmXML.creatXML();
		
	}//main
	
}
