package day0705;

/**
 * 주민번호 형식은 xxxxxx-xxxxxxx
 * @author user
 */
public class SsnProcess {

	private String ssn;
	private int birthYear;
	
	/**
	 * 1번. 주민번호를 입력받아 인스턴스 변수에 저장하는 생성자
	 * @param ssn
	 */
	public SsnProcess(String ssn) {
		this.ssn=ssn;
	}//end SsnProcess

	
	/**
	 * 2번. 입력된 주민번호의 길이가 14자인지 체크 반환
	 * 14자 true 아닐시 false
	 * @return
	 */
	public boolean ssnLength() {
		boolean ssnLength = true;
		ssnLength=ssn.length()==14;
		return ssnLength;
	}//end ssnLengthChk
	
	/**
	 * 3번. 입력된 주민번호에 '-'이 올바른 위치에 있는 지 체크
	 * 7번째 자리에 있으면 true 아닐시 false
	 * @return
	 */
	public boolean ssnHyphen() {
		boolean ssnHyphen = true;
		ssnHyphen=ssn.indexOf("-")==6;
		return ssnHyphen;
	}//end ssnHyphen
	
	/**
	 * 4번. 입력주민번호 xxxxxx-xxxxxxx -> xxxx년 x월 x일로 반환
	 * 뒷자리 1,2,5,6 : 1900년생
	 * 뒷자리 3,4,7,8 : 2000년생
	 * 뒷자리 0,9 : 1800년생
	 * @return
	 */
	public String birth() {
		String year = ssn.substring(0,2);
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		
		String bornYear=null;
		if(ssn.charAt(7)=='0'||ssn.charAt(7)=='9') {
			bornYear="18";
		} else if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||
				ssn.charAt(7)=='5'||ssn.charAt(7)=='6'){
			bornYear="19";
		}else if (ssn.charAt(7)=='3'||ssn.charAt(7)=='4'||
				ssn.charAt(7)=='7'||ssn.charAt(7)=='8') {
			bornYear="20";
		}//end else if
		birthYear=Integer.parseInt(bornYear+year);
		
		return birthYear+"년 "+month+"월 "+day+"일 ";
	}//end birth
	
	/**
	 * 5번. 입력된 주민번호에서 나이를 구함
	 * @return
	 */
	public int age() {
		return 2022-birthYear+1;
	}//end age
	
	/**
	 * 6번. 입력된 주민번호에서 성별을 구함
	 * @return
	 */
	public String gender() {
		String gender = null;
		if(Integer.parseInt(ssn.substring(7,8))%2==0) {
			gender="여자";
		}else if (Integer.parseInt(ssn.substring(7,8))%2==1) {
			gender="남자";
		}//end else if
		return gender;
	}//end gender
	
	/**
	 * 7번. 입력된 주민번호에서 띠를 구하기
	 * @return
	 */
	public String zodiac() {
		String zodiac = null;
		if (birthYear%12==0) {
			zodiac="원숭이";
		}else if(birthYear%12==1) {
			zodiac="개";
		}else if(birthYear%12==2) {
			zodiac="닭";
		}else if(birthYear%12==3) {
			zodiac="돼지";
		}else if(birthYear%12==4) {
			zodiac="쥐";
		}else if(birthYear%12==5) {
			zodiac="소";
		}else if(birthYear%12==6) {
			zodiac="호랑이";
		}else if(birthYear%12==7) {
			zodiac="토끼";
		}else if(birthYear%12==8) {
			zodiac="용";
		}else if(birthYear%12==9) {
			zodiac="뱀";
		}else if(birthYear%12==10) {
			zodiac="말";
		}else if(birthYear%12==11) {
			zodiac="양";
		}//end if
				return zodiac;
	}//end zodiac
	
	public String getSsn() {
		return ssn;
	}//end getSsn

}//class