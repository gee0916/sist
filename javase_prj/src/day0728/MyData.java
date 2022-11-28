package day0728;

import java.io.Serializable;

/**
 * 일반 클래스는 객체직렬화가 되지않아 Object Stream 타고 외부로 나갈 수 없다.
 * @author user
 */
@SuppressWarnings("serial")
public class MyData implements Serializable{
	
	/**
	 * 발급일자 : 22-07-28
	 * 파기일자 : 23-07-28
	 */
//	private static final long serialVersionUID = -5934805185081274840L;
	
	private String name;
	private int age;
	private double height;
	private transient double weight;
	
	public MyData() {
	}

	public MyData(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "MyData [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
