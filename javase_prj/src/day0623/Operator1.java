package day0623;
/**
단항연산자
~,!,+,-,++,--
*/

class Operator1 {
	public static void main(String[] args) {
		//~ (tilde): 1의 보수 연산 (부호와 값이 모두 변경된다)
		int i=10;
		int j=-10;
		System.out.println("~"+i+"="+~i); //~양수: 부호변경 1증가
		System.out.println("~"+j+"="+~j); //~음수: 부호변경 1감소

		//! (NOT): true<->false로 변경
		boolean flag = true, flag2 = false;
		System.out.println("!"+flag+"="+!flag);
		System.out.println("!"+flag2+"="+!flag2);

		System.out.println(6<23);
		System.out.println("!(6<23)="+!(6<23));
		
		//+ : 아무일도 안함, 형식적인 제공
		System.out.println("+"+i+"="+ +i); //+양수: 양수
		System.out.println("+"+j+"="+ +j); //+음수:음수

		//- : 2의 보수연산 (값은 그대로두고 부호만 변경)
		System.out.println("-"+i+"="+ -i); //-양수: 음수
		System.out.println("-"+j+"="+ -j); //-음수: 양수

		//++: 증가연산: 대상체의 값을 변경
		++i; // 전위: 10 -> 11
		i++; // 후위: 11 -> 12
		System.out.println("증가연산 후 i: "+ i);

		//--: 감소연산
		--i; // 전위: 12->11
		i--; // 후위: 11->10
		System.out.println("감소연산 후 i: "+ i); 
		
		//전위와 후위가 대입연산자와 함께 사용되면 다른 값을 대입한다
		i=6;
		int result=0;

		result=++i; //전위연산: 내 것 먼저
		System.out.println("전위 연산 후 i: "+ i + ", result : "+ result);

		result=i++; //후위연산: 남의 것 먼저
		System.out.println("후위 연산 후 i: "+ i + ", result : "+ result);

		//연산에 참여할 때와 method에 값으로 넣을 때도 같은 동작을 수행
		//method에 값으로 넣을 때
		i=1;
		System.out.println( i++);

		i=10;
		result=20+ i++;
		System.out.println(result);

	}//main
}//class
