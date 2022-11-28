package day0704;

/**
 * 생성자의 사용
 * @author user
 *
 */
public class TestConstructor {

	public TestConstructor() {
		System.out.println("기본생성자(Default Constructor)");
//		new TestConstructor(2022);
	}//TestConstructor
	
	public TestConstructor(int i) {
		System.out.println("매개변수 있는 생성자(Overload, Overloading)");
		test(); //일반 method 홏출
//		TestConstructor(); method 호출하듯이 직접 호출 할 수 없다
//		new TestConstructor();
	}//TestConsturctor
	
	public void test() {
		System.out.println("인스턴스 method");
	}
	
	public static void main(String[] args) {
		
// 	생성자는 new로 호출한다
		new TestConstructor(1);
		

		
	}//main

}//class
