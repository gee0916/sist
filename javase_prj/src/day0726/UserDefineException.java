package day0726;

import java.util.Random;

/**
 * 사용자 정의 예외처리 클래스의 사용
 * @author user
 */
public class UserDefineException {
	
	public String kanghyun() throws TobaccoException{
		String result="";
		String[]  grade= {"초딩","중딩","고딩","대딩"};
		
		int randomNumber=new Random().nextInt( grade.length ); //0~3 까지 4개의 난수 발생
		String temp=grade[ randomNumber ];
		
		if( temp.equals("초딩")) {
			throw new TobaccoException(temp+"님 금연해주세요.");
		}//end if
		
		result = temp+"님 흡연 중 ('' )( '') 모른 척 지나간다.";
		
		return result;
	}//kanghyun

	public static void main(String[] args) {

		UserDefineException ude=new UserDefineException();
		
		try {
			String result=ude.kanghyun();
			System.out.println( result );
		}catch( TobaccoException e ) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
