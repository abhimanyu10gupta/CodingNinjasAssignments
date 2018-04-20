package assignment3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		sc.close();
		for(int i = 0; i < ar.length; i++){
			for(int j = i + 1; j < ar.length; j++){
				if(ar[i] + ar[j] == sum){
					System.out.println(ar[i] + "," + ar[j]);
				}
			}
		}
	}

}
