package day0719;

import java.util.HashMap;
import java.util.Map;

public class Work0718Map {
	Map<String, String> map;

	// map 생성자
	public Work0718Map() {
		map = new HashMap<String, String>();
	}// Work0718Map

	// map에 사자성어와, 뜻을 key와 value로 저장하는 method
	public void inputMean() {
		map.put("과유불급", "모든 사물이 정도를 지나치면 미치지 못한 것과 같다.");
		map.put("사필귀정", "모든 일은 결국에 가서는 반드시 정리로 돌아감");
		map.put("고진감래", "쓴 것이 다하면 단 것이 온다");
		map.put("군계일학", "많은 사람 가운데서 뛰어난 인물.");
		map.put("백면서생", "세상일에 조금도 경험이 없는 사람을 이르는말");
	}

	// 사자성어를 입력하면 뜻을 출력, 없으면 없다고 반환
	public String printMean(String key) {
		String value = "해당 사자성어는 준비되지 않았습니다.";
		if (map.containsKey(key)) {
			value = map.get(key);
		}
		return key + " : " + value;
	}

	public static void main(String[] args) {
		Work0718Map work = new Work0718Map();// map 생성
		// 데이터 추가
		work.inputMean();
		System.out.println(work.printMean("회자정리"));
		System.out.println(work.printMean("사필귀정"));
		System.out.println("----------------------");
		work.printAll();
	}

	public void printAll() {
		System.out.printf("현재 준비된 사자성어는 %d개 입니다.%n", map.size());
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
