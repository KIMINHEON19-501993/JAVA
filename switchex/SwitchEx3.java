package switchex;



//args�� �Է� �� month�� �ϼ� ����ϱ�
//3���� 31�� ���� �ֽ��ϴ�.
public class SwitchEx3 {

	public static void main(String[] args) {
			
		int month = Integer.parseInt(args[0]);
			int day = 0;
			switch (month) {
				case 1: 
				case 3: 
				case 4: 
				case 5: 
				case 6: 
				case 7: 
				case 8: 
				case 9: 
				case 10: 
				case 11: 
				case 12: 
					day = 31;break;
				case 2: day = 28; 
					break;
				default: day = 30;
			}
			
			System.out.println(month +"�� " + day + "�ϱ��� �ֽ��ϴ�");
	}
		
		
}

