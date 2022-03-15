
public class Nine {
	public static void main(String[] args) {
		int array[]= {34,56,34,34,55,45,90,43,78,70};
		int largest=array[0];
		for(int i=1;i<=array.length;i++) {
			if(largest<array[i]) {
				largest=array[i];
			
			System.out.println(largest);
			}
			
		}
	}
	

}
