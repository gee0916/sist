package day0628;

/**
 * 다중 for: 바깥 for가 한 번 돌때 안쪽 for는 몇 번 동작하는가?
 * @author user
 */

public class TestFor2 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			System.out.println("바깥 for 시작");
			for(int j=0; j<6; j++) {
				System.out.println("i = "+i+", j = "+j);
		}//end for
			System.out.println("바깥 for 끝");
		}//end for
		System.out.println("-----------------------------------------");
		
		for(int i=2; i<10; i++) {
				System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}//end for
			System.out.println();
		}//end for
		System.out.println("-----------------------------------------");
		
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<=i; j++) {
				System.out.print(i +" "+ j+" ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=i+1; j<6; j++) {
				System.out.print(i +" "+ j+" ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		  
		
	}//main

}//class
