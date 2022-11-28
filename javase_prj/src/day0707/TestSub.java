package day0707;

/**
 * 자식클래스: 공통기능은 부모의 것을 사용하고 (코드의 재사용성), 자신만의 특징을 정희한다
 * @author user
 */
public class TestSub extends TestSuper {
	
	public TestSub() {
		System.out.println("자식클래스의 생성자");
	}
	
	public static void main(String[] args) {
//		자식클래스를 생성하면 부모클래스 부터 생성된다
		TestSub ts=new TestSub();
		ts.i=10; //자식클래스에 존재하지 않는 변수나 method를 자식클래스의 객체명으로
//		(자식의 것처럼) 사용할 수 있다 => 코드의 재 사용성 향상
 		ts.setI(30);
		System.out.println(ts.i);
//		상속줄에 있는 접근 가능한 모든 기능을 사용할 수 있다
		System.out.println(ts.toString()); //java.lang.Object
		
		
	}//main

}//class
