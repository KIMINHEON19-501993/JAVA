package test1;

public class EnglishLowerThread implements Runnable{
	char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z'};

	@Override
	public void run() {
		for (char c : arr) {
			try {
				System.out.print(c + " ");
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		System.out.println("");
	}
}
