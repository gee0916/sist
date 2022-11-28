package day0704;

/**
 * 사람클래스를 객체화하여 사용하는 일
 * @author user
 *
 */
public class UsePerson {

	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {
		
//		4.객체생성
		Person ogong= new Person(); //heap에 생성되고 인스턴스 변수가 자동초기화된다
		
		ogong.setName("손오공");
		
//		인스턴스 변수에 설정된 값 얻기
		System.out.printf("눈 %d, 코 %d, 입 %d, 이름 %s \n", 
				ogong.getEye(), ogong.getNose(), ogong.getMouth(), ogong.getName());
		
//		5. 객체가 제공하는 기능의 사용
//		Overload된 기능을 사용하므로 하나의 method만 사용하면 된다
		System.out.println(ogong.eat());
		System.out.println(ogong.eat("냉면", 8000));
		
		System.out.println("------------------------------------------------------");
//		자신이름의 객체를 생성하고 사용
		
		Person hyeonji=new Person();
		
		hyeonji.setEye(2);
		hyeonji.setNose(1);
		hyeonji.setMouth(1);
		hyeonji.setName("정현지");
	
		System.out.printf("눈 %d, 코 %d, 입 %d, 이름 %s \n", 
				hyeonji.getEye(), hyeonji.getNose(), hyeonji.getMouth(), hyeonji.getName());
	
		System.out.println(hyeonji.eat());
		System.out.println(hyeonji.eat("초밥",15000));
		
		System.out.println("------------------------------------------------------");
		Person jinban=new Person(3,1,1);
		jinban.setName("천진반");
		System.out.printf("눈 %d, 코 %d, 입 %d, 이름 %s \n", 
				jinban.getEye(), jinban.getNose(), jinban.getMouth(), jinban.getName());
	
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두",0));
	
	}//main

}//class
