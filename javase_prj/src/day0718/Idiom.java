package day0718;

import java.util.HashMap;
import java.util.Map;

public class Idiom {

	Map<String, String> map;

	String idiomData="";

	public Idiom() {
		super();
	}//Idiom
	
	public Idiom(String idiomData) {
		super();
		map=new HashMap<String, String>();
		this.idiomData = idiomData;
	}//Idiom

	public String getIdiomData() {
		
		return idiomData;
	}//getIdiomData

	public void setIdiomData(String idiomData) {
		
		this.idiomData = idiomData;
	}//setIdiomData
// toString method를 내용을 값을 넣는 부분, 값을 얻는 부분, 값을 사용하는 부분을 나눠서 method를 만들어보세요
	@Override
	public String toString() {
		
		map.put("과유불급", "모든 사물이 정도를 지나치면 미치지 못한 것과 같다");
		map.put("사필귀정", "모든 일은 결국에 가서는 반드시 정리로 돌아감");
		map.put("고진감래", "쓴 것이 다하면 단 것이 온다");
		map.put("군계일학", "많은 사람 가운데서 뛰어난 인물");
		map.put("백면서생", "세상일에 조금도 경험이 없는 사람을 이르는 말");
		
		String key=idiomData;
		if(map.containsKey(key)) {
			String value=map.get(key);
			return "뜻 ["+value+"]";
		} else {
			return "해당사자성어는 준비되지 않았습니다";
		}//end if
		
	}//toString
	
	
	
}//class
