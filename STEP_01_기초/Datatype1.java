package STEP_01_기초;

public class Datatype1 {

	public static void main(String[] args) {
		String name = "홍길동"; // 문자열
		int age = 23; // 정수
		char gender = '남'; // 문자
		float weight = 63.4f; // 실수 float의 경우 뒤에 f를 붙여주어야 함.
		double height = 175.5; // 실수
		long L = 10000000000L; // long타입의 경우 L을 붙혀 주어야 함.
		
		
		// +연산자를 \n을 사용하여 출력
		System.out.println("이름 : " + name + "\n나이 : " + age + "세" + "\n성별 : " + gender + "\n체중 : " + weight + "kg"
				+ "\n신장 : " + height + "cm\n" + "long type : "  + L );
		
		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age + "세");
//		System.out.println("성별 : " + gender);
//		System.out.println("체중 : " + weight + "kg");
//		System.out.println("신장 : " + height + "cm");

//		System.out.println("이름 : 홍길동"); 
//		System.out.println("나이 : 23세");
//		System.out.println("성별 : 남"); 
//		System.out.println("체중 : 63.4kg");
//		System.out.println("신장 : 175.5cm");
		// 한줄 삭제 ctrl + d

	}

}