package day0714;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UseWork0714 {
	
	public void useData() {
		
		String csvData="Java,Oracle,JDBC,HTML,CSS,JavaScript,Servlet,JSP";
		
		Work0714 w=new Work0714();
		@SuppressWarnings("unused")
		String[] csv=w.data(csvData);
		
		
	}//useData
	
	public void useNum() {
		
		Work0714 w=new Work0714();
		String date=w.num(1);
		//이코드는 배열을 사용하는 것이 좋아요
		SimpleDateFormat sdf0=new SimpleDateFormat("yyyy-MM-dd a EEEE",Locale.KOREA);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd a EEEE",Locale.UK);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a EEEE",Locale.CANADA);
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd a EEEE",Locale.JAPAN);
		
		String nowDate0=sdf0.format(new Date());
		String nowDate1=sdf1.format(new Date());
		String nowDate2=sdf2.format(new Date());
		String nowDate3=sdf3.format(new Date());
		
		switch (date) {
		case "0": System.out.print(date+" 입력 : 한국날짜형식 반환 " + nowDate0); break;
		case "1": System.out.print(date+" 입력 : 영국날짜형식 반환 " + nowDate1); break;
		case "2": System.out.print(date+" 입력 : 캐나다날짜형식 반환 " + nowDate2); break;
		case "3": System.out.print(date+" 입력 : 일본날짜형식 반환 " + nowDate3); break;
		default: System.out.print(date+" 입력 : 한국날짜형식 반환 " + nowDate0); break;
		}//end switch
		
	}//useNum

	public static void main(String[] args) {
		
		UseWork0714 uw=new UseWork0714();
		uw.useData();
		System.out.println("--------------");
		uw.useNum();
		
	}//main

}//class
