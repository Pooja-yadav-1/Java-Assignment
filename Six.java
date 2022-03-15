import java.util.Scanner;
public class Six {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x,y;
		System.out.println("Enter first digit :");
		x=in.nextInt();
		System.out.println("Enter the secong digit :");
		y=in.nextInt();
		if(x==y) {
			System.out.println("Both are equal");
			}
		else {
				if(x>y) {
			System.out.println("X is larger");
		}
			else {
				System.out.println("y is larger");
			}
			}
	}
}
	


