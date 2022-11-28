package xml1018;

import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * XML을 동적으로 생성
 * @author user
 */
public class CreateXML {
	
	
	public void createXML() throws IOException {
		//1. XML 문서객체 생성 (선언부 <?xml version="1.0" encoding="UTF-8" />
		Document doc=new Document();
		//2. 최상위 부모노드 생성 - Element
		Element rootNode = new Element("msgs");
 		//3. 자식 노드를 생성 - Element
		Element msgNode = new Element("msg");
		msgNode.setText("동적으로 생성하는 XML 문서");
		//4. 자식 노드를 부모노드에 배치
		rootNode.addContent(msgNode);
		//5. 부모노드를 XML문서객체 배치
		doc.addContent(rootNode);
		//6. 출력객체를 사용하여 XML문서객체를 출력한다
		//XMLOutputter xOut=new XMLOutputter(Format.getCompactFormat()); //한줄
		//XMLOutputter xOut=new XMLOutputter(Format.getRawFormat); //한줄
		XMLOutputter xOut=new XMLOutputter(Format.getPrettyFormat()); //줄변경
		//xOut.output(doc, System.out); // System.out 은 콘솔에 XML출력
		
		//파일로 출력
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("E:/dev/workspace/jsp_prj/src/main/webapp/xml1018/create.xml");
			xOut.output(doc, fos);
			System.out.print("XML 생성 완료");
		}finally {
			if(fos!=null) { fos.close(); } //end if
		}//end finally
		
	}//CreateXML

	public static void main(String[] args) {
		try {
			new CreateXML().createXML();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}
