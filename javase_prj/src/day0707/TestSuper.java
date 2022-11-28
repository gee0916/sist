package day0707;

/**
 * 부모클래스: 자식클래스들이 가져야할 공통 특징 정의
 * @author user
 *
 */
public class TestSuper {

	int i;
	
	public TestSuper() {
		System.out.println("부모클래스의 생성자");
		
	}//TestSuper
	
	public void setI(int i) {
		
		this.i=i;
		System.out.println("부모클래스의 method");
	}//set
	
}//class
