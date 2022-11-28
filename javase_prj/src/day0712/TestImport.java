package day0712;
import day0711.ClarkSub;

import java.util.ArrayList;
import java.util.Date;
import java.awt.Frame;
//import java.sql.Date; // 같은 이름의 클래스는 하나만 import할 수 있다
//import java.util.*; //*을 사용하면 패키지 내의 모든 클래스를 사용할 수 있다

/**
 * 
 * @author user
 */
public class TestImport {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
//		다른 패키지의 클래스는 import를 받던가 아니면 패키지명을 모두 기술하는 
//		full path를 사용하던가 둘 중 하나를 해야한다
		day0711.Clark c=new day0711.Clark();
		day0711.Clark c1=new day0711.Clark();
		
//		import를 받으면 패키지명 없이 클래스를 편하게 몇번이든 사용할 수 있다
		ClarkSub cs=new ClarkSub();
		ClarkSub cs1=new ClarkSub();
		
		Date date=new Date();
//		패키지는 다르나 클래스나 인터페이스의 이름이 같은 경우
//		import는 같은 이름의 클래스(인터페이스)를 하나만 import 받을 수 있다
		java.sql.Date sqldate=new java.sql.Date(0L);
		
		ArrayList al=new ArrayList();
		
		Frame frame=new Frame();
		
		
		
	}//main

}//class
