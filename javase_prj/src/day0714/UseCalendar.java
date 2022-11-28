package day0714;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author user
 */
public class UseCalendar {

	public UseCalendar() {
	
//		1. 생성
//		Calendar cal=new Calendar(); //추상클래스는 직접 객체화 될 수 없다
//		is a 생성
		
		Calendar cal=new GregorianCalendar();
//		객체를 얻는 method 호출
		Calendar cal2=Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal2);
		
//		int year=cal.get(0); //1을 넣으면 가독성이 저하
		int year=cal.get(Calendar.YEAR); //Constant을 넣으면 가독성이 향상
		int month=cal.get(Calendar.MONTH)+1; //0월부터 시작하므로 현재 월보다 1적게 나온다
		int day=cal.get(Calendar.DAY_OF_MONTH); //0월부터 시작하므로 현재 월보다 1적게 나온다
		
		int ampm=cal.get(Calendar.AM_PM);//오전이면 0, 오후면 1
		String[] amTitle= {"오전","오후"};
		
		int hour=cal.get(Calendar.HOUR); //0~11시간 - 12시간
		int hour2=cal.get(Calendar.HOUR_OF_DAY); //0~24시간 - 24시간
		
		int minute=cal.get(Calendar.MINUTE); //분
		int second=cal.get(Calendar.SECOND); //초
		
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		//요이: 일요일부터 1로 반환: 일 1, 월 2, 화 3, 수 4, 목 5, 금 6, 토 7
		String[] dayWeek= {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		
		System.out.println(year +"-"+ month+"-"+day+" "
				+amTitle[ampm]+"/"+hour+"("+hour2+"):"+minute+":"+second
				+"/"+dayWeek[dayOfWeek]);
		
	} //UseCalendar
	
		public void printAge(int year) {
			
//			입력받을 년도를 사용하여 나이를 출력
			System.out.println(Calendar.getInstance().get(Calendar.YEAR)-year+1);
		}//printAge
	
	
	public static void main(String[] args) {

		new UseCalendar().printAge(1998);
		
	}//main

}//class
