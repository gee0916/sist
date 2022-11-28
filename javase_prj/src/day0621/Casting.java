package day0621;
/**
강제 형 변환: 개발자가 변수나 상수의 값을 원하는 데이터형으로 변환하는 것
(원본 값을 변경하지 않는 일시적인 변환)
*/

class Casting {
	public static void main(String[] args) {
		//자동 형 변환의 결과를 강제형 변환
		byte num1=10;
		byte num2=20;
		byte result=(byte)(num1*num2);

		System.out.println(num1+"+"+num2+"="+result);

		//리터럴은 그대로 두고 할당될때 크기를 줄여 할당. (값 손실 발생)
		float f=(float)3.14;
		System.out.println("실수상수의  casting "+f);

		float f2=(float)3.5555555555;
		System.out.println("실수상수의  casting "+f2);

		double b=2022.0621;
		int i=0;

		i=(int)b;//2022.0621의 값 중 실수값이 사라지고 정수값만 할당된다.
		System.out.println("원본 값: "+b+" 강제형 변환된 값: "+i);

		//boolean은 다른 형으로 강제 형 변환되지 않는다.
		boolean flag=false;
//		i=(int)flag;
		boolean flag2=flag;
		System.out.println(flag+","+flag2);

		//기본형 데이터형이 참조형 데이터형으로 강제 형 변환 되지 않는다
//		i=100;
//		String s=(String)i;//error
//		String s="100";
//		i=(int)s;//error

		//int 형에 j라는 변수에는 122가 들어있다. 122에 해당하는 문자를 출력해보세요
		int j=122;
		char c=(char)j;
		System.out.println((char)j); //정수입력 =>정수출력
		System.out.println(c); //문자입력 => 문자출력

		char c2='S';
		j=c2;
		System.out.println(c2+"의 Unicode: "+j);



	}//main
}//class
