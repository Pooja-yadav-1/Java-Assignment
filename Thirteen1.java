import java.util.Scanner;
public class Thirteen1 {
	public static void main(String[] args) {
	 Thirteen account1=new Thirteen(100.00);
	 Thirteen account2=new Thirteen(200.00);
	 System.out.println("Account 1 Balance"+account1.getBalance());
	 System.out.println("Account 2 Balance" +account2.getBalance());
	 Scanner in= new Scanner(System.in);
	 double depositAmount;
	 double debitAmount;
	 
	 System.out.print("Enter deposit amount in account 1");
	 depositAmount=in.nextDouble();
	 System.out.println(depositAmount);
	 account1.credit(depositAmount);
	
	 System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
	 System.out.printf( "Account2 balance: $%.2f", account2.getBalance() );
	 
	 System.out.print("Enter debit amount)");
	 debitAmount =in.nextDouble();
	 System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", debitAmount );
	 if (account1.getBalance()>=debitAmount) {
	 account1.debit( debitAmount );
	 System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
	 System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
	 }
	 else {
	 System.out.printf("!!! Debit amount exceeded account balance!!!\n\n");
	 }

	 
	 // display balances
	 System.out.print( "Enter debit amount for account2: ");
	 debitAmount = in.nextDouble();
	 System.out.printf( "\nSubtracting %.2f from account2 balance\n\n", debitAmount );
	 if (account1.getBalance()>=debitAmount) {
	 account1.debit( debitAmount );
	 System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
	 System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
	 }
	 else {
	 System.out.printf("Debit amount exceeded account balance.");
	 }
	 }
	 
	


	 	
	}


