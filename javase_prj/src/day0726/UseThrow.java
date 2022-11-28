package day0726;

import javax.security.auth.login.FailedLoginException;
import javax.swing.JOptionPane;

/**
 * 예외강제 발생.
 * 
 * 특정상황에서 예외를 발생시켜 업무를 처리.( 코드를 분리할 수 있다. )
 * 
 * 발생된 예외는 바로 try~catch를 사용하여 method안에서 처리하든, 
 *  throws 날려 호출한 곳에서 처리하든 처리해야 한다. 
 * @author user
 */
public class UseThrow {
	
	/**
	 * 아이디와 비밀번호를 입력받아 인증을 수행
	 * 문제가 발생하면 호출한 곳에서 처리하는 일.
	 * @param id
	 * @param password
	 */
	public void login(String id,String password) {
		if(id.equals("admin")&&password.equals("1234")) {
			//로그인 성공
			JOptionPane.showMessageDialog(null, "로그인 성공하셨습니다.");
		}else {
			//로그인 실패
			JOptionPane.showMessageDialog(null,
					"아이디나 비밀번호를 확인하세요!","실패",JOptionPane.ERROR_MESSAGE);
		}//end else
	}//login
	
	/**
	 * 예외를 사용한 로그인 업무 처리
	 * @param id 로그인할 아이디
	 * @param password 비밀번호
	 * @throws FailedLoginException 로그인 실패했을 때 발생한 예외
	 */
	public void exceptionLogin(String id,String password)throws FailedLoginException {
		if( !(id.equals("admin")&&password.equals("1234"))) {
			//문제가 발생했고 호출한 곳에서 인식하고 처리하도록 예외를 강제로 발생.
			//문법) throw new 예외처리클래스( 메시지 );
				throw new FailedLoginException("로그인 실패 : 아이디나 비밀번호를 확인하세요.");
		}//end if
		
		//로그인 성공했을 때 제공할 코드들...
		JOptionPane.showMessageDialog(null, "로그인 성공하셨습니다.");
	}//login

	public static void main(String[] args) {
		UseThrow ut=new UseThrow();
		
		ut.login("admin", "1234");//성공과 실패를 한번에 처리 
		
		System.out.println("---------------------------");
		
		try {
			ut.exceptionLogin("admin1", "1234");//성공은 method안에서
		} catch (FailedLoginException e) {
			//실패는 method 밖에서
			JOptionPane.showMessageDialog(null,
					"아이디나 비밀번호를 확인하세요!catch block","실패",JOptionPane.ERROR_MESSAGE);
			
			System.err.println("간단한 메시지 : "+ e.getMessage());
			System.err.println("객체출력 : "+ e);
			e.printStackTrace();//자세한 출력
		}//end catch
		
	}//main

}//class
