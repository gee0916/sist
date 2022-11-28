package day0715;

import java.util.Stack;

/**
 * Stack: LIFO를 구현한 클래스
 * @author user
 */
public class UseStack {
	
	public UseStack() {
		
		// 1. 생성
		Stack<String> stk=new Stack<String>();
		// 2. 값 할당
//		stk.add("dddd"); // 부모의 method를 사용할 수 있지만 사용하지 않는다
		stk.push("하세요? 1");
		stk.push("안녕 2");
		stk.push("오늗도 3");
		//3. 값 얻기
//		System.out.println(stk.get(0)); // 부모의 method를 사용할 수 있지만 사용하지 않는다
//		System.out.println(stk.empty());
//		System.out.println(stk.pop());

		while(!stk.empty()) {
			System.out.println(stk.pop());
		}//end while
		
		System.out.println(stk);
		
	}//UseStack

	public static void main(String[] args) {

		new UseStack();
		
	}//main

}//class
