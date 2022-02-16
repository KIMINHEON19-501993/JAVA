package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "해리포터"); //put() : 맵에 데이터 추가
		map.put(2, "헤르미온느");
		map.put(3, "론위즐리");
		map.put(4, "볼드모트");
		map.put(5, "지니위즐리"); //키가 중복이 되면 덮어 쓰기가 된다.
		
//		Set<Integer> keyset = map.keySet();
//		for(Integer n : keyset) {
//			System.out.println(map.get(n));
//		}
		
		
		List<Integer> list = new ArrayList<Integer>(map.keySet());
		Collections.sort(list);
		
		for(Integer n : list) {
			System.out.println(map.get(n));
		}
	
				
	}

}
