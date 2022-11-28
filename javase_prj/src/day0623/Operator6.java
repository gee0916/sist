package day0623;
/**
삼항(조건)연산자
-연산에 필요한 항이 모두 3개인 연산자
연산식 ? 항1 : 항2
*/

class Operator6 {
	public static void main(String[] args) {

		//int i=6;
		int i=-6;
		System.out.println(i+"은(는) "+ (i<0 ? "음수":"양수"));
		
		i=10;
		//i홀수인지, 짝수인지 판별하여 출력하는 코드 작성
		System.out.println(i+"은(는) "+ (i%2==0 ? "짝수":"홀수"));

		int score=50; //-1 또는 100초과
		//score가 0~100사이라면 "유효점수" 그렇지 않으면 "잘못된점수" 출력하는 코드를 작성
		System.out.println(score+"점은(는) " + (0<=score && score<=100 ? "유효점수":"잘못된점수"));
	
		int temp=10;
		//~를 사용하여 temp의 값을 같은 값의 음수로 변경하여 출력 (-10출력)
		System.out.println(temp+"를 음수로 "+(~temp+1));

	}//main
}//class
