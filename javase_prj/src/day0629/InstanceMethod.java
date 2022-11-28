package day0629;

/**
 * 
 * @author user
 *
 */

public class InstanceMethod {
	
	public void duplicationJob() {
		
		for(int i=1; i<10; i++) {
			 System.out.println("9*"+i+"="+9*i);	
			}//end for
		
	}//duplicationJop 
	
	public static void main(String[] args) {
//		직접호출할 수 없다
//		duplicationJo();
		
//		1. 객체화
		InstanceMethod im=new InstanceMethod();

		
		System.out.println("코딩중 ...");
		System.out.println("코딩중 ...");
		System.out.println("코딩중 ...");

//		2. method 호출 : 중복코드를 최소화
		im.duplicationJob();
		
		System.out.println("코딩중 ...");
		System.out.println("코딩중 ...");
		System.out.println("코딩중 ...");

		im.duplicationJob();
		
	}//main

}//class
