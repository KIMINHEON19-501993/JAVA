package collection1;
//���׸���(generics)

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�ܿ�");
		list.add(Integer.valueOf(5));
		list.add(4.0f);
		list.add(10.0);
		
		System.out.println(list);
		
	}

}
