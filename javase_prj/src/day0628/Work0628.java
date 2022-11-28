package day0628;

public class Work0628 {

	public static void main(String[] args) {

//		1. 구구단 전체 단 출력
		for(int i=1; i<10; i++ ) {
			System.out.println();
			for(int j=2; j<10; j++) {
				System.out.print(j+"X"+i+"="+i*j+" ");
			}//end for
		}//end for
		System.out.println();
		System.out.println("------------------------------------------");
	
//		2
		for(int i=0; i<10; i++) {
			System.out.println(i);
			for(int j=-1; j<i; j++) {
				System.out.print(" ");
			}//end for
		}//end for
		
	}//main

}//class
