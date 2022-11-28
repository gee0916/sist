package day0624;
/**

1. 패키지 선언. (소스코드에서 package선언은 가장 첫번째 줄에 한번만 기술 할 수 있다.)
package 패키지명; // 패키지명은 역방향도메인으로 설정

2. 패키지 컴파일
javac -d . TestPack.java

3. 실행 (가장외부패키지가 보이는 위치에서)
java 패키지명.TestPack
*/

// package kr.co.sist.day0624;

class TestPack {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
