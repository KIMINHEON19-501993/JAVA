package tv2;



//다향성 :  객체가 다양한 모양으로 변화 할수 있는것
//응집도 고, 결합도 저 -----> 좋은코드

//다향성을 이용하여 결합도가 낮은 코드 생성
public class TvUser {
		
	public static void main(String[] args) {		
		String com = args[0];
		
		Tv tv = null;
		if(com.equals("lg") || com.equals("LG")) { //.equals() : 객체의 비교
			tv = new LgTv();
		}else if(com.equals("samsung") || com.equals("SAMSUNG")) {
			tv = new  SamsungTv();
		}else {
			System.out.println("어디 회사 tv 인지?");
		}
		
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
	}
	
}
