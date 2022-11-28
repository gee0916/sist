package day0628;

/**
 * for의 다양한 형태
 * @author user
 */

public class TestFor3 {

	public static void main(String[] args) {

//		여러개의 인덱스를 사용할때
		for(int i=0, j=10, k=5; i<10; i++, j--,k*=2) {
			System.out.println("i="+i+", j="+j+", k="+k);
		}//end for
		
		System.out.println("----------------------------------------");
//		무한루프
		for(;;) {
			System.out.println("무한루프"); 
			break; //반목문을 빠져나갈 때
		}//end for		
		System.out.println("----------------------------------------");
		
//		무한루프
		for(int cnt=0; ;cnt++) {
			System.out.println("무한루프"+cnt);
			if(cnt==5) {
				break;
			}//end if
		}//end for
		System.out.println("출력");
		System.out.println("----------------------------------------");
		
		
		
	}//main

}//for
