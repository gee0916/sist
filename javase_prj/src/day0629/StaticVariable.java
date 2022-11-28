package day0629;

/**
 * static (class) variable : 공용변수 
 * @author user
 */

public class StaticVariable {

	static int i; 
	
	public void test() { //instance 영역
		
//		static 변수는 직접 접근 가능
		StaticVariable.i=10;
		
	}//test
	
	public static void test2() { //static 영역
		
		StaticVariable.i=0;
		
	}//test2
	
	public static void main(String[] args) { //static 영역
		
		System.out.println("객체화 없이 사용가능 : " + StaticVariable.i);
		
//		static변수는 공용변수 이므로 특정 객체에 속해있는 변수가 아니다
//		StaticVariable sv=new StaticVariable();
		
//		특정객체에 속한변수가 아니므로 "객체명.변수명=sv.i"으로 사용하는 건 접근은 되나
//		올바른 사용법은 아니다 => "클래스명.변수명=StaticVariable.i"으로 사용을 권장
//		System.out.println("겍체명.변수명 : " + sv.i); //sv.i -> StaticVariable.i
		
	}

}
