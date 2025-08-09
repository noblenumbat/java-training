package poo;

public class CurrentBankAccount implements BankAccount {
	private Double balance;
	public CurrentBankAccount (final Double balance) {
		this.balance = balance;
	}
	@Override 
	public Double getBalance() {
		return this.balance;
	}
	@Override
	public void deposit(final Double amount) {
		this.balance = balance + amount;
	}
	@Override
	public void withdraw(final Double amount) {
		if (amount < this.balance) {
			this.balance = balance - amount;
		}
	}
}