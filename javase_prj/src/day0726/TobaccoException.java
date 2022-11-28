package day0726;

/**
 * 사용자 정의 예외처리 클래스<br>
 * 
 * 개발자가 구현하는 업무의 명칭과 맞는 예외처리클래스가 존재하지 않는다면 
 *  사용자가 구현하는 업무의 명칭과 맞는 예외처리 클래스를 구현하여 사용한다.
 *  
 *  구현방법)
 *   Compile Exception을 작성. => Exception을 상속한다.
 *   RuntimeException을 작성 => RuntimeException 상속한다.   
 * @author user
 */
//상속을 함으로 자식클래스는 부모클래스의 기능을 그대로 사용할 수 있다. => 코드의 재 사용성 향상.
// 부모가 제공하는 기능이 나한테 맞지 않아 => Override
@SuppressWarnings("serial")
public class TobaccoException extends Exception{

	public TobaccoException() {
		 this("지나친 흡연은 건강에 해롭습니다. ");
	}//TobaccoException
	
	public TobaccoException(String msg) {
		super( msg );
	}//TobaccoException
	
	
}//class
