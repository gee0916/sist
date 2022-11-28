package day0627;

/**
 * 학점 구하기
 * 90~100: A
 * 80~89: B
 * 70~79: C
 * 60~69: D
 * 0~59: F
 * @author user
 *
 */
public class TestSwitchCase3 {

	public static final int GRADE_A_TOP=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;
	
	public static void main(String[] args) {
		
		int score= 69; // 점수
		char grade= 64; //학점을 저장하는 변수
		
		if(score>-1 && score<101) { //switch~case를 실행하는 조건 
			switch (score/10) {
			case TestSwitchCase3.GRADE_D: grade++;
			case TestSwitchCase3.GRADE_C: grade++;
			case TestSwitchCase3.GRADE_B: grade++;
			case TestSwitchCase3.GRADE_A: 
			case TestSwitchCase3.GRADE_A_TOP: grade++; break;
			default: grade+=6;
			}//switch
		
			System.out.println(score+"점의 학점은 "+grade);
		}else {
			System.out.println(score+"점 올바른 점수 아님");
		}//end if
			
		
	}//main

}//class
