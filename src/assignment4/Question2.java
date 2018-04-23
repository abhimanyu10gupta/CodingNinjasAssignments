package assignment4;

public class Question2 {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,5,7,4};
		int[] arr2 = {1,7,3,45,5,8,0,4};
		
		for(int i : arr1){
			for(int j : arr2){
				if(i == j){
					System.out.print(i);
				}
			}
		}
	}
	
	public int[] question2a(int[] arr1, int[]arr2){
		int n = (arr1.length < arr2.length)? arr2.length:arr1.length;
		int[] ret = new int[n];
		int k = 0;
		for(int i : arr1){
			for(int j : arr2){
				if(i == j){
					ret[k] = i;
					k++;
				}
			}
		}
		return ret;
	}
}
