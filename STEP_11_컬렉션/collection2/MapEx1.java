package collection2;

import java.util.HashMap;
import java.util.Map;

//Map : 키 밸루 형식의 저장 방식을 가지는 컨테이너

//이터레이터 기능 없음
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "해리포터"); //put() : 맵에 데이터 추가
		map.put(201, "헤르미온느");
		map.put(301, "론위즐리");
		map.put(401, "볼드모트");
		map.put(201, "지니위즐리"); //키가 중복이 되면 덮어 쓰기가 된다.
		
		System.out.println("key : " + 101 + " value : " + map.get(101));
		System.out.println("key : " + 201 + " value : " + map.get(201));
		System.out.println("key : " + 301 + " value : " + map.get(301));
		System.out.println("key : " + 401 + " value : " + map.get(401));
		
//		for (int i = 1; i < map.size()+1; i++) {//키 대칭 이기 때문에 반복문의 사용하기 어렵다
//			System.out.println("key : " + i + " value : " + map.get(i));
//		}
		
		map.remove(401);
		System.out.println(map);
		map.clear();
		System.out.println(map);
		
	}

}
