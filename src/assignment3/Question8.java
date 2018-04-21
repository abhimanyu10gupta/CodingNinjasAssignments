package assignment3;

public class Question8 {

	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4,5,6};
		int[] ar2 = {1,2,3,4,5,6};
		int[] arSum = new int[ar1.length];
		for(int i = 0; i < ar1.length; i++){
			arSum[i] = ar1[i] + ar2[i];
		}
		for(int i : arSum){
			System.out.println(i);
		}
	}

}
