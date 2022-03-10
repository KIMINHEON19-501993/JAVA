package threadex;
//동기화 

class FamilyThread extends Thread{
	private Washroom wr;
	private String who;
	
	public FamilyThread(Washroom wr, String who) {
		this.who = who;
		this.wr = wr;
	}
	
	@Override
	public void run() {
		wr.openDoor(who);
	}
	
}

class  Washroom{

	public synchronized void openDoor(String who) {
		
		//synchronized : 실행 시간에 의한 동기화
		System.out.println(who + "님이 입장");
		for (int i = 0; i < 50000; i++) {
			if (i % 10000 == 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
				System.out.println(who + "님이 볼일을 보는중...");
			}
		}
		System.out.println(who + "님이 퇴장");
	}
	
}
public class SyncThreadTest {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread father = new FamilyThread(wr,"father");
		FamilyThread mother = new FamilyThread(wr,"mother");
		FamilyThread brother = new FamilyThread(wr,"brother");
		FamilyThread sister = new FamilyThread(wr,"sister");
		FamilyThread me = new FamilyThread(wr,"me");
		
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
		
	}

}
