package object;

class Sales {
	private String item;
	private int qty;
	private int cost;

	public String toString() {
		return "ǰ�� : " + item + 
				"\n���� : " + qty + 
				"\n�ܰ� : " + cost + 
				"��\n�ݾ� : " + getPrice() + "��";
	}
 
	public int getPrice() {
		return qty * cost;
	}

	public String getItem() {
		return item;
	}

	public int getQty() {
		return qty;
	}

	public int getCost() {
		return cost;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
