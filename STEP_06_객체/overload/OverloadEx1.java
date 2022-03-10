package overload;

/*오버로드메서드 overload method, 중복함수  : 같은 이름의 함수를 여러번 구현
 * 1.반드시 함수의 이름이 동일
 * 2.매개변수의 자료형이 다르거나 개수가 달라야 한다.
 * ex)println()
 * 
 */
public class OverloadEx1 {
	int a = 10;
	int b = 20;
	
	private int max() {
		return (a > b) ? a : b;
	}
	
	public int max(int a, int b) {
		//a,b는 지역변수
		//이 지역변수는 (지역변수와 동일한 이름을 가지는) 전역변수를 가린다.
		return (a > b) ? a : b;
	}
	
	public float max(float a, float b) {
		return (a > b) ? a : b;
	}
	
	public char max(char a, char b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		OverloadEx1 ob = new OverloadEx1();

		System.out.println("큰수 : " + ob.max());
		System.out.println("큰수 : " + ob.max(1,2));
		System.out.println("큰수 : " + ob.max(1.0f,2.0f));
		System.out.println("큰수 : " + ob.max('b','B'));
	}

	

}
