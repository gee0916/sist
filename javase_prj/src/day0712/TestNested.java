package day0712;

/**
 * 중첩클래스
 * 안쪽클래스를 static변수처럼 사용
 * @author user
 */
public class TestNested {
	
	int i;
	static int j;
	
	public TestNested() {
		System.out.println("바깥클래스의 생성자");
	}//TestNested
	
	public void useI() {
		System.out.println("바깥 변수 i: "+ i);
	}//useI
	
	public static void useJ() {
		System.out.println("바깥 변수 j: "+ j);
		System.out.println("-------------");
//		동일 영역인 static영역을 바ㅗㄹ 접근가능하다
		Nested.k=40;
		Nested.useK();
	}//useJ
	
	/////////////중첩클래스 시작: TestNested$Nested.class//////////////////////

//	클래스 내부 자원을 static으로 만들어두고 사용한다
	static class Nested{
//		class의 접근 지정자가 static일지라도 class내부영역은 instance 영역임
		static int k;
		
		public static void useK() {
			System.out.println("내부 변수 k: "+k);
//			useJ();
		}
	}//class
	
	
	/////////////중첩클래스 끝////////////////////////////////////////////////
	
	public static void main(String[] args) {
		useJ(); //바깥클래스의 static method
//		바깥클래스에서 안쪽 클래스를 사용 (문법 :static 문법)
		Nested.useK(); //static 문법으로 접근 가능
		

	}//main

}//class
