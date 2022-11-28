package xml1019;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * JDOM Parser를 사용한 파싱
 * @author user
 *
 */
public class XmlParsing {

	public void parsing() throws JDOMException, IOException{
		//1. Builder 생성
		SAXBuilder sb=new SAXBuilder();
		
		//2. Builder 에서 XML문서 접근하여 XML문서 얻기
		File file=new File("E:/dev/workspace/jsp_prj/src/main/webapp/xml1019/parsing.xml");
		if(file.exists()) {
			Document doc = sb.build(file);
			System.out.println(doc);
		//3. 최상위 부모노드 얻기
			Element rootNode=doc.getRootElement();
			System.out.println(rootNode);
		//4. 자식노드들 얻기 (특정 노드를 얻을 때 getChile(), 모든 노드를 얻을 때 getChildern()
			Element msgNode=rootNode.getChild("msg");
		//5. 자식노드 중 특정노드 찾아 값을 얻기 (Parsing)
			System.out.println(msgNode.getName()+"/"+msgNode.getValue());
		}//end if
		
	}//parsing
	
	public static void main(String[] args) {
		try {
			new XmlParsing().parsing();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//XmlParsing
