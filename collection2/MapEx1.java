package collection2;

import java.util.HashMap;
import java.util.Map;

//Map : Ű ��� ������ ���� ����� ������ �����̳�

//���ͷ����� ��� ����
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "�ظ�����"); //put() : �ʿ� ������ �߰�
		map.put(201, "�츣�̿´�");
		map.put(301, "������");
		map.put(401, "�����Ʈ");
		map.put(201, "��������"); //Ű�� �ߺ��� �Ǹ� ���� ���Ⱑ �ȴ�.
		
		System.out.println("key : " + 101 + " value : " + map.get(101));
		System.out.println("key : " + 201 + " value : " + map.get(201));
		System.out.println("key : " + 301 + " value : " + map.get(301));
		System.out.println("key : " + 401 + " value : " + map.get(401));
		
//		for (int i = 1; i < map.size()+1; i++) {//Ű ��Ī �̱� ������ �ݺ����� ����ϱ� ��ƴ�
//			System.out.println("key : " + i + " value : " + map.get(i));
//		}
		
		map.remove(401);
		System.out.println(map);
		map.clear();
		System.out.println(map);
		
	}

}
