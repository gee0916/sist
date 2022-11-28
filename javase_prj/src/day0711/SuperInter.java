package day0711;

/**
 * 인터페이스는 상수와 abstract method, JDK1.7에서부터 추가된 default method를 가진다
 * @author user
 */
public interface SuperInter {
//	int i; // instance variable은 선언할 수 없다
	public static final int CONST = 0;
	
//	public SuperInter() { //interface는 생성자를 가질 수 없다 => 객체생성 불가능
//  }
	
//	public void test() { //interface는 일반 method를 가질 수 없다 => 일을 구현할 수 없다
//	}
	
//	abstract method만 가진다.
//	abstract이 없는 abstract method
	public void methodA();
//	abstract을 정의한 abstract method
	public abstract void methodB();
	
	public default void defMethod() {
		System.out.println("default method body를 가지며 업무를 구현할 수 있다");
	}//defMethod

}//class