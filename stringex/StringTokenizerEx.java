package stringex;

//토큰 token: 더이상 분해할수 없는 의미를 가지는 최소단위
public class StringTokenizerEx {

	public static void main(String[] args) {	
		String str = "학교,집,학원,,pc방#식당$도서관";
		String [] values = str.split(",");//구분자를 하나만 사용
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		
		
//		StringTokenizer tokens = new StringTokenizer(str, ",#$");//구분자 : ,#$
//		
//		System.out.println("파싱한 문자열의 수 : "+tokens.countTokens());
//		
//		while(tokens.hasMoreTokens()) {
//			System.out.println(tokens.nextToken());
//		}
		
//		while(tokens.hasMoreTokens()) {
//			System.out.println(tokens.nextElement());
//		}
	}

}
