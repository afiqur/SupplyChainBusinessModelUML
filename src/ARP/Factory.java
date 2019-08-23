package ARP;

public class Factory {
	private String location;
	private String cell;
	private String email;

	public Factory(String location, String cell, String email) {
		this.location = location;
		this.cell = cell;
		this.email = email;
	}

	public void display() {
		System.out.println("Factory Location " + location + "\nFactory Cell " + cell + "\nFactory Email " + email);
	}
}


