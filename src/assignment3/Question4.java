package assignment3;

public class Question4 {
	
	public static void main(String[] args){
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		int odd = 0;
		int even = 0;
		for(int i:ar){
			if(i%2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
