package assignment3;

public class Question10 {

	public static void main(String[] args) {

	}
	
	public void bubbleSort(int[] ar){
		int temp = 0;
		for(int i = 0; i < ar.length; i++){
			for(int j = 1; j < ar.length - i; j++){
				if(ar[j-1] > ar[j]){
					temp = ar[j - 1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
}
