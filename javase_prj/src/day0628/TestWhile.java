package day0628;

/**
 * while: 시작과 끝을 모를 때 사용하는 반복문
 * @author user
 */

public class TestWhile {

	public static void main(String[] args) {

		int i=0; //초기값
			while(i<10) { //조건식: 최소0번수행, 최대 조건까지 수행.
				System.out.println("반복수행"+i);
				i++; //증.감소식
			}//end while
		System.out.println();

		//		while을 사용하여 구구단 5단 출력
			i=1; //초기값
			while(0<i&&i<10) {
				System.out.println("5 * "+i+" = "+5*i);
				i++;
			}//end while
		System.out.println();
		
//		char unicode=0;
//		while(unicode<Character.MAX_VALUE+1) {
//			System.out.println("문자: "+unicode+" 코드값: "+(int)unicode);
//			unicode++;
//		}//end while
		
		
			
	}//main

}//class
