package day0713;

/**
 * 수학클래스 사용
 * @author user
 */
public class UseMath {
	
	public void useMath() {
		
//		생성자가 없으므로 객체화 할 수 없다
//		Math m = new Math();
		int i=-7;
		System.out.println(i+"의 절대 값 : "+Math.abs(i));
		
		double d=2022.7;
		System.out.println(d+"를 반올림 : : "+Math.round(i));
		
		d=2022.4;
		System.out.println(d+"를 반올림 : : "+Math.round(i));
		
		System.out.println(d+"를 올림 : : "+Math.ceil(i));
		
		d=2022.7;
		System.out.println(d+"를 내림 : : "+Math.floor(d));
		
		System.out.println(d+"를 소수점 이하 절사 : : "+(int)d);
		
//		System.out.println(Math.random());
		
		d=Math.random();
		System.out.println("발생한 수 "+d);
		System.out.println("범위의 수 "+d*10); // 0~9
		System.out.println("범위의 수 정수만 얻기 "+(int)(d*10)); // 0~9
		System.out.println("범위의 수 정수만 얻기 "+((int)(d*10)+1)); // 1~9
		
//		알파벳 대문자 A(65)~Z(90)까지 중 하나의 문자를 출력
		int temp=(int)(d*26);
		System.out.println(temp+" / "+(char)(temp+65)); // 대문자
		System.out.println(temp+" / "+(char)(temp+97)); // 소문자
		
//		문자 0(48)~9(57)중 하나 출력
		temp=(int)(d*10);
		System.out.println(temp+" / "+(char)(temp+48)); // 숫자
		
		
	}//useMath

	public static void main(String[] args) {

		new UseMath().useMath();
		
	}//main

}//class
