	package switchex;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	//숫자를 입력 5
	//5는 홀수 입니다. 를 출력
	public class SwitchEx2 {
	
		public static void main(String[] args) throws  IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int a;
			
			System.out.print("숫자를 입력 하세요. ");
			a = Integer.parseInt(br.readLine());
			
			
			switch (a % 2){
			case 0:
				System.out.println(a + "는 짝수 입니다.");
				break;
			default:
				System.out.println(a + "는 홀수 입니다.");
			}
			
			
		}
	
	}
