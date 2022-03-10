package 과제03;

public class Test22 {

	public static void main(String[] args) {
		//[문제 22] 아래 문자열 배열의 데이터의 길이를 구하시오(단일 for문)
		//String[] color={"red","green","blue","yellow","pink"};
		//힌트) color[0].length
		
		String[] color={"red","green","blue","yellow","pink"};
		
		for(int i = 0; i < color.length; i++) {
			System.out.println(color[i] + "는(은) " + color[i].length() + "글자 입니다.");
		}
	}
}
