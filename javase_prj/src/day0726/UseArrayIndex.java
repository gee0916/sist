package day0726;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * RuntimeException인 ArrayIndexOutOfBoundsException 처리
 * @author user
 */
public class UseArrayIndex {

	public void useArray() {
		String[] data= {"수박","복숭아","자두","살구","바나나"};
		Random random=new Random();
		int num=random.nextInt(data.length+1); //잘못된 코드
		try {
			System.out.println("추천과일 : "+ data[num]);
		}catch(ArrayIndexOutOfBoundsException aioobe) {//대비코드
			System.err.println("인덱스를 확인하세요.");
		}//end catch
	}//useArray
	
	public void useList() {
		List<String> list=new ArrayList<String>();
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		
		try {
			System.out.println( list.get(0) ); 
			System.out.println( list.get(4) );
		}catch(IndexOutOfBoundsException ioobe) {
			System.err.println("존재하지 않는 인덱스 사용.");
		}//end catch
	}//useList
	
	public static void main(String[] args) {
		UseArrayIndex uai=new UseArrayIndex();
		System.out.println("----------배열사용-------------------------");
		uai.useArray();
		System.out.println("-----------리스트사용------------------------");
		uai.useList();
	}//main

}//class
