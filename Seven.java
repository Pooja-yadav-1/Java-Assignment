import java.util.Scanner;

public class Seven {
	
	
	public static void main(String[] args) {
		int x , y, z;
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter three integers :");
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		int sum,avg,  product;
		
		sum=x+y+z;
	     avg=(sum)/3;
		product=(x*y)*z;
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);
		System.out.println("Product is: "+product);
		
		if(x>y) {
			if(x>z) {
				System.out.println("x is largest");
				
			}
			else {
				System.out.println("z is largest");
			}
		}
		else {
			System.out.println("y is largest");
		}
		
	}

}
