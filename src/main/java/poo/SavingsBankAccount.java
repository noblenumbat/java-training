package poo;

public class SavingsBankAccount implements BankAccount {
	private double balance;
	private double annualInterestRate;
	private double lastAmountOfInterestEarned;
	public SavingsBankAccount(final Double balance, final Double interestRate) {
		this.balance = balance;
		this.annualInterestRate = interestRate;
		this.lastAmountOfInterestEarned = 0.0;
	}
	@Override
	public Double getBalance() {
		return this.balance;
	}
	@Override
	public void deposit(Double amount) {
		this.balance = this.balance + amount;
	}
	@Override
	public void withdraw(Double amount) {
		if(amount < this.balance) {
			this.balance = this.balance - amount;
		}
	}
	public void addInterest() {
		// Calcular el interés mensualmente
		Double monthlyInteresRate = annualInterestRate / 12;
		// Calcular el último interés ganado 
		this.lastAmountOfInterestEarned = monthlyInteresRate * this.balance;
		// Sumar el interés al balance
		this.balance = this.balance + lastAmountOfInterestEarned;
	}
	public Double  getAnnualInterestRate () {
		return this.annualInterestRate;
	}
	public Double getLastAmountOfInterestEarned() {
		return this.lastAmountOfInterestEarned;
	}
}