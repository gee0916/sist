package day0712;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;;

/**
 * static import 사용
 * @author user
 */
public class TestStaticImport {
	
	public TestStaticImport() {

		System.out.println("int의 최솟값 "+MIN_VALUE);
		String str="2022";
//		int year=Integer.parseInt(str);
		int year=parseInt(str);
		System.out.println(year);
		
		String strs="2022.22";
//		str2를 double 변수에 저장하고 소수점 이하 한자리 까지만 출력 (static import 사용)
		
		double d=parseDouble(strs);
		System.out.printf("%.1f",d);
		
	}//TestStaticImport

	public static void main(String[] args) {

//		TestStaticImport ts = new TestStaticImport();
		new TestStaticImport();
		
	}//main

}//class
