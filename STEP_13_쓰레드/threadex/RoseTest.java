package threadex;

/*
 * 쓰레드 우선순위 setPriority(정수형 시간 or 함수)
 * join() : 한쓰레드가 종료할때까지 다른쓰레드 대기	
 */

public class RoseTest extends Thread {
	private String rose;

	public RoseTest() {
		// TODO 자동 생성된 생성자 스텁
	}

	public RoseTest(String rose) {
		this.rose = rose;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			System.out.println(rose + "\t" + Thread.currentThread());
			// currentThread : 이름, 우선순위, 그룹
		}
	}

	public static void main(String[] args) {
		RoseTest ob1 = new RoseTest("흑장미");
		RoseTest ob2 = new RoseTest("백장미");
		RoseTest ob3 = new RoseTest("장미껌");
		//쓰레드 결과는 예측 불과 단 결과는 조작 가능
		ob1.setPriority(MAX_PRIORITY);//10
		ob2.setPriority(MIN_PRIORITY);//1
		ob3.setPriority(NORM_PRIORITY);//5
		//0 : 낮은 우선순위
		//5 : 순위 없음
		//10 : 높은 우선순위
		ob1.start();
		try {
			ob1.join();//ob1의 동작이 끝날때까지 다른 쓰레드는 대기
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		ob2.start();
		ob3.start();
	}

}
