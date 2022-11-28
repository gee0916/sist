package day0711;

/**
 * 상속관계에서 부모클래스를 작성할 때 사용
 * 변수, 
 * 일반 method 구현의 강제성이 없다 (자식클래스에서 Override의 자유)
 * abstract method 구현의 강제성이 있다 (자식클래스에 반드시 Override)
 * @author user
 */
public abstract class AbstractSuper {

	int i;
	
	public AbstractSuper() {
		super();
		System.out.println("추상클래스의 생성자");
	}//AbstractSuper
	
	public void setI(int i){
		this.i=i;
		
	}//setI
	
//	추상 method: method의 body가 없는 method
	public abstract void methodA();
	public abstract String methodB();
	public abstract String methodC(String msg);
	
	public static void main(String[] args) {
//		추상클래스는 직접 객체화 할 수 없다
//		AbstractSuper as=new AbstractSuper();
		
	}//main
	
}//class
