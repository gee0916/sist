package day0624;

/**
 * 실행법)
 * java 패키지명.클래스명 값 값 값
 * @author user
 *
 */

public class ProgramArguments {

	public static void main(String[] args) {
		

//		System.out.println("처음 입력값"+args[0]);
//		System.out.println("두번째 입력값"+args[1]);
//		System.out.println("두번째 입력값"+args[2]);
		
			System.out.println(args[0]+args[1]); //문자열은 연산되지 않는다
			
//		int i=args[0]; //참조형데이터형(String에 args)은 기본형 데이터형(int)에 할당 될 수 없음
	
			//Wrapper class를 사용하여 String을 int로 변환하여 저장
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[0]);
		
		//문자열이 정수로 변환되어 연산이 가능
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
			
//		double num1=Double.parseDouble(args[0]);
//		double num2=Double.parseDouble(args[0]);
//		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
		
	}//main

}//class
