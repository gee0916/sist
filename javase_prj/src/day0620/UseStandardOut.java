package day0620;
/**
자바에서 제공하는 표준 출력 method 사용
console에 출력
*/

class UseStandardOut {
public static void main(String[] args) {
	//println은 출력 후 줄 변경
//	System.out.println("오늘은 월요일 입니다");
//	System.out.println("안녕자바?");
	//print는 출력 후 줄 변경x
	System.out.print("오늘은 월요일 입니다");
	System.out.print("안녕자바?");
	//println(); 값을 넣지 않고 사용하면 줄을 변경해준다
	System.out.println();
	System.out.println("다양한 값의 출력");
	//정수 출력
	System.out.println(2022);
	//실수 출력
	System.out.println(2022.06);
	//문자: '로 묶여진 한자, '는 출력되지 않는다.
	System.out.println('A');
	System.out.println('1');
	System.out.println('가');
//	System.out.println('AA'); // '는 한자만 사용할 수 있다.
	//문자열: "로 묶여진 여러 문자, "는 출력되지 않는다.
	System.out.println("Hello Java!!");
	System.out.println("2022"); //console에서는 정수와 구분되지 않는다.
	//연산식: 연산된 결과만 출력
	System.out.println(6+20); //연산의 결과인 26이 출력
	//문자열에 +를 사용하면 "덧 붙여라"의 의미로 사용
	System.out.println("6"+"20"); // 붙임연산인 620이 출력

	//정수 6과 정수 20을 사용하여 아래와 같이 출력 되도록 출력식을 구성하기 6+20=26
	System.out.println(6+"+"+20+"="+6+20); //6+20=620
	System.out.println(6+"+"+20+"="+(6+20)); //6+20=26

}//main
}//class
