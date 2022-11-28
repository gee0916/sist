package day0627;

/**
 * else if: 연관된 여러 조건을 비교할 때 사용
 * @author user
 */
public class TestElseIf {

	public static void main(String[] args) {

//		정수를 입력받아 판정을 내리는 프로그램 
//		0점 이하인 경우 : 점수는 0점보다 작을 수 없습니다를 출력
//		100점 초과인 경우 : 점수는 100점보다 클 수 없습니다를 출력
//		그렇지 않은 경우 : 입력성공을 출력

		int score=Integer.parseInt(args[0]);
		System.out.println(score);
		
		if(0>score) { //0보다 작은 경우
			System.out.println("0점보다 작을 수 없습니다");
		}else if(score>100) { //100보다 큰 경우
			System.out.println("100점보다 클 수 없습니다");
		}else { //그렇지 않은 경우 (0~100 사이인 경우)
			System.out.println("입력성공");
		}//end else
		
//		두번째 arguments에는 이름이 입력된다
//		이름을 출력하고
//		이름이 "차승주" "반장"을 출력하고, 
//		이름이 자신의 이름이면 "본인"을 출력하고
//		그렇지 않으면 "평민"을 출력한다
		
		System.out.println(args[1]);
		
		if(args[1].equals("차승주")) {
			System.out.println("반장");
		}else if(args[1].equals("정현지")) {
			System.out.println("본인");
		}else {
			System.out.println("평민");
		}
//		시험과목은 자바, 오라클, JSP로 구성된다
//		입력값이 시험과목이 아니라면 "시험과목을 입력해주세요"
//		시험과목이라면 입력한 과목명을 출력
		
		if(args[2].equals("자바")||args[2].equals("오라클")||args[2].equals("JSP")) {
			System.out.println(args[2]);
		}else {
			System.out.println("시험과목을 입력해주세요");
		}
		
//		대중교통은 버스,지하철,마을버스로 볼 수 있다
//		이때 입력값이 대중교통일 때만 버스는 1250, 지하철 1300, 마을버스 800을 출력하고싶다

		if(args[3].equals("버스")||args[2].equals("지하철")||args[2].equals("마을버스")) {
			if(args[3].endsWith("버스")) {
				System.out.println(args[3]+"는 1250원"); 
			}else if(args[3].endsWith("지하철")) {
					System.out.println(args[3]+"는 1300원");
			}else
				  System.out.println(args[3]+"는 800원");
			}
		
		
	}//main
	
 }//class