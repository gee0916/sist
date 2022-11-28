package day0712;

/**
 * 지역클래스의 사용
 * @author user
 */
public class TestLocal {
	int i;
	
	public TestLocal() {
		System.out.println("바깥클래스의 생성자");
	}//TstLocal
	
	public void test(int paramI, final int paramJ) {
		int localI=0;
		final int localJ=1;
		
		////////////////////local class 시작 ////////////////////
		
		class Local {
			int locI;
			
			public Local() {
				System.out.println("지역클래스의 생성자");
			}//Local
			
			public void useLocI() {
				System.out.println("지역클래스 변수: "+locI);
				System.out.println("바깥 클래스의 intstance 변수: "+ i );
				System.out.println("매개변수 : paramI : "+ paramI +", paramJ : "+paramJ );
				System.out.println("지역변수 : localI : "+ localI +", localJ : "+localJ );
			}//useLocI
			
		}//class
		
		///////////////////local class 끝///////////////////////
		Local loc=new Local();
		loc.useLocI();
		
	}//test

	public static void main(String[] args) {

		TestLocal tl=new TestLocal();
		tl.test(2022, 7);
		
		
	}//main

}//class
