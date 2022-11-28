package day0701;

/**
 * VariableArguments
 * 매개변수 하나로 여러 개의 입력 값 받기
 * @author user
 */

public class VariableArguments {
	
	public void vaTest(int ... param) {
		System.out.println("V.A는 배열로 처리되므로 주소가 출력 : "+param);
		for(int i=0; i< param.length; i++);
			System.out.println();
		}//end for
	
//	매개변수가 여러개인 경우에는 V.A를 가장 마지막에만 선언할 수 있다.
	public void vaTest2(int i, char ... c) {
		System.out.println(i);
		for(char temp : c) {
			System.out.println(temp);
		}//end for
	}//end if
	

	public static void main(String[] args) {
		
		VariableArguments va = new VariableArguments();
		System.out.println("참조형 데이터형은 heap에 생성되고 그 주소가 출력 : "+va);
//		호출할 때 동일 데이터형이라면 다양한 인수의 갯수로 호출할 수 있다
		
		va.vaTest();
		va.vaTest();
		va.vaTest(1);
		va.vaTest(34,87,44);
		System.out.println("-----------------------------------");
		
		va.vaTest2(10);
		va.vaTest2(10, 'd');
		

	}//main

}//class
