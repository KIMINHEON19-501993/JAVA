package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set :  집합, 중복허용 X, 순서유지 X
//입력값들 중에서 고유한 값 1개만 저장하는 특성을 지니는 컬렉션
public class SetEx1 {
//	@SuppressWarnings(value = "unchecked")
	public static void main(String[] args) {
		
		
		Set<Object> set = new HashSet<>();
		set.add("one"); //add(Object)를 대입
		set.add(Double.valueOf(2));//int -----> integer로 변환후 대입 (Boxing)
		set.add(2);
//		set.add(new Float(3));
		set.add(Integer.valueOf(4));
		set.add(2.0);
		
		if(set.contains("one")) {
			System.out.println("ㅇㅇ 있음");
		}else {
			System.out.println("ㄴㄴ 없음");
		}
		
		//set.clear();//지우기
		System.out.println("크기 : " + set.size());
		System.out.println(set);
		
		Iterator iter = set.iterator(); //set의 값을 가지는 Iterator 데이터 타입의 인스턴스 iter
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
