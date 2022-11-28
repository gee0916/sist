package day0714;

import java.util.Random;

/**
 * Random => 난수를 얻기위한 목적으로 만들어진 클래스
 * @author user
 */
public class UseRandom {
	
	public UseRandom() {
		
//		1. 생성
		Random random=new Random();
		System.out.println(random);
		
//		2. 난수 얻기
		int num=random.nextInt();
		System.out.println("발생한 수 "+ num);
		System.out.println("범위의 수 "+num%10); //10가지의 수: 음~양수의 범위로 나온다
		System.out.println("범위의 수 "+Math.abs(num%10)); //10가지의 수: 양수만 얻기
		
		num=random.nextInt(10); //입력한 수의 범위만큼 난수 발생
		System.out.println("발생한 수 "+ num);
		
//		실수
		float f= random.nextFloat();
		double d=random.nextDouble();
		System.out.println(f);
		System.out.println("발생한 난수: "+d);
		System.out.println("발생한 난수 범위: "+d*5);
		System.out.println("발생한 난수 정수: "+(int)(d*5));
		
//		불린
		boolean b=random.nextBoolean();
		System.out.println(b);
		
	}//UseRandom
	

	public static void main(String[] args) {
		
		new UseRandom();


	}//main

}//class
