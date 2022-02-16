package stringex;

public class StringEx {

	public static void main(String[] args) {	
		//뮤터블 자료형
		StringBuffer st = new StringBuffer();
		st.append("abc");
		st.append(" 123");
		st.append(" 가나다");
		System.out.println(st);
		System.out.println("용량 : " + st.capacity());
		System.out.println("용량 : " + st.length());
		
		st.delete(3, 6);
		System.out.println(st);
		System.out.println("방향전환 : " + st.reverse());
		st.trimToSize();
		System.out.println("용량 : " + st.capacity());
		
		String buf = "abc"; //이뮤터블 자료형
		buf += " 123";
		buf += " 가나다";
		System.out.println(buf);
		
		
		
//		String str1 = "korea";
//		String str2 = " fightint";
//		
//		String str3 = str1.concat(str2);
//		String str4 = str3.substring(6); //지정한 인덱스 부터 문자열의 끝가지 리턴
//		String str5 = str3.substring(6, 11);//6번 문항 부터 11번 문항 전까지
//		String str6 = str3.toUpperCase();//대문자로 변환
//		String str7 = str6.toLowerCase();//소문자로 변환
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println(str5);
//		System.out.println(str6);
//		System.out.println(str7);
		
		
//		String s1 = "hello";
//		String s2 = "hello";
//		String s3 = s2;
//		String s4 = new String("hello");
//		String s5 = new String("hello");
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//			
//		System.out.println(s4.hashCode());
//		System.out.println(s5.hashCode());
//		
//		System.out.println(s4==s5);
//		System.out.println(s4.equals(s5));
	}

}
