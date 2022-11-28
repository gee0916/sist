package day0621;
/**
자동 형 변환
연산, 변수에 값 할당
*/

class Promotion{
	public static void main(String[] args) {
		byte b1=10; //-128~+127
		byte b2=10;

		int result=b1+b2; //자동형변환 int의 하위 데이터 형이 연산되면 결과가 int로 발생한다
		//연산된 결과를 저장하기 위해 변수의 데이터형을 int로 선언한다

		System.out.println(b1+"+"+b2+"="+result);

		char c1='A';
		char c2='B';
		System.out.println(c1+"+"+c2+"="+(c1+c2));

		int i=10;
		long l=20;
		long result2=i*l; //int가 long으로 변환된 후 long과 연산하여 long을 결과를 내어준다
		System.out.println(i+"+"+l+"="+result2);

	}//main
}//class
