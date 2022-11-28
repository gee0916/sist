package day0701;

/**
 * JDK1.5에서 부처 지원되는 method 출력 method
 * @author user
 */

public class UsePrintf {

	public static void main(String[] args) {
		
		int day=1;
		
		System.out.println("안녕하세요? "+day+"일 입니다."); //출력메시지와 출력값이 섞여있다
		System.out.printf("안녕하세요? %d일 입니다.", day); //출력메시지와 출력값이 분리되어 사용

		System.out.printf("정수출력 %d\n", day);
		
		double d=2022.07;
		System.out.printf("실수출력 %f\n", d);
		
		char c='A';
		System.out.printf("문자출력 %c\n", c);
		
		String s="쌍용교육센터";
		System.out.printf("문자열출력 %s\n", s);
		
		System.out.printf("[%d][%6d][%-5d]\n",2022,2022,2022);
		System.out.printf("[%c][%6c][%-5c]\n",'A','A','A');
		System.out.printf("[%f][%6.2f][%-5.3f]\n",2022.0701,2022.0701,2022.0701);
		System.out.printf("[%s][%6s][%-5s]\n","정현지","정현지","정현지");
		System.out.println("------------------------------------------------");
		System.out.format("[%d][%6d][%-5d]\n",2022,2022,2022);
		System.out.format("[%c][%6c][%-5c]\n",'A','A','A');
		System.out.format("[%f][%6.2f][%-5.3f]\n",2022.0701,2022.0701,2022.0701);
		System.out.format("[%s][%6s][%-5s]\n","정현지","정현지","정현지");
	
	}//main

}//class
