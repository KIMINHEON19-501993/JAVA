package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set :  ����, �ߺ���� X, �������� X
//�Է°��� �߿��� ������ �� 1���� �����ϴ� Ư���� ���ϴ� �÷���
public class SetEx1 {
//	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		
		
		Set<Object> set = new HashSet<>();
		set.add("one"); //add(Object)�� ����
		set.add(Double.valueOf(2));//int -----> integer�� ��ȯ�� ���� (Boxing)
		set.add(2);
//		set.add(new Float(3));
		set.add(Integer.valueOf(4));
		set.add(2.0);
		
		if(set.contains("one")) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
		
		//set.clear();//�����
		System.out.println("ũ�� : " + set.size());
		System.out.println(set);
		
		Iterator iter = set.iterator(); //set�� ���� ������ Iterator ������ Ÿ���� �ν��Ͻ� iter
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
