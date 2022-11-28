package day1025.sub2;

import java.util.HashMap;
import java.util.Map;

public class RunPerson {

	public static void main(String[] args) {
		
		//상황에 (입력된 키) 따라 다른 객체를 실행
		Map<String, Object> map=new HashMap<String, Object>();
		
		//값 할당
		map.put("cha", new SeungJu());
		map.put("song", new SungWoo());
		map.put("jung", new JooEun());
		
		String key="jung"; //song || jung
		
/*		if("cha".equals(key)) { //key.equals("cha")
			SeungJu sj=(SeungJu)map.get(key);	
			System.out.println(sj.execute());
		}//end if
		
		if("jung".equals(key)) { //key.equals("cha")
			JooEun je=(JooEun)map.get(key);	
			System.out.println(je.execute());
		}//end if
		
		if("song".equals(key)) { //key.equals("cha")
			SungWoo sw=(SungWoo)map.get(key);	
			System.out.println(sw.execute());
		}//end if */
		
		//다른 객체가 얻어지고 부모로 저장하여 사용
		
		if(map.containsKey(key)) {
			Person sj=(Person)map.get(key);
			System.out.println(sj.execute()); //sj는 다른 객체가 저장된다 (객체다형성)
		}
		
	}//main

}//class
