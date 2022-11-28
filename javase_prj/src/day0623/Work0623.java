package day0623;
class Work0623{
	public static void main(String[] args) {
		
	/*
	1. int형의 i변수에는 12가 할당 되어있다. 1의 보수연산자를 사용하여 부호를 바꾸고
   값은 그대로 출력해보세요. 
   -12
   */
	int i=12;
	System.out.println(~i+1);

	/*
	2. int temp1=10, temp2=20; 변수를 만들고 아래와 같은 코드를 작성했을 때
     어떤 값이 출력되는지 예상해보고 어떻게 그런 결과가 나왔는지 
     주석에 써보세요.
      System.out.println( ++temp1 + temp2--);
      System.out.println( “temp1 = “ + temp1 + “ / temp2 = “+ temp2 );
	*/
	int temp1=10, temp2=20;
    System.out.println( ++temp1 + temp2--); //11+20=31
    System.out.println( "temp1 = " + temp1 + " / temp2 = "+ temp2 ); // temp1=11 / temp2=19
	//temp1은 전위연산으로 인해 단항 수행 후 대입이 되기 때문에 11
	//temp2는 후위연산으로 인해 대입 수행 후에 연산 값이 이루어졌기 때문에 처음 결과 값은 20이지만 후에 이루어진 식에서는 19이다.

	/*
	3. int temp3=0; 변수를 선언하고 Integer.MAX_VALUE 상수와 shift 연산자를 
   사용하여 -16이 입력되도록 할당해보고 출력해보세요.
	*/
	int temp3=0;
	temp3=4;
	System.out.println(Integer.MAX_VALUE<<temp3);

	/*
	4. Integer.MAX_VALUE상수를 사용하여 Integer의 하위 2Byte 값이 출력되도록
    비트논리연산자를 사용하여 연산해보세요. ( 65535가 출력되어야합니다.)
	*/
	System.out.println(Integer.MAX_VALUE&65535);

	}
}
