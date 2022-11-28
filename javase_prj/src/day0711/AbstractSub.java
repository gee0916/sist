package day0711;

/**
 * 추상크래스의 자식 클래스
 * 부모클래스의 abstract method를 반드시 모두 구현(Override)해야한다.
 * @author user
 */
public class AbstractSub extends AbstractSuper {
	
	@Override
	public void methodA() {
		System.out.println("자식이 구현한 methodA");
//		super.methodA(); //추상method는 body가 없으므로 직접 호출할 수 없다
	}//methodA

	@Override
	public String methodB() {
		return "자식이 구현한 methodB";
	}//methodB
	
	@Override
	public String methodC(String msg) {
		return "자식이 구현한 methodC"+msg;
	}//methodC
	
	public void subMethod() {
		System.out.println("자식이 정의한 method");
	}//subMethod

	public static void main(String[] args) {
	
//		AstractSuper as=new AbstractSuper(); //추상클래스는 직접 객체화할 수 없다
		AbstractSub as=new AbstractSub(); //Object -> AstractSuper -> AstactSub
		as.setI(100); //부모클래스의 일반 method
		as.subMethod(); //자식클래스의 일반 method
		as.methodA(); //Override한 method
		System.out.println();
		
//		is a 관계 객체화 (상속관계의 객체화)
//		부모클래스명 객체명=new 자식클래스생성자();
		AbstractSuper as2=new AbstractSub();
		as2.setI(100); //부모클래스의 일반 method
//		as2.subMethod(); //자식클래스의 일반 method는 호출 불가, 설계도에 정보가 없다
		as2.methodA(); //생성한 자식클래스가 Override한 method가 호출된다
		System.out.println(as2.methodB());
		
//		부모클래스를 생성하여 자식클래스에는 할당할 수 없다
//		부모클래스에는 자식클래스에 정보가 없다
//		AbstractSub as3=new AbstractSuper();
		
	}//main

}//class
