package day0627;

/**
 *switch~case: 일칳는 정수를 비교할 때 사용
 * JDK 1.7에서부터는 일치하는 문자열도 비교 가능
 * switch에 입력되는 변수와 같은 상수를 찾아 실행한다
 * @author user
 */
public class TestSwitchCase {

	public static final int OPEN=0;
	public static final int ING=1;
	public static final int CLOSE=2;
	
	
	public static void main(String[] args) {

		int i =1; //byte, short, int, char

		switch (i) {
		//case의 상수는 입력되는 변수의 범위까지만 사용할 수 있다
		case 0: System.out.println("0과 비교 처리"); 
		case 1: System.out.println("1과 비교 처리");
		case 2: System.out.println("2과 비교 처리");
		case 3: System.out.println("3과 비교 처리");
		default: System.out.println("일치하는 상수 없음");
		}//switch

		System.out.println();
		
		String s ="Hell";
		
		switch (s) { //JDK 1.7에서 부터 사용가능
		case "Hello": System.out.println("가벼운인사"); 
		case "Hell": System.out.println("지옥인사");
		default: System.out.println("해당하는 문자열 없음");
		}//switch
		
		System.out.println();
		//break의 사용
		int num=2;
		switch (num) {
		case 0: System.out.println("0과 비교처리"); break;
		case 1: System.out.println("1과 비교처리"); 
		case 2: System.out.println("2과 비교처리"); break;
		
		default: System.out.println("해당 상수 없음");
		}//end switch
		
		System.out.println();
		
		int menu=2;
		//case에 Constant 도입하여 가독성 향상
		switch (menu) {
		case TestSwitchCase.OPEN: System.out.println("영업점 열기"); break;
		case TestSwitchCase.ING: System.out.println("영업하는 중"); 
		case TestSwitchCase.CLOSE: System.out.println("영업점 닫기"); break;
		default: System.out.println("메뉴없음");
		}//end switch
		
		
	}//main

}//class
