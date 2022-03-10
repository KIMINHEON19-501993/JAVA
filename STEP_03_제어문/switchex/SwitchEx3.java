package switchex;



//args로 입력 된 month로 일수 계산하기
//3월은 31일 까지 있습니다.
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
			
			System.out.println(month +"는 " + day + "일까지 있습니다");
	}
		
		
}

