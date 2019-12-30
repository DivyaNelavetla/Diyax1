package ui;


public class Customer {
	private String mobileno;
	private String name;
	private double balance;

	public Customer(String mobileno, String name, double balance) {
		this.mobileno = mobileno;
		this.name = name;
		this.balance = balance;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void transferamt(Customer a, double amt) {
		this.balance = balance - amt;
		a.balance = a.balance + amt;
	}
}
