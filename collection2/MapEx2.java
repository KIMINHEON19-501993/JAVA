package collection2;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("�ظ�����", 95);
		map.put("������", 85);
		map.put("������", 75);
		map.put("�巹���ڸ�����", 65);
		map.put("��Ʈ��Ʈ", 55);
		map.put("�׺��չ���", 45);
		map.put("�ٷ����͹���", Integer.valueOf(35));
		map.put("�糪�����", 25);
		map.put(null, 95); // null�� ���
		map.put("��ÿ콺������", null);
		
//		System.out.println(map);
		System.out.println("�׺��չ����� ������ " + map.get("�׺��չ���") + "��");
				
	}

}
