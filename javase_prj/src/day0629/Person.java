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

public class Person {

//	객체생성되고 객체마다 각각 저장되어야하는 값은 instance variable로 선언
	String name;
	int year;
	
//	모든 객체가 같이 사용하는 값은 static variable로 선언
	
	static String adress ="서울시 강남구 역삼동";

	public static void main(String[] args) {

	Person p=new Person();
	
	p.name="김준호";
	p.year=20;
	System.out.println(p.name+", "+p.year+", "+Person.adress);

	p.name="김준식";
	p.year=21;
	System.out.println(p.name+", "+p.year+", "+Person.adress);
	
	p.name="김수진";
	p.year=19;
	System.out.println(p.name+", "+p.year+", "+Person.adress);
	
		
	}

}
