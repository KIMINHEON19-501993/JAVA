package test2;

public class Consumer extends Thread{
	private VendingMachine vm;
	
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName() +" : "+
					vm.getDrink()+" 꺼내먹음");
			System.out.println();
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}
}
