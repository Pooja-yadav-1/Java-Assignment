import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("Tempertaure in Celsius (°C):");
		float c=in.nextFloat();
		float f=(9/5)*c +32;
		System.out.println("Converted in Fahrenhiet :"+f+"°F"); // Degree =alt+0176
		
	}

}
