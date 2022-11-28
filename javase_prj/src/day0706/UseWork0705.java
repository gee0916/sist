package day0706;

/**
 * Work0705 객체가 제공하는 기능을 사용하는 클래스
 * @author user
 */
public class UseWork0705 {

	public static void main(String[] args) {
		String ssn="950102-1234567";
				
		Work0705 work=new Work0705(ssn);
		
		System.out.println("주민번호: "+ssn);
		if(work.ssnLengthChk()) { //주민 번호의 자릿수가 올바름
			if(work.ssnHyphenChk()) {
				System.out.println("생년월일: "+work.birth());
				System.out.println("나이: "+work.age());
				System.out.println("성별: "+work.gender());
				System.out.println("띠: "+work.zodiac());
			}else {
				System.out.println("'-'이 정상적인 위치에 없습니다.");
			}//end else
		}else {
				System.out.println("주민번호의 글자수가 맞지 않습니다.");
		}//end else
		
		
	}//Work0705

}//class
