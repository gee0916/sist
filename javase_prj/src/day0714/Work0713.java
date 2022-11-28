package day0714;

/**
 * 일을 하는 쪽
 * @author user
 */
public class Work0713 {
	
	public static final int UPPER=0; //대문자
	public static final int LOWER=1; //소줌자
	public static final int NOMERIC=2; //숫자
	
//	비밀번호를 생성하는 일
	public char[] createPassword() {
		char[] tempPass=new char[8];
		
//		대문자,소문자,숫자로 구성된 임의의 8자
//		int randomFlag=0;
//		for(int i=0; i <tempPass.length; i++) {
//			randomFlag=(int)(Math.random()*3); //대문자,소문자,숫자를 생성하기 위한 플래그변수
//			switch (randomFlag) {
//			case UPPER: tempPass[i]=(char)((int)(Math.random()*26)+65); break;
//			case LOWER: tempPass[i]=(char)((int)(Math.random()*26)+97); break;
//			default:tempPass[i]=(char)((int)(Math.random()*10)+48); //break;
//			}//end switch
//		}//end for
		
		String passCharSet="~!@#$%^&*()_+qwertyuiop[]asdfghjkl;'zxcvbnm,./1234567890-=";
		for(int i=0; i <tempPass.length; i++) {
			tempPass[i]=passCharSet.charAt((int)(Math.random()*passCharSet.length()) );
		}//end for
		
		return tempPass;
		
		
	}//createPassword
	
//	로또를 생성하는 일
	public int[] createLotto() {
		
		int[] lotto=new int[6];
		
//		1~45사이의 수 하나 얻기
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=((int)(Math.random()*45)+1);
//			현재 방에(인덱스=i) 발생한 수가 이전방(인덱스)에 존재하는지?
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) { //같은 값이 발생
//					현재 방의 값을 새로 생성하기 위해 인덱스를 1줄여주고
					i--;
					break; //비교하기 위한 안쪽 for를 빠져나간다
				}//end for
			}//end for
		}//end for
		
		return lotto;
	
	}//createLotto
	
	

}//class
