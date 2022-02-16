package collection1;
import java.util.ArrayList;
import java.util.Iterator;
//리스트 :  서로 다른 자료형을 모아놓은 저장공간
//List(인터페이스) : 중복허용 O, 순서유지 O
//배열과 유사,담을수 있는 값의 개수가 자동으로 증가
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
		System.out.println("향상된 for : " + (__end - __start));
		
		
//		System.out.println(list.get(2));//get(index) 인덱스에 해당하는 값을 리턴
//		System.out.println(list.size());//list의 데이터 개수 반환
//		System.out.println();
//		System.out.println(list.remove("second"));//list.remove(object) 를 이용한 삭제
//		System.out.println(list);
//		System.out.println(list.remove(0));//인덱스를 이용한 삭제
//		System.out.println(list);
		
		System.out.println(list.remove(2)); //해당 인덱스값 삭제
		list.clear();//리스트값 전체 삭제
		
		
		
	}

}
