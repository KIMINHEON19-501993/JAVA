package 과제11;
/*
 * [문제 52] 문자열변수에 "IT ELITE" 를 대입한후 String클래스의 메서드를 이용하여
              다음과 같이 출력하시오

(1) Test52클래스 main()에서 
     String str="IT ELITE";
     //나머지를 완성하시오
[결과화면]
L   T
it elite
IT
ELITE
iT ELiTE
 */

class Test52  {

	public static void main(String[] args) {
			
		String str = "IT ELITE";
		
		
		System.out.println(str.substring(4,5) + "   " + str.substring(6,7));
		System.out.println(str.toLowerCase());//it elite
		System.out.println(str.substring(0,2));//IT
		System.out.println(str.substring(3,8));//ELITE
		System.out.println(str.replace("I", "i"));//iT ELiTE
	}
}
