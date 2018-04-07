package Assignment2b;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number:");
		String bin = sc.nextLine();
		sc.close();
		char[] binChar = bin.toCharArray();
		int dec = 0;
		
		for(int i = binChar.length - 1; i >= 0; i--){
			if(binChar[i] == '1'){
				dec = (int) (dec + Math.pow(2, i));
			}
		}
		System.out.println("Decimal: " + dec);
	}
}
