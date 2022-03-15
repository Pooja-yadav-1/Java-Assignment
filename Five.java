import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers :");
	     int  x=in.nextInt();
		 int y=in.nextInt();
		 char o=in.next().charAt(0);
		switch(o) {
		case '+':
			System.out.println(x+y);
			break;
		case '-':
			System.out.println(x-y);
			break;
		case '*':
			System.out.println(x*y);
			break;
		case '%':
			System.out.println(x%y);
			break;
			default:
				System.out.println("Illegal Operations");
		
		}
			
	}

}
