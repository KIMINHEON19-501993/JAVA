package test2;

import java.util.Stack;

public class VendingMachine {
	Stack<String> store = new Stack<String>();

	// 소비
	public synchronized String getDrink() {

    	while(store.isEmpty()) {
    		
    			System.out.println("음료수 투입");
    			try {
    				wait();
    			} catch (InterruptedException e) {
    				// TODO 자동 생성된 catch 블록
    				e.printStackTrace();
    			}
			}
    	

		return store.pop().toString();
	}

	// 생산
	public synchronized void putDrink(String drink) {
		// 자판기에 drink를 넣는 장면
		notifyAll();
		store.push(drink);
		
	}

}
