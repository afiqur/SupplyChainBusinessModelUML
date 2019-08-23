package ARP;

public class PlaceDemand {
	private String itemid;
	private int quantity;
	private Factory factory;
	private Distributor distributor;

	public PlaceDemand(String itemid, int quantity, Factory factory, Distributor distributor) {
		this.itemid = itemid;
		this.quantity = quantity;
		this.factory = factory;
		this.distributor = distributor;
	}

	public void display() {
		System.out.println("Item Id " + itemid + "\nQuantity " + quantity);
		factory.display();
		System.out.println();
		distributor.display();
	}
}

