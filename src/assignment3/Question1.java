package assignment3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int count = 0;
		int num = dec;
		sc.close();
		while(dec>0){
			dec=dec/2;
			count++;
			}
		int[] ar = new int[count];
		int i = count - 1;
		while(num>0){
			ar[i] = num%2;
			num=num/2;
			i--;
			}
		for(int j:ar){
			System.out.print(j);
		}
	}

}

    
