package xml1019;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * JDOM Parser를 사용한 파싱
 * @author user
 *
 */
public class XmlParsing2 {

	public void parsing() throws JDOMException, IOException{
		//1. Builder 생성
		SAXBuilder sb=new SAXBuilder();
		
		//2. Builder 에서 XML문서 접근하여 XML문서 얻기
		File file=new File("E:/dev/workspace/jsp_prj/src/main/webapp/xml1019/parsing2.xml");
		if(file.exists()) {
			Document doc = sb.build(file);
			System.out.println(doc);
		//3. 최상위 부모노드 얻기
			Element rootNode=doc.getRootElement();
			System.out.println(rootNode);
		//4. 자식노드들 얻기 (특정 노드를 얻을 때 getChile(), 모든 노드를 얻을 때 getChildern()
			List<Element> msgNode=rootNode.getChildren();
			
			for(Element ele: msgNode) {
		//5. 자식노드 중 특정노드 찾아 값을 얻기 (Parsing)
				//msg1 node만 파싱출력
				if("msg1".equals(ele.getName())) {
					System.out.println(ele.getName()+"/"+ele.getValue());
				}
			}//end for
		}//end if	
		
	}//parsing
	
	public static void main(String[] args) {
		try {
			new XmlParsing2().parsing();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//XmlParsing
