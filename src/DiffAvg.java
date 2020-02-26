public class DiffAvg {

	public static void main(String[] args) {

		int avg = 0;
		int[] arr = new int[] { 50, 45, 40, 35, 30, 25, 20 };
		
		for(int i = 0; i < arr.length-1; i++){
			avg = arr[i] - arr[i+1]; 
			System.out.println(avg);
		}
		
		System.out.println("==================");
		int[] arr2 = new int[] { 115, 80, 70, 55, 45, 40, 25 };
		
		int sum =0;
	
		for(int i = 0; i < arr2.length-1; i++){
			int avg2 = arr2[i] - arr2[i+1]; 
			System.out.println(avg2);
			
			sum += avg2;
		}

		int avg3 = sum / (arr2.length-1);
		System.out.println("평균  : " + avg3);
 		
	}
}
