package day0627;

/**
 * if~else: 둘 중 하나의 코드가 반드시 실행되어야 할 때.
 * @author user
 */
public class TestIfElse {

	public static void main(String[] args) {

		int num=Integer.parseInt(args[0]);
		
		System.out.println(num+"은(는)");
		
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}//end else
		
//		입력된 두번째 arguments가 0~100사이라면 "유효점수"를 출력하고 
//		그렇지 않으면 "잘못된 점수"를 출력
		
		int score=Integer.parseInt(args[1]);
		System.out.println(args[1]+"점은 ");
		
		if(0<=score&&score<=100) {
			System.out.println("유효점수");
		}else {
			System.out.println("잘못된 점수");
		}//end else
		
//		입력된 세번째 arguments를 출력하고 
//		"남자"면 주민번호의 7번째자리가 1,3,5,7,9 입니다
//		"여자"면 주민번호의 7번째자리가 0,2,4,6,8 입니다
		
		System.out.println(args[2]);
		
		if(args[2].equals("남자")) {
			System.out.println("주민번호의 7번째 자리가 1,3,5,7,9입니다.");
		}
		
		if(args[2].equals("여자")) {
			System.out.println("주민번호의 7번째 자리가 0,2,4,6,8입니다.");
		}
		
		
		System.out.println("------------------------------");
		
		if(args[2].equals("남자")) {
			System.out.println("주민번호의 7번째 자리가 1,3,5,7,9입니다.");
		}else if(args[2].equals("여자")){
			System.out.println("주민번호의 7번째 자리가 0,2,4,6,8입니다.");
		}
		
		
		
	}//main

}//class
