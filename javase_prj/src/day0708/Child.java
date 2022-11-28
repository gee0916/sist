package day0708;

public class Child extends Parent{

	public Child() {
//		super(50);
		this(100);
		System.out.println("자식 기본 생성자");
	}//child
	
	public Child(int i) {
//		this();
		super();
		System.out.println("자식 인자 생성자 "+i);
	}//child
	
	
	public static void main(String[] args) {

//		Child c=new Child(10);
//		1.  부모기본, 부모인자 50, 자식기본, 자식인자100
		
//		Child c=new Child(100);
		
//		2.  부모인자 50, 부모기본, 자식인자100, 자식기본
		@SuppressWarnings("unused")
		Child c=new Child();
		
	}//main

}//class
