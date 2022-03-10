package test1;

public class EnglishUpperThread implements Runnable {
	 char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
             'O','P','Q','R','S','T','U','V','W','X','Y','Z'};

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
