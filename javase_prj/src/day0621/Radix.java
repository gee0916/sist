package day0621;
/**
다양한 진수의 사용
다양한 진수를 사용하여 코딩 하더라도 결과는 10진수로 출력된다
서로다른 진수를 연산하면 이진수로 변환되어 저장하고 이진수로 연산되어 10진수로 출력된다
*/

class Radix {
	public static void main(String[] args) {
		int i=10;
		System.out.println("10진수(decimal): "+ i);

		int j=012;
		System.out.println("8진수(octal): "+ j);

		int k=0xA;
		System.out.println("16진수(Hex): "+ k);

		System.out.println("서로 다른 진수의 연산: "+ (i + j +k)); //10진수로 결과가 나온다

//		int tel=01012345678;
//		System.out.println(tel);

		i=300;
		System.out.println(i+"를 2진수로 "+ Integer.toBinaryString(i));
		System.out.println(i+"를 2진수로 "+ Integer.toOctalString(i));
		System.out.println(i+"를 2진수로 "+ Integer.toHexString(i));



	}//main
}//class
