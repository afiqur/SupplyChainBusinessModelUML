package ARP;

public class SupplyChainManagement {

	public static void main(String[] args) {
		Factory f = new Factory("Dhaka, Savar", "01767310339", "alif@gmail.com");
		Distributor d = new Distributor("103", "Kabbo", "01712345678", "kabbo@gmail.com");
		ProduceGoods p = new ProduceGoods("123", 10, "01-04-2019", f);
		PlaceDemand dm = new PlaceDemand("123", 10, f, d);
		SupplyGoods sp = new SupplyGoods("123", 10, "01-04-2019", f, d);
		p.display();
		dm.display();
		sp.display();
	}

}

