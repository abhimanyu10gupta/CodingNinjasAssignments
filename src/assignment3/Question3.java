package assignment3;

public class Question3 {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,9,10,11};
		for(int i = 0; i < ar.length/2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i -1] = temp;
		}
		for(int i : ar){
			System.out.println(i);
		}
	}
}
