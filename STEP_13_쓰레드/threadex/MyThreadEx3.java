package threadex;

//멀티 thread
public class MyThreadEx3 extends Thread{//멀티스레드를 쓰기 위해선 상속이 필요

	String str;
	int num;
	
	public MyThreadEx3(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	/*
	 * start()는 쓰레드를 생성(VMThread;쓰레드 실행준비)하고
	 * 만들어진 
	 */
	@Override
	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep(30); // 30/1000
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			} 
		}
	}
	
	public static void main(String[] args) {
		
		
		long start = System.nanoTime();
		MyThreadEx3 ob1 = new MyThreadEx3("one",100);
		MyThreadEx3 ob2 = new MyThreadEx3("two",100);
		MyThreadEx3 ob3 = new MyThreadEx3("three",100);
		
		ob1.start();
		ob2.start();
		ob3.start();
		long end = System.nanoTime();
		System.out.println("멀티스레드 소요 시간 : " + (end-start));
		//멀티스레드 소요 시간 : 298000
		
	}

}
