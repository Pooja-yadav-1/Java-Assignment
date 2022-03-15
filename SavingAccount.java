
public class SavingAccount {
private static float annualInterestRate;
private float savingBalance;
private float monthlyInterest;

public SavingAccount(float balance) {
	this.savingBalance=balance;
	
}
public static void modifyInterestRate(float interestRate) {
	annualInterestRate=interestRate/100;
}
public void calculateMonthlyInterest() {
	monthlyInterest=savingBalance*annualInterestRate/12;
	System.out.println("Monthly interest is :"+monthlyInterest);
}
private void calculateSavings() {
	savingBalance+=monthlyInterest;
}
public void displaySaving() {
	calculateSavings();
	System.out.println("total balance:"+savingBalance);
	
}
}
