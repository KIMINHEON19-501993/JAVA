package atm;

public class AtmTest {

	public static void main(String[] args) {
		
		
		Bank bank = new Bank();
		
		Thread mom = new Thread(bank, "엄마");
		Thread sun = new Thread(bank, "아들");
		
		
		
		mom.start();
		sun.start();
		
		
		
	}

}
