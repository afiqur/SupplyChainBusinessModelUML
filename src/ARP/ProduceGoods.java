package ARP;

public class ProduceGoods {
	private String itemid;
	private int pqty;
	private String date;
	private Factory factory;

	public ProduceGoods(String itemid, int pqty, String date, Factory factory) {
		this.itemid = itemid;
		this.pqty = pqty;
		this.date = date;
		this.factory = factory;
	}

	public void display() {
		System.out.println("Factory Product ID " + itemid + "\nQuantity " + pqty + "\nProduce Date " + date);
		factory.display();
	}
}

