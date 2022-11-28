package day0715;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * List :
 * 데이터가 순차적으로 입력되고, 중복값을 저장할 수 있으며, 검색의 기능이 제공되는 구조
 * @author user
 */
public class UseList {
	
//	MultiThread에서 동시접근 가능. 처리속도가 빠르다
	public void useArrayList(){
		// 1. 생성
		List<String> list=new ArrayList<String>(10); //capacity
		System.out.println(list.size());
		// 2. 값 할당(중복데이터를 저장할 수 있다)
		list.add("짜장면"); //0
		list.add("짬뽕"); //1
		list.add("볶음밥"); //2
		System.out.println(list.size());
		list.add("짜장면"); //3
		list.add("울면"); //4
		// 원하는 인덱스를 설정하여 값을 추가할 수 있다
		list.add(2, "탕수욕");
		
		// 주소가 아닌 값이 출력되는 이유는? ArrayList에서 toSting()을 Override했기 때문에
		System.out.println(list); 
		System.out.println(list.size());
		// 3. 값 얻기
		String value=list.get(0);
		System.out.println(value);
		// 4. 리스트의 값을 배열로 복사
		// 복사할 배열을 생성
		String[] copyData=new String[list.size()];
		list.toArray(copyData);
		// 5. 리스트 모든 방의 값 출력
		for(int i=0; i<list.size();i++) {
			System.out.printf("list.get(%d)=%-5s",i,list.get(i));
		}//end for
		System.out.println();
		
		// 삭제
		// 인덱스
		list.remove(1);
		// 값을 찾아서
		list.remove("울면");
		System.out.println(list.isEmpty());
		list.remove("짜장면"); // 중복된 값이 있다면 가장 처음에 나오는 값만 삭제한다
		
		list.clear();
		// 비었는지
		System.out.println(list.isEmpty());
		System.out.println(list+"/"+list.size());
		
		for(String temp:copyData) {
			System.out.println(temp);
		}//end for
		
	}//useArrayList
	
//	MultiThread에서 동시접근 불가능. 처리속도가 느리다
	public void useVector(){
		// 1. 생성
		List<String> list=new Vector<String>(10); //capacity
		System.out.println(list.size());
		// 2. 값 할당(중복데이터를 저장할 수 있다)
		list.add("짜장면");
		list.add("짬뽕");
		list.add("볶음밥");
		System.out.println(list.size());
		list.add("짜장면");
		list.add("울면");
		// 주소가 아닌 값이 출력되는 이유는? ArrayList에서 toSting()을 Override했기 때문에
		System.out.println(list); 
		System.out.println(list.size());
		// 3. 값 얻기
		String value=list.get(0);
		System.out.println(value);
		// 4. 리스트의 값을 배열로 복사
		// 복사할 배열을 생성
		String[] copyData=new String[list.size()];
		list.toArray(copyData);
		// 5. 리스트 모든 방의 값 출력
		for(int i=0; i<list.size();i++) {
			System.out.printf("list.get(%d)=%-5s",i,list.get(i));
		}//end for
		System.out.println();
		
		// 삭제
		// 인덱스
		list.remove(1);
		// 값을 찾아서
		list.remove("울면");
		System.out.println(list.isEmpty());
		list.remove("짜장면"); // 중복된 값이 있다면 가장 처음에 나오는 값만 삭제한다
		
		list.clear();
		// 비었는지
		System.out.println(list.isEmpty());
		System.out.println(list+"/"+list.size());
		
		for(String temp:copyData) {
			System.out.println(temp);
		}//end for
		
	}//useVector
	
// 	발생된 데이터가 기존 데이터사이에 추가되는 일이 빈번할 때	
	public void useLinkedList(){
		// 1. 생성
		List<String> list=new LinkedList<String>(); //capacity
		System.out.println(list.size());
		// 2. 값 할당(중복데이터를 저장할 수 있다)
		list.add("짜장면");
		list.add("짬뽕");
		list.add("볶음밥");
		System.out.println(list.size());
		list.add("짜장면");
		list.add("울면");
		// 원하는 인덱스를 설정하여 값을 추가할 수 있다
		list.add(2, "탕수욕");

		// 주소가 아닌 값이 출력되는 이유는? ArrayList에서 toSting()을 Override했기 때문에
		System.out.println(list); 
		System.out.println(list.size());
		// 3. 값 얻기
		String value=list.get(0);
		System.out.println(value);
		// 4. 리스트의 값을 배열로 복사
		// 복사할 배열을 생성
		String[] copyData=new String[list.size()];
		list.toArray(copyData);
		// 5. 리스트 모든 방의 값 출력
		for(int i=0; i<list.size();i++) {
			System.out.printf("list.get(%d)=%-5s",i,list.get(i));
		}//end for
		System.out.println();
		
		// 삭제
		// 인덱스
		list.remove(1);
		// 값을 찾아서
		list.remove("울면");
		System.out.println(list.isEmpty());
		list.remove("짜장면"); // 중복된 값이 있다면 가장 처음에 나오는 값만 삭제한다
		
		list.clear();
		// 비었는지
		System.out.println(list.isEmpty());
		System.out.println(list+"/"+list.size());
		
		for(String temp:copyData) {
			System.out.println(temp);
		}//end for
	}//useLinkedList

	public static void main(String[] args) {
		
		UseList ul=new UseList();
		ul.useArrayList();
		System.out.println("----------");
		ul.useVector();
		System.out.println("----------");
		ul.useLinkedList();
		
	}//main

}//calss
