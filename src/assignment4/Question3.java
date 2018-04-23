package assignment4;

public class Question3 {

	public int secondLargest(int[] arr) {
		int max = 0;
		int sec = 0;
		for(int i : arr){
				if(i > max){
					max = i;
				}
			}
		for(int i : arr){
			if(i < max && i > sec){
				sec = i;
			}
		}
		return sec; 
	}

}
