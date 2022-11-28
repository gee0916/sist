package day0623;
/**
논리연산자
일반논리: 여러개의 관계연산자를 묶어서 비교할 때
&&(AND): 전항과 후항이 모두 true인 경우에만 true 반환
||(OR): 전항과 후항이 모두 false인 경우에만 false 반환

비트논리: 비트를 연산할 때 사용
&(AND): 상위비트와 하위비트 모두 1인 경우에만 1내림
|(OR): 상위비트와 하위비트 모두 0인 경우에만 0내림
^(XOR): 상위비트와 하위비트 둘 중 하나만 1인 경우 1 내림
*/

class Operator5 {
	public static void main(String[] args){
		System.out.println("5>3 && 4<5 = " + (5>3&&4<5));
		
		boolean flag1=true, flag2=false, flag3=true, flag4=false;
		System.out.println("----------AND-----------");
		System.out.println(flag1+" && "+flag3+"= "+(flag1&&flag3)); //true
		System.out.println(flag1+" && "+flag2+"= "+(flag1&&flag2)); //false
		System.out.println(flag2+" && "+flag3+"= "+(flag2&&flag3)); //false
		System.out.println(flag2+" && "+flag4+"= "+(flag2&&flag4)); //false

		System.out.println("----------OR-----------");
		System.out.println(flag1+" || "+flag3+"= "+(flag1||flag3)); //true
		System.out.println(flag1+" || "+flag2+"= "+(flag1||flag2)); //true
		System.out.println(flag2+" || "+flag3+"= "+(flag2||flag3)); //true
		System.out.println(flag2+" || "+flag4+"= "+(flag2||flag4)); //false

		System.out.println("-----------------------------------");
		//AND: 전항이 거짓이면 후항을 연산하지 않는다
		//OR: 전항이 참이면 후항을 연산하지 않는다

		boolean firFlag=false, secFlag=false, resFlag=false;

		//resFlag=(firFlag=3>2)&&(secFlag=5<6);
		resFlag=(firFlag=3<2)&&(secFlag=5<6);
		System.out.println("전항: "+firFlag+" 후항: "+secFlag+" 결과: "+resFlag);

		System.out.println("----------------비트논리연산자-------------------");
		
		//&: 비트를 분리할 때
		int i= 19, j=15;
		System.out.println( i + " & "+ j +" = "+(i&j)); //3
		
		//|: 비트를 합칠때
		i=20;
		j=21;
		System.out.println( i + " | "+ j +" = "+(i|j)); //21

		//^:비트가 하나만 1인경우 합칠 때
		i=17; 
		j=10;
		System.out.println( i + " ^ "+ j +" = "+(i^j)); //27
	}//main
}//class
