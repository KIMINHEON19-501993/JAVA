package test1;

public class ThreadMain {
	public static void main(String args[]) {

		EnglishLowerThread t1 = new EnglishLowerThread();
		EnglishUpperThread t2 = new EnglishUpperThread();
		KoreanThread t3 = new KoreanThread();
		
		Thread ob1 = new Thread(t1);
		Thread ob2 = new Thread(t2);
		Thread ob3 = new Thread(t3);

			
		ob3.start();
		try {
			ob3.join();
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		ob2.start();
		try {
			ob2.join();
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		ob1.start();
		try {
			ob1.join();
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
	}
}
