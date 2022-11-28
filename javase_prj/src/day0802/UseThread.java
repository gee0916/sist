package day0802;

/**
 * method 호출을 동시에 해야할 필요가 있을 때 Thread를 사용한다
 * 실행할때마다 다른 결과가 나온다
 * @author user
 */
//1. Thread클래스를 상속 받는다
public class UseThread extends Thread {
	
	//2. run() method를 Override
	@Override
	public void run() {
		//3. Thread로 동작할 코드 정의 (동시에 실행된다)
		for(int i=0; i<500; i++) {
			System.out.println("run i--------->"+i);
		}//end for
	}//run
	
	public void work() {
		//3. Thread로 동작할 코드 정의 (동시에 실행된다)
		for(int i=0; i<500; i++) {
			System.out.println("work i=========>"+i);
		}//end for
	}//run
	
	public static void main(String[] args) {
		//4. 객체 생성
		UseThread ut=new UseThread();
		//5. start()를 호출하여 Thread를 동작시킨다 (run()호출)
		ut.start();
//		ut.run(); //run을 직접 호출하면 Thread로 동작하지 못한다
		ut.work();
		
	}//main

}//class
