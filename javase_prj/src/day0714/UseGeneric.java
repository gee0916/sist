package day0714;

import java.util.ArrayList;
import java.util.List;

public class UseGeneric {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void nonGeneric() {

//		1. 생성
		List list=new ArrayList();
		
//		2. 값 할당
		list.add(2022);
		list.add(7);
		list.add(14);
		list.add(3);
		list.add(29);
		list.add("하하하하");
		
//		리스트 크기 출력
		System.out.println(list.size());
		
//		3. 값 얻기
		System.out.println(list.get(0));
		
//		리스트의 모든 방의 값을 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
//			System.out.println((int)(list.get(i))*2);
		}//end for
		
	}//nonGeneric

	public void useGeneric() {
		
//		Generic을 사용한 JCF(설정한 데이터형만 입력가능)
//		List<char> list=new ArryList<char>();
		
//		1. 값 생성
		List<Integer> list=new ArrayList<>();
//		2. 값 할당
//		Integer class의 객체로 할당
//		list.add(new Integer(10)); //JDK11에서부터 Wrapper class의 생성자 비추천으로 변경
		list.add(Integer.valueOf(2022)); //JDK11부터는 생성이 아닌 valueOf method를 사용
//		기본형 데이터형으로 할당
		list.add(7); //autoboxing: Java Complier가 Wrapper class 사용하여 객체로 포장하여 입력해준다
		
//		다른 데이터형은 입력 불가능
//		list.add(7.14);
//		list.add("안녕하세요");
		
		System.out.println("방의 개수: "+list.size());
//		값 얻기
//		Integer temp=null;
		int temp=0;
		for(int i=0; i<list.size(); i++) {
			temp=list.get(i); //unboxing: Wrapper class가 기본형 데이터형 변수에 할당 될 수 있다
			System.out.println(temp);
		}//end for
		
	}//useGeneric
	
	
	public static void main(String[] args) {

		UseGeneric ug=new UseGeneric();
		ug.nonGeneric();
		System.out.println("-------------------");
		ug.useGeneric();
		
	}//main

}//class
