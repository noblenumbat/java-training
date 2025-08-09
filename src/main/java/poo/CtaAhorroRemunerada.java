package poo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CtaAhorroRemunerada {
	public static void main (String args[]) {
		SavingsBankAccount Cta1234567 = new SavingsBankAccount(1200000.0,5.0);
		 System.out.println("Balance actual: " + "$ " + Cta1234567.getBalance());
		 Cta1234567.deposit(300000.0);
		 System.out.println("Balance actual despues de deposito: " + "$ " + Cta1234567.getBalance());
		 Cta1234567.withdraw(800000.0);
		 System.out.println("Balance actual despues de retiro: " + "$ " + Cta1234567.getBalance());
		 Cta1234567.addInterest();
		 Double interesAnual = Cta1234567.getAnnualInterestRate();
		 System.out.println("Interese anual:" + interesAnual + " %");
		 Double interesObtenido = new BigDecimal(Cta1234567.getLastAmountOfInterestEarned())
				 .setScale(2, RoundingMode.HALF_UP)
				 .doubleValue();
		 System.out.println("Interes obtenido a la fecha: " + "$ " + interesObtenido);
		 Double capital = new BigDecimal(Cta1234567.getBalance())
				 .setScale(2, RoundingMode.HALF_UP)
				 .doubleValue();
		 
		 System.out.println("Saldo + Interes: " + "$ " + capital);
	}
}