	package switchex;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	//���ڸ� �Է� 5
	//5�� Ȧ�� �Դϴ�. �� ���
	public class SwitchEx2 {
	
		public static void main(String[] args) throws  IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int a;
			
			System.out.print("���ڸ� �Է� �ϼ���. ");
			a = Integer.parseInt(br.readLine());
			
			
			switch (a % 2){
			case 0:
				System.out.println(a + "�� ¦�� �Դϴ�.");
				break;
			default:
				System.out.println(a + "�� Ȧ�� �Դϴ�.");
			}
			
			
		}
	
	}
