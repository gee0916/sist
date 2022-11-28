package kr.co.sist.vo;

public class TransactionVO {

	private String name;
	private int age;
	
	public TransactionVO() {
		super();
	}

	public TransactionVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TransactionVO [name=" + name + ", age=" + age + "]";
	}
	
}
