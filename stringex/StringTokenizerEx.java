package stringex;

//��ū token: ���̻� �����Ҽ� ���� �ǹ̸� ������ �ּҴ���
public class StringTokenizerEx {

	public static void main(String[] args) {	
		String str = "�б�,��,�п�,,pc��#�Ĵ�$������";
		String [] values = str.split(",");//�����ڸ� �ϳ��� ���
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		
		
//		StringTokenizer tokens = new StringTokenizer(str, ",#$");//������ : ,#$
//		
//		System.out.println("�Ľ��� ���ڿ��� �� : "+tokens.countTokens());
//		
//		while(tokens.hasMoreTokens()) {
//			System.out.println(tokens.nextToken());
//		}
		
//		while(tokens.hasMoreTokens()) {
//			System.out.println(tokens.nextElement());
//		}
	}

}
