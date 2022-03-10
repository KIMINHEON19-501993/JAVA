package test1;

public class KoreanThread implements Runnable {
	char[] arr = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };

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
