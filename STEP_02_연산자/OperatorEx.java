package STEP_02_연산자;

public class OperatorEx {

	public static void main(String[] args) {

		// 변수의 초기화
		int a = 0;
		float b = 0.0f;
		String c = " ";
		String d = null;
		char e = '\0';

		System.out.println(a + " " + b + " " + c + " " + d + " " + e);

		// 3항 연산자 ? :
//		char code = '남';
//		String gender;
//		int x = 0;
//		
//		gender = (code =='M' || code == '남')? "man": "woman"; 
//		//code가 M 이거나 남 이면 gender에 man을 대입 woman 을 대입  
//		
//		System.out.println("성별 : " + gender);
//		
//		x= (x>=4 || x<2)? 5:9;
//		
//		System.out.println("x 값은 : " + x);
//		
//		
//		boolean ck = true;
//		System.out.println(!ck);

		// 대입연산자
//		int p = 7;
//		p += 2; // p = p + 2
//		System.out.println(p);
//		p *= 6; // p = p * 6
//		System.out.println(p);
//		p -= 4; // p =p-4
//		System.out.println(p);
//		p %= 8; // p =p%8
//		System.out.println(p);

		// 단항 연산자 ++,--
//		int k = 7;
		// 화면 메모리
//		System.out.println(k++);//   7        8
//		System.out.println(++k);//   9        9
//		System.out.println(k);//     9        9
//		System.out.println(--k);//   8        8
//		System.out.println(k--);//   8        7
//		System.out.println(k);//     7        7

//		//산술 연산자
//		System.out.println(5/3); //몫 연산
//		System.out.println(5%3); //나머지 연산
//
//		//관계 연산자, 논리 연산자
//		int a = 5;
//		System.out.println(a == 5); //a와 5가 같은가?
//		System.out.println(a != 5); //a와 5가 같지 않은가? 
//		System.out.println(a < 5); //a가 5보다 작은가?
//		System.out.println(a > 5); //a가 5보다 큰가?
//		System.out.println(a <= 5); //a가 5보다 같거나 작은가?
//		System.out.println(a >= 5); //a가 5보다 같거나 큰가?

		// 논리 연산자
//		String str = "korea";
//		System.out.println(str == "korea" || str == "KOREA");
//		
//		int score = 77;
//		System.out.println(score >= 70 && score < 90);

		// 논리 자료형
//		int score = 77;
//		boolean sw = (score >=70 && score <90);
//		System.out.println(sw);

	}

}
