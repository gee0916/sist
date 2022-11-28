package day0623;
/**
산술연산자
+, -, *, /, %
*/

class Operator2 {
	public static void main(String[] args) {
		int i=23, j=6;
		System.out.println(i+"/"+j+"="+i/j); //정수/정수=정수
		double d=23, c=6; //d=23.0;, c=6.0
		System.out.println(d+"/"+c+"="+d/c); //실수/ 실수=실수
		System.out.println(i+"/"+c+"="+i/c); //실수/ 실수=실수

		System.out.println(i+"%2 = "+i%2); //실수/ 실수=실수
	
		int birth=1998;
		System.out.println(birth + "년 생은 "+birth%12);
// 		0 1 2 3 4 5 6 7 8 9 10 11 중 하나가 나온다
//      0원숭이 1개 2닭 3돼지 4쥐 5소 6호랑이 7토끼 8용 9뱀 10말 11양
	}//main
}//class
