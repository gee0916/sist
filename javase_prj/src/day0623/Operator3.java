package day0623;
/**
쉬프트 연산자(비트밀기 연산)
<< : left shift 비트를 왼쪽으로 밀고 밀어서 빈칸을 항상 0으로 채운다
>> : right shift  비트를 오른쪽으로 밀고 밀어서 빈칸을 최상위 부호비트에 따라 양수면 0을 음수면 1을 채운다
>>> : unsigned right shift 비트를 오른쪽으로 밀고 밀어서 빈칸을 항상 0으로 채운다 (음수를 표현하지 않는 우 쉬프트)
*/

class Operator3 {
	public static void main(String[] args) {

		System.out.println(-128>>>1);
		System.out.println(-1>>>1);

		int i=6;
		System.out.println(i+ " <<3 = " + (i<<3));

		i=33;
		System.out.println(i+ " >>2 = " + (i>>2));

		i=128;
		System.out.println(i+ " >>>3 = " + (i>>>3));

		i=-1;
		System.out.println(i+ " >>>1 = " + (i>>>1));

		//left shift: 최대로 밀릴 수 있는 칸 수(31)를 초과하면 다시 뒤로 돌아온다,

		i=1;
		System.out.println(i+"<<31= "+(i<<31));
		//0000 0000 0000 0000 0000 0000 0000 0001
		System.out.println(i+"<<32= "+(i<<32));

	}//main
}//class
