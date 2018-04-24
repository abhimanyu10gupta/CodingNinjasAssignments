package assignment4;

public class Question5 {

	public int[] sort012(int[] arr){
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i : arr){
			if(i == 0){
				count0++;
			}else if(i == 1){
				count1++;
			}else{
				count2++;
			}
		}
		int i  = 0;
		while(i < arr.length){
			if(count0 > 0){
				arr[i] = 0;
				i++;
				count0--;
			}else if(count1 > 1){
				arr[i] = 1;
				i++;
				count1--;
			}else{
				arr[i] = 2;
				i++;
				count2--;
			}
		}
		return arr;
	}

}
