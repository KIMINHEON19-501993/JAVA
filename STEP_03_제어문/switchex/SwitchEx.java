package switchex;

public class SwitchEx {

	public static void main(String[] args) {

//		char sw = 'G';

//		if(sw == 'E' || sw == 'e') 
//		{
//			System.out.println("excellent");
//		}
//		else if(sw == 'G' || sw == 'g') 
//		{
//			System.out.println("good");
//		}
//		else 
//		{
//			System.out.println("fall");
//		}

		// switch~case 문
//		switch (sw) {
//		case 'E':
//		case 'e':
//			System.out.println("excellent");
//			break;
//		case 'G':
//		case 'g':
//			System.out.println("good");
//			break;
//		default:
//			System.out.println("fall");
//		}

		int score = 85;
		char garde;

		switch (score / 10) {
		case 10:
		case 9:
			garde = 'A';
			break;
		case 8:
			garde = 'B';
			break;
		case 7:
			garde = 'C';
			break;
		case 6:
			garde = 'D';
			break;
		default:
			garde = 'F';
		}

		System.out.println("점수는 " + score + "점이며 학점은 " + garde + "입니다.");

	}

}
