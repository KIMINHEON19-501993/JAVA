package test2;

public class Producer extends Thread {
	private VendingMachine vm;
	
	public Producer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName() + " : 음료수 No. " + i);
			vm.putDrink("음료수 No. " + i);
			System.out.println(" 자판기에 넣음");
			
			try {
				Thread.sleep(280);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}
}
