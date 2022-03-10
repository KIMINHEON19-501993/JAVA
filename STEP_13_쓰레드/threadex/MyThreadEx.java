package threadex;
//싱글 thread
public class MyThreadEx {

	String str;
	int num;
	
	public MyThreadEx(String str, int num) {
		this.str = str;
		this.num = num;
	}
	
	public void view() {
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
		
		
//		long start = System.nanoTime();
//		MyThreadEx ob1 = new MyThreadEx("one",100);
//		MyThreadEx ob2 = new MyThreadEx("two",100);
//		MyThreadEx ob3 = new MyThreadEx("three",100);
//		
//		ob1.view();
//		ob2.view();
//		ob3.view();
//		long end = System.nanoTime();
//		System.out.println("싱글스레드 소요 시간 : " + (end-start));
		
		
	}

}
