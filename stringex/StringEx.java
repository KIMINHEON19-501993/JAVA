package stringex;

public class StringEx {

	public static void main(String[] args) {	
		//���ͺ� �ڷ���
		StringBuffer st = new StringBuffer();
		st.append("abc");
		st.append(" 123");
		st.append(" ������");
		System.out.println(st);
		System.out.println("�뷮 : " + st.capacity());
		System.out.println("�뷮 : " + st.length());
		
		st.delete(3, 6);
		System.out.println(st);
		System.out.println("������ȯ : " + st.reverse());
		st.trimToSize();
		System.out.println("�뷮 : " + st.capacity());
		
		String buf = "abc"; //�̹��ͺ� �ڷ���
		buf += " 123";
		buf += " ������";
		System.out.println(buf);
		
		
		
//		String str1 = "korea";
//		String str2 = " fightint";
//		
//		String str3 = str1.concat(str2);
//		String str4 = str3.substring(6); //������ �ε��� ���� ���ڿ��� ������ ����
//		String str5 = str3.substring(6, 11);//6�� ���� ���� 11�� ���� ������
//		String str6 = str3.toUpperCase();//�빮�ڷ� ��ȯ
//		String str7 = str6.toLowerCase();//�ҹ��ڷ� ��ȯ
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
