package poo;

public class CtaCorrienteNoRemunerada{
	public static void main(String args[]) {
		CurrentBankAccount Cta1234567 = new CurrentBankAccount(1000000.0);
		Double saldo = Cta1234567.getBalance();
		System.out.println("Saldo actual de la cuenta: " + saldo);
		Cta1234567.deposit(200000.00);
		System.out.println("Saldo despues del deposito: " + Cta1234567.getBalance());
		Cta1234567.withdraw(50000.0);
		System.out.println("Saldo despues del retiro: " + Cta1234567.getBalance());
	}
}