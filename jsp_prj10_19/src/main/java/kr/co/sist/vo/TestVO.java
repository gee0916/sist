package kr.co.sist.vo;

public class TestVO {

	private String name;
	private int age;
	
	public TestVO() {
	}

	public TestVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName호출");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge호출");
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestVO [name=" + name + ", age=" + age + "]";
	}
	
}
