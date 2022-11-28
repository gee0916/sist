package day0620;
/**
지역변수의 사용.<br>
1. 선언
	데이터형 변수명;
2. 값할당
	변수명=값;
3. 값사용
System.out.println(변수명);
*/
class LocalVariable {
public static void main(String[] args) {
	//1.선언: 데이터형 변수명; //변수명은 {}안에서 유일하다.
	int age;
	//2. 값 할당: 변수명=값;
	age=20;
	//3. 값 사용: 출력, 연산, 제할당
	System.out.println("나이는" + age); //변수에 할당된 값이 출력된다.

	///////////////////////////////////주의////////////////////////////////////////////
	//같은 이름의 변수는 선언할 수 없다
//	String age;
	
	//초기화하지 않은 변수를 사용하면 Error 
	//1.선언
//	int i;
	//3.사용
//	System.out.println(i);

	//지역변수의 초기화. (지역변수는 초기화 하지 않으면 에러가 발생하므로 가급적이면 초기화하여사용)
	int i=0;
	System.out.println(i);

	//변수명은 한글로 사용가능하다. (아무도 사용하지 않음)
	int 나이=25;
	System.out.println("나이"+나이);

	//변수명은 숫자로 시작할 수 없다. error
//	int 1myAge;

	/*
	현재년도는 2022년이고, 내 나이는 xx살이다. 
	현재년도와 내 나이를 저장하는 변수를 만들고 
	태어난 해를 출력해보자
	태어난해 (현재년도-나이+1)

	출력: 2022년 나이는 xx살 태어난해는 xxxx년
	*/

	//1.변수선언
	int year;
	int myage;

	//2. 값할당
	year=2022;
	myage=25;

	//3. 출력
	System.out.println(year+"년 나이는 "+myage+"살"+" 태어난 해는 "+(year-myage+1)+"년");

	//2. 값할당 - 변수는 값이 변하는 수 이다. (값 할당을 몇변이든 할 수 있다)
	year=2023;
	myage=26;

	//3. 출력 - 변수는 사용하기 전에 어떤 값이 할당되어있는지 확인 해야한다
	//같은 변수를 사용했지만 다른 값이 나온다
	System.out.println(year+"년 나이는 "+myage+"살"+" 태어난 해는 "+(year-myage+1)+"년");


}//main
}//class
