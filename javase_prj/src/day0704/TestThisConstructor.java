package day0704;

/**
 * this를 사용한 클래스안의 다른 생성자 호출
 * @author user
 */
public class TestThisConstructor {
	
	int i;
	public TestThisConstructor() {
//		this(100); //생성자의 첫번 째 줄에서만 사용되고, 객체를 생성하지 않고, 
//		내클래스의 다른 생성자를 호출한다. 
		System.out.println("기본생성자"+this);
	}//TestTi=hisConstructor
	
	public TestThisConstructor(int i) {
		this(); 
		this.i=i;
		System.out.println("인자있는 생성자"+this);
	}//TestTi=hisConstructor
	
	public static void main(String[] args) {
		TestThisConstructor ttc = new TestThisConstructor(10);
		System.out.println(ttc.i);
		
		
		
	}//main

}//class
