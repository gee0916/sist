package day0802;

/**
 * Thread: 동시에 method를 호출해야할 때
 * @author user
 */
//1. Runnable interface를 구현
public class UseRunnable implements Runnable {

	//2. run() method를 Override
	public void run() {
		//3. Thread로 동작할 코드 정의 (동시에 실행되어야할 코드) 정의
		for(int i=0; i<500; i++) {
			System.out.println("run ===== i ="+i);
		}//end for
	}//run
	
	public void work() {
		for(int i=0; i<500; i++) {
			System.out.println("work i --------- "+i);
		}//end for
	}//run
	
	public static void main(String[] args) {
		//4. 클래스를 객체화
		UseRunnable ur=new UseRunnable();
		//5. Thread 클래스와 has a 관계로 객체화
		Thread t=new Thread(ur);
		//6. Thread의 start() 호출
		long startTime=System.currentTimeMillis();
		t.run();
		ur.work();
		long endTime=System.currentTimeMillis();
		System.out.println("코드 실행 시간 "+(endTime+startTime)+"ms");
		
	}//main

}//class
