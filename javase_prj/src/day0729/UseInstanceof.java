package day0729;

public class UseInstanceof {
	public void test( Object t ) {
		if( t instanceof Temp) {//객체가  앞에 나오고 비교하는 클래스가 뒤에 나와야한다.
			System.out.println("Temp의 자식");// Temp를 사용하는 작업 코드 작성
		}else {
			System.out.println("Temp의 자식이 아님");//예외발생
		}//end else
	}//test

	public static void main(String[] args) {
		Test t=new Test();
		String str=new String("hello");
		UseInstanceof ui=new UseInstanceof();
		ui.test(t);
		ui.test( str );
//		System.out.println( t instanceof Test);
//		System.out.println( t instanceof Temp );
		// 관련없는 클래스로 비교하면 error 가 발생
//		System.out.println( t instanceof java.lang.String );
		
	}//main

}//class
