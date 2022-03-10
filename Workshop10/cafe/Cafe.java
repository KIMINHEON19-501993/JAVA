package cafe;

public class Cafe {
	private Coffee[] coffeeList;
	private int index = 0;

	public Cafe() {
		coffeeList = new Coffee[3];
	}

	public int totalPrice() {

		int sum = 0;

		for (int i = 0; i < coffeeList.length; i++) {
			sum += coffeeList[i].getPrice();
		}

		return sum;
	}

	public void setCoffee(Coffee coffee) {
		if (index >= coffeeList.length) {
			System.out.println("더이상 저장할수 없습니다.");
		}
		coffeeList[index] = coffee;
		index++;
	}

	public Coffee[] coffeeList() {

		return coffeeList;

	}

	public Coffee[] getCoffeeList() {
		return coffeeList;
	}

	public int getIndex() {
		return index;
	}

	public void setCoffeeList(Coffee[] coffeeList) {
		this.coffeeList = coffeeList;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
