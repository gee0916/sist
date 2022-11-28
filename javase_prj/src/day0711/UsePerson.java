package day0711;

//import java.util.Date;

/**
 * 사람클래스를 객체화하여 사용하는 일
 * @author user
 */
public class UsePerson {

	/**
	 * Java Application
	 * @param args
	 */
	public static void main(String[] args) {
//	4. 객체생성:공통특징만 정의된 부모 클래스가 아닌 자식 클래스로 객체화를 한다
		
		HongGilDong hgd=new HongGilDong();
//		부모클래스에 있는 method 사용 (코드의 재사용성)
		System.out.printf("눈 %d개, 코 %d개, 입 %d개\n",
				hgd.getEye(), hgd.getNose(), hgd.getMouth());
		hgd.setName("홍길동");
		System.out.printf("이름: %s\n", hgd.getName());
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("국밥",1)); //부모에서 제공하는 기능이 맞지않는다
		System.out.println(hgd.fight(5)); //6->7
		System.out.println(hgd.fight(6)); //7->8
		System.out.println(hgd.fight(9)); //8->7
		System.out.println(hgd.fight(7)); //7==7
		
		System.out.println("---------------------------------");
		
		Clark superman= new Clark();
		
		System.out.printf("눈 %d개, 코 %d개, 입 %d개\n",
				superman.getEye(), superman.getNose(), superman.getMouth());
		superman.setName("클락 켄트");
		System.out.printf("이름: %s\n", superman.getName());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크",5)); //부모에서 제공하는 기능이 맞지않는다
		System.out.println(superman.power("짱돌"));
		System.out.println(superman.power("다이아몬드"));
		System.out.println(superman.power("크립토나이트"));
		
		System.out.println("------------------------------------");
		
//		7월 11일 코드 추가
//		사람 객체가 구사할 수 있는 언어를 출력
		UsePerson up=new UsePerson();
		up.printlang(hgd);
		up.printlang(superman);
		System.out.println("--------------------------");
//		superman이 날기위한 기능을 구현
		System.out.println(superman.divingForce());
		System.out.println(superman.lift());
		
	}//main

	/**
	* Person의 모든 자식을 다 받을 수 있다
	* @param person
	*/
	public void printlang(Person person) {
//		person
		System.out.println(person.getName()+"이(가) 구사할 수 있는 언어");
		
		String[] lang=person.language();
		
		for(int i=0; i<lang.length;i++) {
			System.out.println(lang[i]);
		
		}//end for	
	
	}//printlang
		
}//class
