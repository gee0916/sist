package day0627;

/**
 * 단일 if: 조건에 맞을 때에만 코드를 실행해야할 때. 
 * @author user
 *
 */
public class TestIf {

	public static void main(String[] args) {
		
//		절대 값을 구하여 출력
		int i=6; //필수코드	
		
		if(i<0) { //선택코드를 실행하기 위한 조건
			i=-i; //절대값으로 변환하는 코드, 선택코드 
		}//end if

		System.out.println(i);
		
		//문자열은 같은지만 비교한다 ==보다는 equals method를 사용하여 비교한다
		System.out.println(args[0]);
		
		if(args[0].equals("정현지")) {
			System.out.println("본인");
		}//end if
		
		System.out.println("등판!!");
		
//		args[1]을 출력하고 args[1]이 짝수일때만 "짝수" 메시지를 출력
		
		int num=Integer.parseInt(args[1]);
		System.out.println(args[1]);
		
		if(num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}//end if
		
		
		
	
	}//main

}//class
