package day0708;

import java.util.Date;
import java.util.List;

/**
 * annotation의 사용
 * @author user
 */
public class UseAnnotation {
	
	@Override
	public String toString() {
		return "나는 주소가 아닌 다른 값을 내보낼꺼임";
	}//toString
	
	@Deprecated
	public void test() {
		System.out.println("이 메소드는 영국에서 부터 시작");
	}//test
	
//	@SuppressWarnings("unused")
	@SuppressWarnings({"unused","rawtypes"})
	public void temp() {
		int i;
		
//		@SuppressWarnings("rawtypes")
		List list=null;
		
	}//temp
	
	
	public static void main(String[] args) {

		UseAnnotation ua = new UseAnnotation() ;
		System.out.println(ua); //주소가 출력. println method안에서 toString()를 호출한다
		Date date=new Date();
		System.out.println(date);
		
	}//main

}//class
