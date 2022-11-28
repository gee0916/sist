package day0715;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * KVP: 키와 값의 쌍으로 이루어진 데이터형
 * @author user
 */
public class UseMap {
	
	public void useHashtable() {
		
		//1. 생성
		Map<String, String> map=new Hashtable<String,String>();
		//2. 값 할당) 값은 순서대로 입력되지 않는다. 키는 유일하다
		map.put("java","완벽한 OOP언어,WORA지원");
		map.put("PyThon","완벽한 OOP언어,WORA지원"); //값은 중복 될 있다
		map.put("JavaScript", "C언어로 만들어진 객체기반언어");
		map.put("HTNL", "웹 페이지 작성시 구조를 담당하는 언어");
		map.put("HTNL", "저는 HTML로 프로그래밍을 해요"); //키가 같으면 이전 키에 덮어 쓴다
	
		//3. 행의 수 
		System.out.println(map.size());
		
		//4. 맵의 모든 키 얻기
		Set<String> keys=map.keySet();
		//개선된 for를 사용하면 Iterator를 사용하지 않고 Set을 출력할 수 있다
		
		for(String temp:keys) {
			System.out.println(temp+"/"+map.get(temp));
		}//end for
		
		//5. 값얻기 - 키를 넣어 값을 얻는다 (키가 존재하지 않으면 null 나온다)
		String key="java";
		if(map.containsKey(key)) {
			String value=map.get(key);
			System.out.println(value);
		} else {
			System.out.println(key+"는 존재하지 않습니다");
		}//end if
		
		System.out.println(map);
		
	}//useHashtable
	
	public void useHashMap() {
		
		//1. 생성
		Map<String, String> map=new HashMap<String,String>();
		//2. 값 할당) 값은 순서대로 입력되지 않는다. 키는 유일하다
		map.put("java","완벽한 OOP언어,WORA지원");
		map.put("PyThon","완벽한 OOP언어,WORA지원"); //값은 중복 될 있다
		map.put("JavaScript", "C언어로 만들어진 객체기반언어");
		map.put("HTNL", "웹 페이지 작성시 구조를 담당하는 언어");
		map.put("HTNL", "저는 HTML로 프로그래밍을 해요"); //키가 같으면 이전 키에 덮어 쓴다
	
		//3. 행의 수 
		System.out.println(map.size());
		
		//4. 맵의 모든 키 얻기
		Set<String> keys=map.keySet();
		//개선된 for를 사용하면 Iterator를 사용하지 않고 Set을 출력할 수 있다
		
		for(String temp:keys) {
			System.out.println(temp+"/"+map.get(temp));
		}//end for
		
		//5. 값얻기 - 키를 넣어 값을 얻는다 (키가 존재하지 않으면 null 나온다)
		String key="java1";
		if(map.containsKey(key)) {
			String value=map.get(key);
			System.out.println(value);
		} else {
			System.out.println(key+"는 존재하지 않습니다");
		}//end if
		
		System.out.println(map);
		
		
		
	}//useHashMap

	public static void main(String[] args) {
		
		UseMap um=new UseMap();
		um.useHashtable();
		System.out.println("--------------");
		um.useHashMap();
		
	}//main
	
}//class
