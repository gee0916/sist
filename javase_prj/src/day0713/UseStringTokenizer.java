package day0713;

import java.util.StringTokenizer;


public class UseStringTokenizer {

	public UseStringTokenizer() {
		
		String msg="오늘은 폭우로 지하식당밥을 먹는다.";
		
//		1. StringTokenizer생성
		StringTokenizer stk=new StringTokenizer(msg);
		System.out.println(stk);
		
//		2. 생성된 객체의 기능을 사용
		System.out.println(msg+" 문자열의 토큰 수: "+stk.countTokens());
		
//		3. 토큰이 존재하는 지
//		System.out.println(stk.hasMoreTokens());
		
//		4. 토큰을 얻고 다음 토큰으로 포인터 이동
//		System.out.println(stk.nextToken())
		;
		
		while(stk.hasMoreTokens()) { //3.토큰이 존재하는 지
//		4. 토큰을 얻고 다음 토큰으로 포인터 이동
			System.out.println(stk.nextToken());
			System.out.println(stk.countTokens());
		}//end while
		
		System.out.println("---------------------------");
		String cvsData="자바,오라클,JDBC.HTML,CSS.JavaScript,오늘은 비오는 수요일";
		StringTokenizer stk2=new StringTokenizer(cvsData,",.오 ",false); //기준 문자열로 토큰 생성
//		기준문자열에 해당하는 모든 문자를 자른다 (토큰에 해당하는 문자열은 버린다)
		while(stk2.hasMoreTokens()) { //토큰이 존재한다면
			System.out.println(stk2.nextToken()); //토큰을 얻고 다음 토큰으로 포인터 이동
		}//end while
		
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
		
	}//main

}//class
