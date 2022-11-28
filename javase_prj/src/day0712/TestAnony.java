package day0712;

public class TestAnony {
	
	public void useFly(Fly fly) {
		System.out.println(fly.lift()); //"리프트"출력
		System.out.println(fly.divingForce()); //"추진력"출력
	}//useFly

	public static void main(String[] args) {
//		1. 객체화
		TestAnony ta=new TestAnony();
		
//		2. Fly를 구현한 클래스를 객체화
		FlyImpl fi=new FlyImpl();
		
//		3. Fly를 매개변수로 받는 method 호출
		ta.useFly(fi);
		
		System.out.println("---------------------");
		
//		anonymous inner class
		 ta.useFly(new Fly() {

			@Override
			public String lift() {
				return "익명클래스";
			}

			@Override
			public String divingForce() {
				return "익명클래스의 추진력";
			}
			
		 });
	
	}//main

}//class
