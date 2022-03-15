import java.util.Scanner;

public class Text{
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in) ;
		System.out.println("Enter the digits :");
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		int q=x+y+z;
		System.out.println("Addition of three no.:"+ q);
	 int p=x*y*z;
		System.out.println("Product of three numbers:" + p);
		}
}