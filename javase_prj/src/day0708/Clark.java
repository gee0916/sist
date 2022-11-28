package day0708;

/**
 * 사람의 공통 특징은 부모클래스(Person)에서 제공하는 것을 사용하고,
 * 자신만의 특징을 정의
 * @author user
 */
public class Clark extends Person {

	public int power;
	
	/**
	 * 부모 클래스에 인자있는 생성자를 호출
	 */
	public Clark() {
		super(3,1,1);
		power=9;
	}//Clark
	
	/**
	 * 슈퍼맨의 힘을 설정하는 일
	 * @param stone 돌에 종류
	 * @return
	 */
	public String power(String stone) {
		String result="";
		if(stone.equals("다이아몬드")) {
			result="☆★감사합니다☆★";
			power=10;
		}else if(stone.equals("크립토나이트")) {
			result=";;;힘이빠지는중 OTL;;;";
			power=0;
		}else {
			result="아 !! 열받아(ㄱ-) !";
			power=12;
		}//end else
		return result;
	}//power
	
	@Override
	public String eat() {
		return getName()+"가 집에서 빵을 먹는다";
	}//eat
	
	@Override
	public String eat(String m, int p) {
		return getName()+"가 레스토랑에서 " + m+"인 음식을 " +p+ "$지불하고 사먹는다";
	}
	
	
}//class
