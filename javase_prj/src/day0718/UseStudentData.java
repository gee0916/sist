package day0718;

import java.util.ArrayList;
import java.util.List;

public class UseStudentData {
	public static final int JAVA=0;
	public static final int ORACLE=1;
	public static final int JSP=2;
	
	private List<StudentData> list;
	
	/**
	 *  객체가 생성되어있을때 기본적으로 실행해야할 코드, 값을 설정하는 일
	 */
	public UseStudentData() {
		list=new ArrayList<StudentData>();
	}//UseStudentData
	
	public void addStudentData() {
		//1. 값을 가진 객체 생성
	     StudentData doHee=new StudentData("김도희", "여", 96,88,91);
	     StudentData sangMin=new StudentData("남상민", "남", 79,77,86);
		//2. 객체를 리스트에 추가
		list.add(doHee);
		list.add(sangMin);
		
		//1+2) 객체명 없이 바로 객체를 생성하여 list 에 추가할 수 있다.
		list.add(new StudentData("송인화","여",85,81,80));
		list.add(new StudentData("유설빈","여",100,96,99));
		list.add(new StudentData("최정민","남",67,78,85));
		
	}//addStudentData
	
	/**
	 * 추가 method를 먼저 호출한 후 사용해주세요.
	 */
	public void printStudentData() {
//		System.out.println( list );
		System.out.println("번호\t이름\t자바\t오라클\tJSP");
		
		//데이터가 존재하지 않을 때의 처리.
		if( list.isEmpty() ) {
			System.out.println("입력된 학생의 정보가 존재하지 않습니다. ");
		}//end if
		
		//총점을 저장할 변수
		int[] totalScore=new int[3];
		//성별
		int male=0;
		
		StudentData sd=null;
		for(int i=0; i < list.size() ; i++) {
			sd=list.get(i);//리스트의 방에 값을 사용자정의 자료형에 저장하고, 출력한다. 
			//단순 정보 출력
			System.out.printf("%d\t%s\t%d\t%d\t%d\n", i+1, sd.getName(), 
					sd.getJavaScore(), sd.getOracleScore(),sd.getJspScore());
			//점수의 일괄처리
			totalScore[JAVA]+= sd.getJavaScore();
			totalScore[ORACLE]+= sd.getOracleScore();
			totalScore[JSP]+= sd.getJspScore();
			
			//성별
			if( sd.getGender().equals("남")) {
				male++;
			}//end if	
			
		}//end for
		
		System.out.printf("총점\t\t\t%d\t%d\t%d\n",
					totalScore[JAVA],totalScore[ORACLE],totalScore[JSP]);
		
		System.out.printf("성별 남자 [%d], 여[%d]", male, list.size()-male);
	}//printStudentData
	
	public static void main(String[] args) {
		UseStudentData usd=new UseStudentData();// 리스트가 생성
		usd.addStudentData();
		System.out.println("--------------------------------");
		usd.printStudentData();
	}//main

}//class
