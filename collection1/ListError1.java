//package collection1;
//
//import java.util.ArrayList;
//import java.util.List;
//
////������ ������ ������ �߻����� ������ ��������� ����ȯ ���� �߻�
//public class ListError1 {
//
//	public static void main(String[] args) {
//		List list = new ArrayList<>();
//		
//		list.add("��");
//		list.add("����");
//		list.add("����");
//		//list.add(Integer.valueOf(5));
//		list.add("�ܿ�");
//		
//	
////      java.lang.ClassCastException : ����ȯ ����
////		System.out.println(list.get(0));
//		for (int i = 0; i < list.size(); i++) {
//			String season = (String)list.get(i);
//			//15�� ������(----list.add(Integer.valueOf(5))---) �����͸� ������ season�� �����ϴ� �������� ������ �߻�
//			System.out.println(season);
//		}
//		
//	}
//
//}
