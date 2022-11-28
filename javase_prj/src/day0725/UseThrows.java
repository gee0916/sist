package day0725;

import java.util.Random;

/**
 * method안에서 발생한 예외를 method를 호출한 곳에서 처리하도록 던지는 
 *  throws의 사용.
 *  
 *   throws가 정의된 method안에서는 try~catch를 처리할 필요가 없다.
 *   
 *   예외발생예상 코드와 예외처리코드를 분리할 수 있다.( 코드의 복잡도를 낮춘다.)
 *   
 *    문법)
 *     접근지정자 반환형 method명(매개변수 ,,, ) throws 예외처리클래스명,,, {
 * @author user
 */
public class UseThrows {
	
	public void work() throws ClassNotFoundException{
		System.out.println("클래스를 로딩하는 일을 하는 method");
		String className="java.lang.Integer";
		if( new Random().nextBoolean() ) {
			className="TestMenu";
		}//end if
		
		Class.forName(className);//throws로 예외를 날리면 try~catch할 필요가 없다.
		System.out.println("로딩성공");
		
	}//work
	
	public void useWork() {
		System.out.println("일을 사용하는 method");
		try {
			work();//일 처리 수행
		} catch (ClassNotFoundException e) {
			//일 처리중 예외가 발생하면 호출한 곳에서 예외를 처리한다.  
			e.printStackTrace();
		}
	}//work

	public static void main(String[] args) {
		UseThrows ut=new UseThrows();
		ut.useWork();
	}//main

}//class
