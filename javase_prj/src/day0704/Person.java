package day0704;

/**
 * 사람을 대상으로 만드는 클래스<br>
 * 명사적 특징: 눈, 코, 입 <br>
 * 동사적 특징: 먹는 일 <br>
 * 객체를 생성하여 사용 <br>
 * 객체화 방법) <br>
 * Person 객체명=new Person();
 * @author user
 *
 */
public class Person {

	private int eye, nose, mouth; //눈,코,입
	private String name; //이름
	
	/**
	 * Person 클래스의 기본생성자 (Default Constructor)
	 * 사람 객체가 생성되면 기본적으로 가지고 있어야할 값이나 코드를 설정
	 * 눈 2개, 코 1개, 입 1개
	 */
	public Person() {
		this(2,1,1);
	}//person
	
	
	/**
	 * Person 클래스의 기본생성자(Default Constructor)
	 * 사람 객체가 생성되면 기본적으로 가지고 있어야할 값이나 코드를 설정
	 */
//	public Person() {
//		System.out.println(this);
//		eye=2;
//		nose=1;
//		mouth=1;
//	}//Person
	
	
	/**
	 * Person 클래스의 인자있는 생성자(Overload된 Constructor)
	 * 사람 객체가 생성되면 기본적으로 가지고 있어야할 값이나 코드를 설정 <br>
	 * @param eye 눈의 수
	 * @param nose 코의 수
	 * @param mouth 입의 수
	 */
	public Person(int eye, int nose, int mouth) {
		System.out.println(this);
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}// Person
	
	/**
	 * 생성된 사람 객체에 눈의 개수를 설정하는 일
	 * @param eye 설정할 눈의 갯수
	 */
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye

	
	/**
	 * 생성된 사람 객체에 코의 개수를 설정하는 일
	 * @param nose 설정할 코의 갯수
	 */
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose

	/**
	 * 생성된 사람 객체에 입의 개수를 설정하는 일
	 * @param mouth 설정할 입의 갯수
	 */
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
		
	/**
	 * 생성된 사람 객체에 이름을 설정하는 일
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name=name;
	}//setName

	/**
	 * 생성된 사람객체가 가지고 있는 눈의 갯수를 얻는 일
	 * @return 눈의 갯수
	 */
	public int getEye() {
		return eye;
	}//getEye

	/**
	 * 생성된 사람객체가 가지고 있는 코의 갯수를 얻는 일
	 * @return 코의 갯수
	 */
	public int getNose() {
		return nose;
	}//getNose

	/**
	 * 생성된 사람객체가 가지고 있는 입의 갯수를 얻는 일
	 * @return 입의 갯수
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/**
	 * 생성된 사람객체가 가지고 있는 이름을 얻는 일
	 * @return 이름
	 */
	public String getName() {
		return name;
	}//getName
	
	/**
	 * 생성된 사람객체가 집에서 밥을 먹는 일
	 * @return 집에서 밥을 먹는 일
	 */
	public String eat() {
		return name+"이 집에서 밥을 먹는다";
	}//eat
	
	/**
	 * 생성된 사람 객체가 식당에서 사 먹는 일 (method overloading)
	 * @param menu 음식종류
	 * @param price 가격
	 * @return 식당에서 사먹는 일
	 */
	public String eat(String menu, int price) {
		return name+"이 식당에서 "+menu+"를 "+price+"원 내고 사먹는다";
	}//eat
	
	

}//class
