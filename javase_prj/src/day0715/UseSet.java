package day0715;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set
 * 값이 순차적으로 입력되지 않고, 중복 값을 저장하지 않고, 검색의 기능 없다
 * @author user
 */
public class UseSet {

	public UseSet() {
		
		//1. 생성
		Set<String> set=new HashSet<String>();
		//2. 값 추가 - 값은 유일하며 순서대로 추가되지 않는다
		set.add("스타벅스");
		set.add("커피빈");
		set.add("엔제리너스");
		set.add("이디야");
		set.add("매머드");
		set.add("스타벅스"); //같은 값이 있다면 추가되지 않는다
		
		System.out.println("크기: "+set.size());
		
		//3. 배열로 복사
		String[] data=new String[set.size()];
		set.toArray(data);
		
		//4. 삭제
		set.remove("엔제리너스");
		
		//5. 검색 => 검색의 기능이 없음
		Iterator<String> ita=set.iterator(); //제어권 넘김
		while(ita.hasNext()) { //포인터가 잇는 위치 다음에 요소가 있는지?
			System.out.println(ita.next()); // 값을 얻고 다음으로 이동
		}//end while
		
		Iterator<String> ita1=set.iterator(); //제어권 넘김
		while(ita1.hasNext()) { //포인터가 잇는 위치 다음에 요소가 있는지?
			System.out.println(ita1.next()); // 값을 얻고 다음으로 이동
		}//end while
		
		//6. set의 모든 방 삭제
		set.clear();
		
		System.out.println("Set이 비었는지?: "+set.isEmpty());
		System.out.println(set);
		
		// 배열에 복사된 값을 출력
		for(String temp:data) {
			System.out.println(temp);
		}
		
	}//UseSet
	
	
	public static void main(String[] args) {

		new UseSet();
		
	}//main

}//class
