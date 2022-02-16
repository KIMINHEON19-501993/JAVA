//package collection1;
//
//import java.util.ArrayList;
//import java.util.List;
//
////컴파일 에서는 문제가 발생하지 않지만 실행과정에 형변환 문제 발생
//public class ListError1 {
//
//	public static void main(String[] args) {
//		List list = new ArrayList<>();
//		
//		list.add("봄");
//		list.add("여름");
//		list.add("가을");
//		//list.add(Integer.valueOf(5));
//		list.add("겨울");
//		
//	
////      java.lang.ClassCastException : 형변환 오류
////		System.out.println(list.get(0));
//		for (int i = 0; i < list.size(); i++) {
//			String season = (String)list.get(i);
//			//15번 라인의(----list.add(Integer.valueOf(5))---) 데이터를 꺼내서 season에 저장하는 시점에서 오류가 발생
//			System.out.println(season);
//		}
//		
//	}
//
//}
