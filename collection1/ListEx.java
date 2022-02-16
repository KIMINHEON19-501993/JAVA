package collection1;
import java.util.ArrayList;
import java.util.Iterator;
//����Ʈ :  ���� �ٸ� �ڷ����� ��Ƴ��� �������
//List(�������̽�) : �ߺ���� O, �������� O
//�迭�� ����,������ �ִ� ���� ������ �ڵ����� ����
import java.util.List;

public class ListEx {

//	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		List<Object> list =  new ArrayList<>();
		
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
//		list.add(new Integer(4));
		list.add(Double.valueOf(4));
		list.add("second");
		
		
		
//		System.out.println(list);
		
		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}
		
		Iterator iter = list.iterator();
		long start = System.currentTimeMillis();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		long end = System.currentTimeMillis();
		
		
		long _start = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		long _end = System.currentTimeMillis();
		
		long __start = System.currentTimeMillis();
		for (Object ob : list) {
			System.out.println(ob);
		}
		long __end = System.currentTimeMillis();
		System.out.println("iter.hasNext() : " + (end - start));
		System.out.println("for : " + (_end - _start));
		System.out.println("���� for : " + (__end - __start));
		
		
//		System.out.println(list.get(2));//get(index) �ε����� �ش��ϴ� ���� ����
//		System.out.println(list.size());//list�� ������ ���� ��ȯ
//		System.out.println();
//		System.out.println(list.remove("second"));//list.remove(object) �� �̿��� ����
//		System.out.println(list);
//		System.out.println(list.remove(0));//�ε����� �̿��� ����
//		System.out.println(list);
		
		System.out.println(list.remove(2)); //�ش� �ε����� ����
		list.clear();//����Ʈ�� ��ü ����
		
		
		
	}

}
