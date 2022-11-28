package day0712;

/**
 * 안쪽 클래스를 인스턴스 변수처럼 사용하는 inner class
 * @author user
 *
 */
public class TestInner {

	int i;
	
	public TestInner() {
		System.out.println("바깥 클래스의 생성자");
	}//TestInner
	
	public void useOutI() {
		System.out.println("바깥 클래스 i: "+i);
//			바깥클래스에서는 안쪽클래스의 자원을 사용할 수 없다
//			j=7;
//			useInJ();
	}//useOutI
	
	//////////// inner class 시작 //////////////////////////
	
	public class inner {
		int j;
		
		public inner() {
			System.out.println("안쪽클래스 생성자");
		}//inner
		
		public void useInJ() {
			System.out.println("안쪽클래스 j: "+ j);
			i=7; //안쪽클래스에서는 바깥 클래스의 자원을 마음대로 사용할 수 있다
			useOutI();
		}//useInJ
		
	}//class
	
	//////////// inner class 끝 //////////////////////////
	
	public static void main(String[] args) {

//		1. 바깥클래스를 객체화
		TestInner ti=new TestInner();
//		바깥클래스의 객체로 사용할 수 있는 것은 바깥 클래스의 변수. method
		ti.i=100;
		ti.useOutI();
//		ti.useInJ(); // 안쪽클래스의 자원은 바깥클래스의 객체명으로 사용할 수 없다
		
//		2. 안쪽클래스의 객체화
//		바깥클래스명.안쪽클래스명 객체명=바깥클래스의 객체명.new 안쪽클래스생성자();
		TestInner.inner in=ti.new inner();
		System.out.println(ti+"/"+in);
//		안쪽클래스의 객체를 사용하여 안쪽클래스의 자원을 사용
		in.j=2022;
		in.useInJ();
		
		
	}//main

}//class
