
public class Eleven {
	public static void main(String[] args) {
		int array[]= {0,0,0,0,0,0,0,0,0,0};
		int arr[]= {2,4,1,1,1,1,1,1,1,1,3,3,2,4,1};
		for(int i=0;i<arr.length;i++) {
			arr[i]+=1;
			System.out.println("Bonus array: "+arr[i]+" ");
			
		}
		int bestScore[]= {45,67,89,97,90};
		for(int j=0;j<bestScore.length;j++) {
			System.out.println(bestScore[j]);
		}
	}

}
