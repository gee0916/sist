package day0711;

/**
 * 일반 클래스인 HongGilDong은 자식클래스를 가질 수 있다
 * @author user
 */
public class HongGilDongSub extends HongGilDong{

//	부모클래스의 일반 method이므로 Override가 된다
	@Override
	public String[] language() {
		String[] lang= {"한국어"};
		return lang;
	}//language
	
//	test method는 부모클래스의 final method이므로 Override가 되지 않는다
//	@Override
//	public void test() {
//		System.out.println("변경없이 주는대로 사용할 것");
//	}
	
}//class
