package ab.met.zensar.accounting_project;
//Account

public class Account {
	private int accNo;
	private float balance;
	private String name, type;
	private static int acCounter = 10000;

	public Account(String name, String type, float balance) {
		this.accNo = ++acCounter;
		this.balance = balance;
		this.name = name;
		this.type = type;
	}



    public int getAccNo() {
		return accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "\n\nAccount Details\n\tAccount No=" + accNo + "\n\tBalance=" + balance + "\n\tCounsumer Name=" + name
				+ "\n\tAccount Type=" + type;
	}

}
