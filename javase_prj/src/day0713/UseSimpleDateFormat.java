package day0713;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 원하는 형식의 날짜 정보 조희
 * @author user
 */
public class UseSimpleDateFormat {
	
	public UseSimpleDateFormat() {
		
//		1. 객체생성
//		M-7, MM-07
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a HH(hh):mm:ss EEEE");
		
//		2. 날짜를 넣어 정해진 형식으로 날짜를 출력
		String date=sdf.format(new Date());
		System.out.println(date);
		
//		1. Locale class를 사용한 객체생성 => OS에서 제공하는 날짜형식이 아닌 설정한 날짜 형식으로 출력
//		M-7, MM-07
//		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a HH(hh):mm:ss EEEE", Locale.UK);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a HH(hh):mm:ss EEEE", Locale.CANADA);

		//		2. 날짜를 넣어 정해진 형식으로 날짜를 출력
		String date2=sdf2.format(new Date());
		System.out.println(date2);
		
		
	}//UseSimpleDateFormat

	public static void main(String[] args) {

		new UseSimpleDateFormat();
		
	}//main

}//class
