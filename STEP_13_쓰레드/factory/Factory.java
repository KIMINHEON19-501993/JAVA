package factory;

/*쓰레드 조정(실행제어)
 * wait() : 쓰레드를 일시 정지 시켜서 대기 상태로 만들기
 * notify() : 쓰레드를 깨워서 다시 실행
 * notifyAll() : 모든 쓰레드를 깨워서 다시 실행
 * 
 * 다중 쓰레드 에서는 notifty()실행시 어느 쓰레드가 깨어 날지 모름
 * 그래서 우선순위가 높은 쓰레드가 계속 동작, 대기 하는 경우가 생길수도 있음
 * notifyAll()를 사용하여 모든 쓰레드를 깨우고 JVM이 쓰레드 우선순위에 따라 처리
 */
public class Factory {
	private int produce = 0;

	public synchronized void produce() {
		if (produce > 4) {
			System.out.println("생산중단 : " + produce);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		++produce;
		System.out.println("생산 : " + produce);
		
		notifyAll();
	}
	
	public synchronized void sell() {
		if (produce < 1) {
			System.out.println("소비중단 : " + produce);
		
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		--produce;
		System.out.println("소비 : " + produce);
		
		notifyAll();
	}

}
