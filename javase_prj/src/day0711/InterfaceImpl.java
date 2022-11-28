package day0711;

/**
 * Interface를 구현하는 클래스
 * 인터페이스내 abstract method는 반드시 구현해야한다
 * @author user
 */
public class InterfaceImpl implements SuperInter {

	@Override
	public void methodA() {
		System.out.println("구현 class에서 Override한 methodA");
	}//methodA
	
	@Override
	public void methodB() {
		System.out.println("구현 class에서 Override한 methodB");
	}//methodB

	public static void main(String[] args) {
//		인터페이스는 객체화가 되지 않는다
//		SuperInter si=new SuperInter();
//		is a관계의 객체화 가능. (인터페이스는 구현클래스의 heap의 주소를 저장할 수 있다)
//		인터페이스명 객체명=new 구현클래스생성자();
		SuperInter si=new InterfaceImpl();
//		인터페이스의 추상method를 호출하면 
//		주소를 할당받은 구현 클래스의 method가 최우선적으로 호출 된다
		si.methodA();
		si.methodB();
//		default method호출
		si.defMethod();
		
	}//main
	
}//class
