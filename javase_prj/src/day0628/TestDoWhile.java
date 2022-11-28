package day0628;

/**
 * do~while: 시작과 끝을 모를 때 사용하는 반복문 최소 1번 수행 최대 조건까지 수행
 * 
 * @author user
 *
 */

public class TestDoWhile {

	public static void Fmain(String[] args) {

		int i = 10; // 초기값
		do {
			System.out.println("반복" + i); // 반복수행문장
			i++; // 증.감식
		} while (i < 10); // 조건식

	}// main

}// class
