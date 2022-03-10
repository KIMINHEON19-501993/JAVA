package collection2;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("해리포터", 95);
		map.put("덤블도어", 85);
		map.put("론위즐리", 75);
		map.put("드레이코말포이", 65);
		map.put("볼트모트", 55);
		map.put("네빌롱바텀", 45);
		map.put("앨러스터무디", Integer.valueOf(35));
		map.put("루나러브굿", 25);
		map.put(null, 95); // null값 허용
		map.put("루시우스말포이", null);
		
//		System.out.println(map);
		System.out.println("네빌롱바텀의 성적은 " + map.get("네빌롱바텀") + "점");
				
	}

}
