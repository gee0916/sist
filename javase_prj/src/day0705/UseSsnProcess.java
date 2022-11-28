package day0705;

public class UseSsnProcess {

	public static void main(String[] args) {

		String ssn="950102-1234567";
		
		SsnProcess sp=new SsnProcess(ssn);
		
		if(sp.ssnLength()) {
			if(sp.ssnHyphen()) {
				System.out.println("입력주민번호: "+sp.getSsn());
				System.out.println("생년월일: "+sp.birth());
				System.out.println("나이: "+sp.age());
				System.out.println("성별: "+sp.gender());
				System.out.println("띠: "+sp.zodiac());
			}else {
				System.out.println("'-'이 정상적인 위치에 없습니다.");
			}
		}else {
				System.out.println("주민번호의 글자수가 맞지 않습니다.");
		}//end else
		
	}//main

}//class