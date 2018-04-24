package assignment4;

public class Question6 {

	public static void main(String[] args) {
		int[] arr = {7,8,9,1,2,3,4,5};
		int[] arr1 = {2,3,4,5,6,7,1};
		
		System.out.println(rotate(arr));
		System.out.print(rotate(arr1));
	}
	
	public static int rotate(int[] arr){
		int min = arr[0];
		int minIndex = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
