package assignment4;

public class Helper {

	public static void main(String[] args) {
		Question4 ob = new Question4();
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {3,6,8,2,5,8,6,4,8,0};
		int[] arr3 = {9,8,7,6,5,4,3,2,1,0};
		ob.triplets(arr1, 10);
		ob.triplets(arr2, 10);
		ob.triplets(arr3, 10);
	}

}
