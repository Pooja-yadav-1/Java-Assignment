
public class SavingAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1=new SavingAccount(2000);
		SavingAccount s2=new SavingAccount(4000);
		SavingAccount.modifyInterestRate(4);
		s1.calculateMonthlyInterest();
		s2.calculateMonthlyInterest();
		s1.displaySaving();
		s2.displaySaving();
		SavingAccount.modifyInterestRate(5);
		s1.calculateMonthlyInterest();
		s2.calculateMonthlyInterest();
		s1.displaySaving();
		s2.displaySaving();
	}

}
