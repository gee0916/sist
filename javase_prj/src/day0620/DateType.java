package day0620;


/**
	Primitive Type (기본형 데이처형)의 사용
*/
class DateType{
	public static void main(String[] args) {
		
	//정수 상수를 저장할 수 있는 정수 데이터형: byte, short, int, long
	byte a=10;
//  byte b=10.3;
	short b=20;
	int c=21478748;
	long d=40;

//	long e=5900000000L; //형명시를 사용하여 정수literal의 크기를 변경한다
	//정수가 길때에는 가독성 향상을 위해서 값에 _를 넣을 수 있다. _는 console에 출력되지 않는다
	long e=5_900_000_000l; //형명시를 사용하여 정수 literal의 크기를 변경한다

	System.out.println("byte:"+a+", short:"+b+", int:"+c+", long:"+d+","+e);

	//문자상수('A')를 저장할 수 있는 문자 데이터형: char 
	//상수를 할당하면 상수에 해당하는 unicode값이 할당 된다. 
	// unicode값은 음수가 존재하지 않는다 => unsigend valuechar
	char f='A'; //영문자 한자
	char g='0'; //숫자 한자
	char h='가'; //한글 한자

	//char형을 출력하면 저장된 코드 값에 해당하는 문자가 출력된다.
	System.out.println("char:"+f+"."+g+","+h);
	
	//실수 상수(6.2)를 저장할 수 있는 실수 데이터형:float, double
	float i=5.21f;
	float j=2022.06f;

	double k=3.12d;
	double l=2022.06; //형명시 생략

	System.out.println("float:"+i+","+j+","+" double:"+k+","+l);

	//불린상태: true 또는 false를 저장할 수 있는 데이터형:boolean
	boolean m=true;
	boolean n=false;

	System.out.println("boolean:"+m+","+n);

	char c1='A';//65
	char c2='B';//66
	System.out.println(c1+c2); //코드값을 연산하여 숫자인 결과가 출력



	}//main
}//class
