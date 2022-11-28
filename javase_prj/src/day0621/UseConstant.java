package day0621;
/**
다른 클래스에 존재하는 Constant사용
*/


class UseConstant {
	public static void main(String[] args) {
//		System.out.println(MAX_SCORE);//다른 클래스의  Constant는 클래스명을 생략하고는 사용할 수 없다
		System.out.println(Constant.MAX_SCORE);

		//java.lang 패키지에서 제공하는 Byte클래스의 Constant 사용
		System.out.println("byte의 최고값:"+ Byte.MAX_VALUE);
		System.out.println("byte의 최소값:"+ Byte.MIN_VALUE);

		byte b=Byte.MIN_VALUE;
		System.out.println(b);

		//API에서 Wrapper를 모두 확인하고, 최솟값과 최대값을 가지는 Constant가 존재한다면
		//해당 Constant를 사용하여 아래와 같이 출력.(모든 Warpper클래스를 출력)
		//출력에) byte의 최소값 -128 최대값 127
		//hint: 제대로 출력되지 않으면 casting을 사용해 볼 것.

		System.out.println("byte의 최소값: "+ Byte.MIN_VALUE+" byte의 최고값: "+ Byte.MAX_VALUE);
		System.out.println("char의 최소값: "+ (int)Character.MIN_VALUE+" char의 최고값: "+ (int)Character.MAX_VALUE);
		System.out.println("double의 최소값: "+ Double.MIN_VALUE+" double의 최고값: "+ Double.MAX_VALUE);
		System.out.println("float의 최소값: "+ Float.MIN_VALUE+" float의 최고값: "+ Float.MAX_VALUE);
		System.out.println("int의 최소값: "+ Integer.MIN_VALUE+" int의 최고값: "+ Integer.MAX_VALUE);
		System.out.println("long의 최소값: "+ Long.MIN_VALUE+" long의 최고값: "+ Long.MAX_VALUE);
		System.out.println("short의 최소값: "+ Short.MIN_VALUE+" short의 최고값: "+ Short.MAX_VALUE);

	}//main
}//class
