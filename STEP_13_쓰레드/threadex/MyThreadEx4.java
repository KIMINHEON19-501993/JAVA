package threadex;

/* 데몬 thread
 * 일반 스레드가 모두 종료하면 데몬 스레드는 강제 종료됨
 * 일반 스레드가 종료하면 데몬스레드는 존재할 이유가 없음
 * ex) 화면갱신,자동저장 ------> 특정 프로그램의 하위에서 동작하는 하위 프로그램
*/
class DemonTest extends Thread {
	
	@Override
	public void run() {
		while (true) {
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			System.out.println("Hello");
		}
	}
}

public class MyThreadEx4 extends Thread {// 멀티스레드를 쓰기 위해선 상속이 필요

	public static void main(String[] args) {
		DemonTest th = new DemonTest();
		
		th.setDaemon(true);//true가 되면 main()종료시 함께종료
		//이게 없다면 n이 10이 됨으로 써 main() 종료 되어도 돌아감으로써 데몬 쓰레드의 에러사항을 보여줌
		th.start();
		
		int n = 0;
		
		while(n <10) {
			n++;
			try {
				Thread.sleep(300);
				System.out.println(n);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}

}
