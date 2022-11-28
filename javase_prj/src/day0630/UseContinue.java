package day0630;

/**
 * continue : 반복문의 실행을 건너 뛸 때 사용
 * @author user
 */

public class UseContinue {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			System.out.println(i);
			if (i>5) {
				continue; //조건에 부합되면 아랫줄의 코드를 건너뛰고 증.감식으로 간다
			}//end if
				System.out.println("반복");
		}//end for
		
//		1~100까지 짝수만 옆으로 출력하는 코드를 작성
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				continue;
			}//end if
				System.out.print(i+ " ");
		}//end for
		
	}//main

}//class
