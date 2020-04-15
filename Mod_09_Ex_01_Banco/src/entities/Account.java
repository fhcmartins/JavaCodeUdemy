package entities;

public class Account {
<<<<<<< HEAD
	
	private int accountNumber;
	private String accountOwner;
	private double balance;
=======
	public int accountNumber;
	public String accountOwner;
	public double balance;
>>>>>>> eec9fb52425faf9ce7393f5f334efa14917d5ee4

	public Account(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}
<<<<<<< HEAD

=======
	
>>>>>>> eec9fb52425faf9ce7393f5f334efa14917d5ee4
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
