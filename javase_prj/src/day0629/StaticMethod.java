package day0629;

/**
 * static method는 instance method를 사용하지 않고 입력된 값으로만 업무를 처리할 때 
 * @author user
 */

public class StaticMethod {

	public static void test() {
		
		System.out.println(" static method ");
		
	}//test
	
	public static void main(String[] args) {

//		static method 호출
		StaticMethod.test();
		
	}//main

}//class
