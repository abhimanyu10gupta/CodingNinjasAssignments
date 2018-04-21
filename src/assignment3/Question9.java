package assignment3;

public class Question9 {
	public static void main(String[] args) {
		int[] ar = {0,1,0,0,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0,0};
		int count = 0;
		for(int i : ar){
			if(i == 0){
				count++;
			}
		}
		for(int i = 0; i < count; i++){
			ar[i] = 0;
		}
		for(int i = count; i < ar.length; i++){
			ar[i] = 1;
		}
		
		for(int i : ar){
			System.out.println(i);
		}
	}
}
