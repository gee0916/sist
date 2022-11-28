package day0629;

/**
 *  1. static 영역에서는 직접 접근이 되지 않는다
 * @author user
 *
 */

public class UseInstanceVariable {
	
	int i; //instance variable
	
	public void test() { //instance method : instance 영역
		
		i=10; //동일 영역에서 직접접근 가능
		
	}//test

	public static void test2() { //static method : static 영역
		
//		i=o; static 영역에서는 직접접근 x	
//		1. 객체화 : 먼저 메모리에 로딩되는 녀석(static)이 나중에 로딩되는 녀석(instance)을 사용하기 위한 행동
		UseInstanceVariable uiv=new UseInstanceVariable();
		
//	 	2. 사용
		uiv.i=10;
		
	}//test2

	public static void main(String[] args) { //static 영역

//		instance 변수는 객체마다 생성되고 사용된다
		UseInstanceVariable uiv =new UseInstanceVariable(); //uiv라는 객체 생성
		UseInstanceVariable uiv2 =new UseInstanceVariable(); //uiv라는 객체 생성
		
		System.out.println("uiv객체 값: "+uiv);
		System.out.println("uiv2객체 값: "+uiv2);
		
		uiv.i=2022;
		uiv2.i=6;
		
//		객체마다 i라는 같은 이름의 변수를를 가지고 있기 때문에 객체명은 달라도 
//		i라는 같은 이름의 변수를 각각 사용할 수 있다.
		
		System.out.println("uiv.i: "+ uiv.i);
		System.out.println("uiv2.i: "+ uiv2.i);
		
		
	}//main

}//class
