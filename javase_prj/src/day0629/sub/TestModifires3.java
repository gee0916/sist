package day0629.sub;

import day0629.TestModifires;

/**
 * 
 * public 사용가능
 * protected default private 사용불가
 * @author user
 *
 */

public class TestModifires3 {

	public static void main(String[] args) {

//		i=10; //인스턴스 변수는 총 2단계로 사용되는데 이전 단계가 없어서 에러 (직접사용불가)
		
//		1. 객체화 : 클래스명 객체명=new 클래스명(); 
		TestModifires tm = new TestModifires();
//		2. 사용
		System.out.println("public = " + tm.i);
//		System.out.println("protected = " + tm.j);
//		System.out.println("default = " + tm.k);
//		System.out.println("private = " + tm.l);

		
		
	}//main

}//class
