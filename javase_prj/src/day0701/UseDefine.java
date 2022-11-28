package day0701;

/**
 * 사용자 정의 자료형,
 * 필요한 데이터형을 조합하여 새로운 이름으로 사용한 것
 * @author user
 */

public class UseDefine {

	public static void main(String[] args) {

		Persondate pd= new Persondate();
		pd.setName("정현지");
		pd.setAge(25);
		pd.setGender('여');
		pd.setAddr("경기도 광주시");
		
//		값얻기
		System.out.println(pd.getName()+" "+pd.getAge()+" "+pd.getGender()+" "+pd.getAddr());
		
		
	}//main

}//class
