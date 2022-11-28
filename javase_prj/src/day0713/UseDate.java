package day0713;

import java.util.Date;

/**
 * Java에서 날짜 정보를 알고 있는 클래스는 System class 이다
 * @author user
 */
public class UseDate {
	
	public UseDate() {

		System.out.println("현재 시간 : "+System.currentTimeMillis());
		
		Date date=new Date();
//		System.out.println(date.getYear());//날짜정보를 얻는 일을 하는 method가 비 추천인경우가 많다
		System.out.println(date);//사용자가 원하는 형식의 날짜 정보가 아닌 형태의 날짜가 출력된다
//		SimpleDateFormat 사용 권장
		
	}//UseDate

	public static void main(String[] args) {

		new UseDate();
		
	}//main

}//class
