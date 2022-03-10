package collection1;
//제네릭스(generics)

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		list.add(Integer.valueOf(5));
		list.add(4.0f);
		list.add(10.0);
		
		System.out.println(list);
		
	}

}
