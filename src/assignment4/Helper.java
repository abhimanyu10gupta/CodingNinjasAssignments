package assignment4;


public class Helper {

	public static void main(String[] args) {
		Question4 ob = new Question4();
		Question5 q5 = new Question5();
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {3,6,8,2,5,8,6,4,8,0};
		int[] arr3 = {9,8,7,6,5,4,3,2,1,0};
		int[] arr4 = {0,2,1,1,2,2,1,2,0,0,0,0,0,2,2,1,2,0,2,1,1};
		
		ob.triplets(arr1, 10);
		ob.triplets(arr2, 10);
		ob.triplets(arr3, 10);
		
		printArray(q5.sort012(arr4));
		}
	
	public static void printArray(int[] arr){
		for(int i : arr){
			System.out.println(i);
		}
	}

}
