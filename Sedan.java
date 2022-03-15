

	public class Sedan extends Car{
		int length;

		public Sedan(int speed, double regularPrice, String color, int length){
		    super(speed, regularPrice, color);
		    this.length = length;
		}

		  public  double getSalePrice(){
		        if (length>20) {
		        return super.getSalePrice()*0.95;
		        }
		        else 
		        	return super.getSalePrice()*0.9;
		    }
}
