package day0630;

/**
 * 마카펜으로 클래스를 사용하여 객체로 만들고 사용하기 위한 클래스 
 * @author user
 *
 */
public class UseMarker {

	
	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {
//	마카펜을 사용하기 위한 작업
//	1. instantiate : 인스턴스화 (설계도에서 구현체를 생성)
		Marker black=new Marker(); // instance variable가 heap메모리에 올라가면서 초기화된다
		
//	2. 생성된 객체에 필요한 값을 설정하고
//		black color를 검은색, 뚜껑을 한개, 몸체를 한개로 설정해보세요
////		black.color="검은색" <- 직접 설정 불가 => setter method를 사용
//		07-04 기본 생성자 추가 후 코드수정
//		black.setColor("검은");
//		black.setCap(1);
//		black.setBody(1);
		
//		데이터형 변수명 = 객체명.method명();
		String color=black.getColor();
		System.out.println("색 : "+color);
		
		int cap=black.getCap();
		System.out.println("뚜껑 갯수 : "+cap);
		
		int body=black.getBody();
		System.out.println("몸체 갯수 : "+body);
		
//	3. 사용
		System.out.println( black.write("안녕하세요"));

		System.out.println("-----------------------------------");
		Marker blue=new Marker("파란",1,1);
		System.out.println("색 : "+blue.getColor()+"뚜껑 갯수 : "+blue.getCap()+ "몸체 갯수 : "+blue.getBody());
		System.out.println(blue.write("안녕하세요?"));
		
	}//main

}//class
