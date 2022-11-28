package day0708;

public class Parent extends Object {
	
	public int i;

	public Parent() {
		this(50);
		System.out.println("부모클래스의 기본 생성자");
	}//Parent
	
	public Parent(int i) {
//		this();
		System.out.println("부모클래스의 인자 생성자 " + i);
	}//Parent
	
}
