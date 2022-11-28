package day0629;

/**
 * 이름과 나이, 주소를 저장할 수 있는 Person이라는 클래스를 만들고
 * 객체를 생성하여 변수에 아래의 값을 저장
 * 
 * String name;
 * name="김테스트";
 * 
 * 아래 데이터는 한 가족의 데이터다.
 * 김준호,20, 서울시 강남구 역삼동
 * 김준식, 21, 서울시 강남구 역삼동
 * 김수진 19, 서울시 강남구 역삼동
 * @author user
 */

public class Person2 {

//	객체생성되고 객체마다 각각 저장되어야하는 값은 instance variable로 선언
	String name;
	int year;
	
//	모든 객체가 같이 사용하는 값은 static variable로 선언
	
	static String adress ="서울시 강남구 역삼동";

	public static void main(String[] args) {
	
	Person2 junho=new Person2();
		junho.name="김준호";
		junho.year=20;

	Person2 junsik=new Person2();
		junsik.name="김준식";
		junsik.year=21;
	
	Person2 sujin=new Person2();
		sujin.name="김수진";
		sujin.year=19;
	
	System.out.println(junho.name+", "+junho.year+", "+Person2.adress);
	System.out.println(junsik.name+", "+junsik.year+", "+Person2.adress);
	System.out.println(sujin.name+", "+sujin.year+", "+Person2.adress);
	
		
	}

}
