package day0629.sub;

import day0629.TestModifires;

/**
 * 자식 클래스에서 다른 패키지의 부모클래스의 존재하는 인스턴스 변수의 사용
 * 
 * Testmodifires - 부모클래스
 * Testmodifires4 - 자식클래스
 * public 사용가능
 * protected 사용가능
 * default private 사용불가
 * @author user
 *
 */

public class TestModifires4 extends TestModifires {


	public static void main(String[] args) {

//		i=10; //인스턴스 변수는 총 2단계로 사용되는데 이전 단계가 없어서 에러 (직접사용불가)
		
//		1. 객체화 : 클래스명 객체명=new 클래스명(); 
		TestModifires4 tm = new TestModifires4();
//		2. 사용
		System.out.println("public = " + tm.i);
		System.out.println("protected = " + tm.j);
//		System.out.println("default = " + tm.k);
//		System.out.println("private = " + tm.l);

		
		
	}//main

}//class
