
public class Thirteen {
	private double balance;
	
	public Thirteen (double initialBalance) {
		if(initialBalance>0.0)
			balance=initialBalance;
	}
	public void credit(double amount) {
		balance=balance+amount;
	}
	public void debit(double debitAmount) {
		if(debitAmount>balance) {
			debitAmount=0.0;
			System.out.println("Debit amount exceeded account balance.");
		}
		balance=balance-debitAmount;
	}
	public double getBalance() {
		return balance;
	}

}
