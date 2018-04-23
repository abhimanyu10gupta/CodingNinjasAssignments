package helper;
import assignment4.*;

public class Helper {
	
	public static void printArray(int[] arr){
		for(int i : arr){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		Question3 ob = new Question3();
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {3,6,8,2,5,8,6,4,8,0};
		int[] arr3 = {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println(ob.secondLargest(arr1));
		System.out.println(ob.secondLargest(arr2));
		System.out.println(ob.secondLargest(arr3));
	}
	
}
