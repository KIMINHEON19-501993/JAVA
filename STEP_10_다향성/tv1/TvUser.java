package tv1;



//다향성 :  객체가 다양한 모양으로 변화 할수 있는것
//응집도 고, 결합도 저 -----> 좋은코드

//결합도가 높은 코드
public class TvUser {
		
	public static void main(String[] args) {		
		String com = args[0];
		
		if(com.equals("lg") || com.equals("LG")) { //.equals() : 객체의 비교
			LgTv tv = new LgTv();
			tv.powerOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.powerOff();
		}else if(com.equals("samsung") || com.equals("SAMSUNG")) {
			SamsungTv tv = new  SamsungTv();
			tv.turnOn();
			tv.soundUp();
			tv.soundDown();
			tv.turnOff();
		}else {
			System.out.println("어디 회사 tv 인지?");
		}
		
	}
	
}
