import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {
		int x,y;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		x=in.nextInt();
		y=in.nextInt();
		
		if(x%y==0) {
			System.out.println(x +" is multiple of "+ y);
		}
		else {
			System.out.println("Not a multiple");
		}
		}
	

}
