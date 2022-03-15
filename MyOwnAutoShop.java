
public class MyOwnAutoShop {
	public static void main(String[] args) {
	     
	        Car[] cars = new Car[4];

	        
	        cars[0] = new Sedan(160, 15000, "Green", 20);
	        cars[1] = new Ford(220, 45000, "Silver", 2010, 1700);
	        cars[2] = new Ford(280, 150000, "Red", 2010, 2500);
	        cars[3] = new Truck(160, 15000, "Green", 3850);

	        for (int i=0; i<3; i++){
	            
	            System.out.println("Item number " + i + ", Sale price = " + cars[i].getSalePrice());
	        }

	    }
}
