package ARP;

public class SupplyGoods {
	private String itemid;
	private int pqty;
	private String date;
	private Factory factory;
	private Distributor distributor;

	public SupplyGoods(String itemid, int pqty, String date, Factory factory, Distributor distributor) {
		this.itemid = itemid;
		this.pqty = pqty;
		this.date = date;
		this.factory = factory;
		this.distributor = distributor;
	}

	public void display() {
		System.out.println("Item Id " + itemid + "\nQuantity " + pqty + "\nSupply Date " + date);
		factory.display();
		System.out.println();
		distributor.display();
	}

}


