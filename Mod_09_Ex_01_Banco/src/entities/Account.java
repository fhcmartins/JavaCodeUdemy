package entities;

public class Account {
	
	private int accountNumber;
	private String accountOwner;
	private double balance;

	public Account(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public Account(int accountNumber, String accountOwner, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(initialDeposit);
	}

	// Getter accountNumber - este numca podera ser trocado.
	public int getAccountNumber() {
		return accountNumber;
	}

	// Getter and Setter accountOwner
	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwer) {
		this.accountOwner = accountOwer;
	}
	
	public double getBalance() {
		return balance;
	}

	// Metodo primeiro deposito
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	@Override
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountOwner
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
