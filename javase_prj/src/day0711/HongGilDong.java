package day0711;

/**
 * 홍길동은 사람의 공통특징을 상속으로 처리하고.
 * 자신만의 특징인 싸움을 하는 일만 구현한다
 * 일반 클래스로 얼마든지 자식 클래스를 가질 수 있고
 * 자식 클래스에서 제공하는 기능(일=method)을 확장하여 사용할 수 있다
 * method의 override를 막고싶다면 method에 접근 지정자로 final을 붙인다.
 * @author user
 *
 */
public class HongGilDong extends Person {
	
	private int level;
	
	/**
	 * 부모 클래스의 기본 생성자를 호훌하는 홍길동의 기본생성자
	 */
	public HongGilDong() {
		super(2,1,1);
		level=6;
	}//HongGilDong
	
	/**
	 * 홍길동 객체만의 특징인 싸움을 하는 일을 구현
	 * @param yourLevel
	 * @return
	 */
//	@Deprecated
	public String fight (int yourLevel) {
		String result="";
		
		if(level > yourLevel ) {
			
			result="싸움에서 이김. v^-^v";
			level++;
			
			if(level>10) {
				level=10;
			}//end if
			
		}else if(level < yourLevel){
			
			result="싸움에서 졌음  ㅠ_ㅠ ";
			level--;
			
			if(level<4) {
				level=4;
			}//end if
		}else {
			result="싸움에서 비김 -_-^ ";
		}//end else
		
		return result;	
	}//fight
	
	@Override
	public String eat() {
		return getName()+"이 집에서 밥을 먹는다.";
	}
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"이 주막에서 "+menu+"을 "+price+"푼 내고 사먹는다";
	}//eat

	@Override
	public String[] language() {
		String[] lang= new String[3];
		lang[0]="한국어";
		lang[1]="만주어";
		lang[2]="수화";
		return lang;
	}//language
	
	public final void test() {
		System.out.println("변경없이 주는대로 사용할 것");
	}


}//class
