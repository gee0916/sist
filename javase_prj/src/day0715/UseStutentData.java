package day0715;

import java.util.ArrayList;
import java.util.List;


public class UseStutentData {
	
	List<StudentData> dataList=new ArrayList<StudentData>();

	// 학생 정보 입력
	public void addStudentData() { 
		
		StudentData sd1=new StudentData("김도희", "여", 96, 88, 91);
		StudentData sd2=new StudentData("남상민", "남", 79, 77, 86);
		StudentData sd3=new StudentData("송인화", "여", 85, 96, 80);
		StudentData sd4=new StudentData("유설빈", "여", 100, 96, 99);
		StudentData sd5=new StudentData("최정민", "남", 67, 78, 85);
		
		dataList.add(sd1);
		dataList.add(sd2);
		dataList.add(sd3);
		dataList.add(sd4);
		dataList.add(sd5);
		
		int i=1;
		for(StudentData temp:dataList) {
			System.out.println(" "+i+""+temp);
			i++;
		}//end for

	}//addStudentData
	
	// 각 과목멸 총점과 성별 수
	public void printStudentData() {
		
		// 각 과목별 총점
		int javaTotal = 0, oracleTotal=0, jspTotal=0;
		for(StudentData temp:dataList) {
			javaTotal+=temp.getJavaScore();
			oracleTotal+=temp.getOracleScore();
			jspTotal+=temp.getJspScore();
		}//end for
		
		System.out.printf("%s: \t\t%7d %5d %6d\n","총점",javaTotal,oracleTotal,jspTotal);
		
		// 성별 수
		int women=0, men=0;
		for(StudentData temp:dataList) {
			if(temp.getGender().contains("여")) {
				women++;
			}else {
				men++;
			}//end if
		}//end for
		//잘하셨습니다.
		System.out.printf("남자: "+men+"명, 여자: "+women+"명");
		
	}//printStudentData

	public static void main(String[] args) {

		UseStutentData usd=new UseStutentData();
		System.out.printf("%s %5s %5s %5s %5s %5S\n","번호", "이름", "성별", "자바", "오라클", "JSP");
		System.out.println("-------------------------------------");
		usd.addStudentData();
		System.out.println("-------------------------------------");
		usd.printStudentData();
		
	}//main

}//class
