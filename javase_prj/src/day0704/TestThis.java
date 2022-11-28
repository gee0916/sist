package day0704;

public class TestThis {

	private int age;
	
	public void setAge(int age, TestThis tt) { //1
		System.out.println("setAge: "+ tt);
		System.out.println("this: "+ this);
		this.age=age; //2
//		System.out.println(++cnt);
//		if(cnt<5900) {
//		setAge(age, tt);//재귀호출 error
//		}
	}//setAge
	
	public int getAge()	{
		
		return age;
	}//getAge
	
	
	public static void main(String[] args) {

		TestThis tt=new TestThis();
//		System.out.println(this); static 영역은 객체가 생성되기 전에 호출되는 영역 이므로
//		this로 대체될 수 있는 객체의 주소가 존재하지 않는다 => error
		System.out.println("main"+tt);
//		this를 사용하지 않고, 변수에 직접접근하지 않고
		tt.setAge(20,tt); //3
//		20이 출력되는 코드를 수정하시오
		System.out.println("설정된 나이 "+tt.getAge());
		
		
	} //main

} //class
