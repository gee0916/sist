package day0628;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 개선된 for
 * 배열, List, Set의 처음 방부터 끝 방까지 모든 방의 값을 출력할 수 있는 for
 * @author user
 *
 */

@SuppressWarnings("unused")
public class ImprovementFor {

	public static void main(String[] args) {

		int[] array= {2022,6, 28, 16, 4};
		//이전의 for
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}//end for
		//개선된 for
		for(int i : array) {
			System.out.println(i);
		}//end for
		
		List<String> list=new ArrayList<String>();
		list.add("김강현");
		list.add("김도희");
		list.add("김소현");
		list.add("김수림");
		//이전 for
		for(int i=0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}//end for
		
		System.out.println();
		//개선된 for
		for(String name: list) {
			System.out.println(name);
		}
		
		
		
		
	}//main

}//class
