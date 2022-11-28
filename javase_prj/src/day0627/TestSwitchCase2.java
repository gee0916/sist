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
public class TestSwitchCase2 {

	public static void main(String[] args) {

		int score=100; // 점수
		char grade= ' '; //학점을 저장하는 변수
		
		if(score>-1 && score<101) {
			switch (score/10) {
			case 10: 
			case 9: grade='A'; break;
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade='D'; break;
			default: grade='f';
			}//switch
		
			System.out.println(score+"점의 학점은 "+grade);
		}else {
			System.out.println(score+"점 올바른 점수 아님");
		}//end if
			
		
		
		// 0-원숭이 1-닭 2-개 3-돼지 4-쥐 5-소 6-호랑이 7-토끼 8-용 9-뱀 10-말 11-양
		int birth=1998;
		System.out.println(birth+"년 생은 ");
		//switch~case 사용하여 띠 출력하는 코드 작성
		
		switch (birth%12) {
		case 0: System.out.println("원숭이"); break;
		case 1: System.out.println("닭"); break;
		case 2: System.out.println("개"); break;
		case 3: System.out.println("돼지"); break;
		case 4: System.out.println("쥐"); break;
		case 5: System.out.println("소"); break;
		case 6: System.out.println("호랑이"); break;
		case 7: System.out.println("토끼"); break;
		case 8: System.out.println("용"); break; 
		case 9: System.out.println("뱀"); break;
		case 10: System.out.println("말"); break;
		case 11: System.out.println("양"); break;
		}
			
		
	}//main

}//class
