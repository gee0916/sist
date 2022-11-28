package day0725;

import javax.swing.JOptionPane;

/**
 * RunTimeException: 코드작성 시 발생되는 예외를 JVM이 자동으로 try~catch 처리하여
 * 예외메시지를 출력해주는 예외 (코드 작성에 에러가 발생하지 않기 때문에 개발자가 놓치기 쉽다)
 * @author user
 */
public class UseRunTimeException {

	//숫자 두개 입력 받아서 나눈 후 결과를 출력하는 일
	public UseRunTimeException() {
		
		String stringNum1=JOptionPane.showInputDialog("숫자 입력");
		String stringNum2=JOptionPane.showInputDialog("나눌 숫자 입력");
		
		int intNum1=0;
		int intNum2=0;
		int intResult=0;
		
		try {
			
			intNum1=Integer.parseInt(stringNum1);
			intNum2=Integer.parseInt(stringNum2);
		
			intResult=intNum1/intNum2; //예외발생 예상 코드 1. 예외발생
			
			//정상실행되었을 때 제공할 코드: 예외가 발생하면 실행되지 않는다
			System.out.printf("%d / %d = %d", intNum1,intNum2,intResult);
		}catch (ArithmeticException e) {
			//2. 예외가 발생했을 때 사용자에게 제공할 코드
			System.err.println("0으로 나눌 수 없습니다.");
		}catch (NumberFormatException nfe) {
			System.err.println("숫자로 변환할 수 없는 문자열이 입력되었습니다.");
		}catch (Exception e) {
			System.out.println("자식이 놓친 예외를 잡기위한 부모예외");
			System.out.println("간단한 메시지: "+e.getMessage());
		}finally {
			//반드시 실행되어야할 코드
			System.out.println("\n사용해주셔서 감사합니다.");
		}//end finally
		
	}//UseRunTimeException
	
	public static void main(String[] args) {
		
		new UseRunTimeException();

	}//main

}//class
