package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "�ظ�����"); //put() : �ʿ� ������ �߰�
		map.put(2, "�츣�̿´�");
		map.put(3, "������");
		map.put(4, "�����Ʈ");
		map.put(5, "��������"); //Ű�� �ߺ��� �Ǹ� ���� ���Ⱑ �ȴ�.
		
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
