package ARP;

public class Distributor {
	private String id;
	private String name;
	private String cell;
	private String email;

	public Distributor(String id, String name, String cell, String email) {
		this.id = id;
		this.name = name;
		this.cell = cell;
		this.email = email;
	}

	public void display() {
		System.out.println("Dstributor Id" + id + "\nDistributor Name " + name + "\nDistributor Cell " + cell
				+ "\nDistributor Email " + email);
	}
}

