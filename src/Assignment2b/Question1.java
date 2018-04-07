package Assignment2b;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = sc.nextInt();
		System.out.print("Press 1 for the sum or press 2 for the product (1...n):");
		int y = sc.nextInt();
		
		int sum = 0;
		int prod = 1;
		while(y !=1 || y!=2){
		switch(y) {
		case 1:
			for(int i = 1; i <= n; i++){
				sum = i+sum;
			}
			System.out.println(sum);
			y=1;
			break;
		case 2:
			for(int i = 1; i<=n; i++){
				prod = i*prod;
			}
			System.out.println(prod);
			y=2;
			break;
			
		default:
			System.out.print("not valid, enter the num again:");
			y = sc.nextInt();
			}
		}
		sc.close();
		
	}
}
