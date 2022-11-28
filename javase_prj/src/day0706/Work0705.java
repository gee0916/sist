package day0706;

/**
 * 업무를 제공하는 클래스
 * @author user
 */
public class Work0705 {
	
	private String ssn;
	
	public Work0705(String ssn) {
		this.ssn=ssn;
	}//Work0705
		
	/**
	 * 입력된 주민번호의 길이가 14자인지 체크하여 boolean으로 반환
	 * @return
	 */
	public boolean ssnLengthChk() {
//		boolean lengthFlag=true;
//		lengthFlag=ssn.length()==14;
////		if(ssn.length()==14) { //주민번호가 14자인가? lengthFlag=true;
////			lengthFlag=true;
////		}else {//그렇지 않은가? lengthFlag=false;
////			lengthFlag=false;
////		}//end else
//		return lengthFlag;
		return ssn.length()==14;
	}//ssnLengthChk
		
	
	/**
	 * 입력된 주민번호에 '-'이 올바른 위치에 있는지 체크하여 boolean으로 반환
	 * @return
	 */
	public boolean ssnHyphenChk() {
		boolean hyphenFlag=false;
		hyphenFlag=ssn.indexOf("-")==6;
//		if(ssn.indexOf("-")==6) {
//			hyphenFlag=true;
//		}else {
//			hyphenFlag=false;
//		}
		return hyphenFlag;
	}//ssnHyphenChk
	
	/**
	 * 뒷자리의 성별을 얻는 일
	 * @return
	 */
	private int getGenderFlag() {
		int genderFlag=0;
		genderFlag=ssn.charAt(7)-'0'; //0-48, 1-49, 2-50
//		genderFlag=Character.getNumericValue(ssn.charAt(7));
//		genderFlag=Integer.parseInt(ssn.substring(7,8));
		return genderFlag;
	}
		
	/**
	 * 생년을 얻는 일
	 * 판단기준'-'뒷자리가 1,2,5,6,이라면 1900년대생 3,4,7,8이라면 2000년대생, 0,9라면 1800년 대생입니다
	 * @return
	 */
	private int getBirthYear() {
		int year=0;
		int genderFlag=getGenderFlag();
		
		int[] temp= {1800,1900,1900,2000,2000,1900,1900,2000,2000,1800};
		year=temp[genderFlag];
		
//		if(genderFlag==1 || genderFlag==2 || genderFlag==5 || genderFlag==6) {
//			year=1900;
//		}else if(genderFlag==3 || genderFlag==4 || genderFlag==7 || genderFlag==8) {
//			year=2000;
//		}//end else if
		year += Integer.parseInt(ssn.substring(0,2));
		return year;
	}
	
	/**
	 * 생년월일
	 * @return
	 */
	public String birth() {
		String birthStr="";
		birthStr=getBirthYear()+"년 "+ssn.substring(2,4)+"월 "+ssn.substring(4,6)+"일";
		return birthStr;
	}//birth
	
	/**
	 * 나이
	 * @return
	 */
	public int age() {
		return 2022-getBirthYear()+1;
	}//age
	
	/**
	 * 성별
	 * @return
	 */
	public String gender() {
//		return getGenderFlag()%2==0? "여자":"남자";
//		String gender="여자";
//		if (getGenderFlag()%2==1) {
//			gender="남자";
//		}//end if
//		return gender;
		String[] gender={"여자","남자"};
		return gender [getGenderFlag()%2];
	}//gender
	
	public String zodiac() {
		String[] zodiacArr= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		return zodiacArr[getBirthYear()%12];
	}//zodiac
	
	
}//class
