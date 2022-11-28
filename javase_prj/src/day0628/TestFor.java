package day0628;

/**
 * for문의 사용
 * @author user
 *
 */

public class TestFor {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("안녕하세요?"+i);
		}//end for
		
//		1에서부터 9까지1씩 증가하는 수를 줄변경 없이 출력해보세요
		for(int i=1; i<10; i++) {
			System.out.print(i+" ");
		}//end for

		System.out.println();
//		1에서부터 100까지 1씩 증가하는 수를 "홀 수만" 줄 변경 없이 출력해보세요
		
		for(int i=1; i<101; i=i+2) { //for는 100번 반복수행
//			if(i%2==1) { //조건을 비교하여 맞는 경우만 출력
			System.out.print(i+" ");
//			}
		}//end for
		
		System.out.println();
		int cnt=0;
		for(int i=1; i<101; i+=2) { //for는 100번 반복수행
			cnt++;
			if(i%2==1) { //조건을 비교하여 맞는 경우만 출력
			System.out.print(i+" ");
			}
		}//end for
			System.out.println("\n반복횟수"+cnt);
		
			System.out.println();
//		1~100까지 합을 출력(누적합: 기존의 값과 새로운 값을 연산하여 기존의 값을 변경한다)
			int sum=0;
			for(int i=1; i<101; i++) {
				sum=sum+i; //sum+=1;
			}
			System.out.println("누적합결과: "+sum);
			
//			대문자 A~Z까지를 출력
//			for(int i=65; i<91; i++) {
//				System.out.print((char)i);
//			}
			
			System.out.println((char)91);
			for(char i=65; i<91; i++) {
				System.out.print(i);
			}
			
			System.out.println();
//			1~9까지 1씩 증가하는 for문
			for(int i=1; i<10; i++) { //2x1=
				System.out.println("2 x "+i+"="+2*i);
			} //end for
			
//			구구단의 단을 입력받아 2~9단일 때에 입력단을 사용한 구구단을 출력
//			그렇지 않으면 "구구단은 2~9까지입니다"를 출력
			
			System.out.println();
			System.out.println(args[0]+"단");
			int num=Integer.parseInt(args[0]);
			if(1<num && num<10) {
				for(int i=1; i<10; i++) {
					System.out.println(num+"*"+i+"="+num*i);
				} //end for
			}else {
				System.out.println("구구단은 2~9까지입니다");
			}//end else
			
//			1~100까지 반복시키면서 아래와 같이 출력
//			1 2 짝 4 5 짝 7 8 짝 ... (3의 배수 일때는 숫자가 아닌 "짝"을 출력)
			for(int i=1; i<101; i++) {
				
			}

			
			System.out.println();
//			소문자 z부터 a까지 출력
			for(int i=122; i>96; i--) {
				System.out.print((char)i);
			}
			
			System.out.println();
//			A(a), B(b) ...
			for(int i=65; i<91; i++) {
				System.out.print((char)i+"("+(char)(i+32)+")");
				}//end for
			
			
	}//main

}//class
