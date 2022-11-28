package day0708;

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
//		Date date = new Date();
//		System.out.println(date.getYear()+1900);
		
		HyeonJi hj=new HyeonJi();
		System.out.printf("눈 %d개, 코 %d개, 입 %d개\n",
				hj.getEye(), hj.getNose(), hj.getMouth());
		hj.setName("정현지");
		System.out.printf("이름: %s\n", hj.getName());
		System.out.println(hj.eat());
		System.out.println(hj.eat("엽떡",3));
		System.out.println(hj.eating(1));
		System.out.println(hj.eating(2));
		System.out.println(hj.eating(3));
		
	}//main

}//class
