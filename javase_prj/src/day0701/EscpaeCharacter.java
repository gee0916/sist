package day0701;

/**
 * 특수문자의 사용
 * \로 시작하는 기능을 가진 문자
 * @author user
 */
public class EscpaeCharacter {
	
	public static void main(String[] args) {

		System.out.println("오늘은\t금요일\t입니다");
		System.out.println("오늘은 금요일 입니다");

		System.out.println("오늘은\n금요일\n입니다");
		System.out.println("오늘은\"금요일\"입니다");
		System.out.println("오늘은\'금요일\'입니다");
		System.out.println("자바 환경설정 파일은 e:\\dev\\env.bat입니다");
		System.out.println("임시파일은 e:\\new\\temp.txt");
		System.out.println("오늘은\b");
		System.out.println("오늘은\f금요일");
		
	}//main

}//class
