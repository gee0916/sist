package day0715;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Work0714 {

	/**
	 * CSV 데이터를 입력받아 , 로 구분한 후 String[]로 반환하는 일
	 * @param csvData
	 * @return
	 */
	public String[] csvProcess(String csvData) {
		
		String[] data=null; //1. 변수선언 (return 변수를 먼저 선언할 것) 
//		2. 입력된 데이터를 사용하요 , 를 기준으로 토큰을 생성
		StringTokenizer stk=new StringTokenizer(csvData, ","); //,를 기준으로 토큰을 만든다
		
		data=new String[stk.countTokens()];
		
//		for(int i=0; stk.hasMoreTokens(); i++) {
//			data[i]=stk.nextToken();
//		}

		int i=0;
		while(stk.hasMoreTokens()) { //토큰이 존재한다면
//			3. 배열에 값 할당
			data[i]=stk.nextToken();
			i++;
		}//end while

		return data;
		
	}//csvProcess
	
	public String dateProcess(int nation) {
		
		String date="";
		
		if(!(nation >-1 && nation < 4)) {
			nation=0; //한국을 보여주기 위해 0으로 초기화
		}//end if
		
		Locale[] loc= {Locale.KOREA,Locale.UK,Locale.CANADA,Locale.JAPAN};
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a EEEE",loc[nation]);
		date=sdf.format(new Date());
		
		
		return date;
		
	}//dataProcess
	
	
	
}//class
