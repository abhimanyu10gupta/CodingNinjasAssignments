package Assignment2b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number:");
		int dec = sc.nextInt();
		char[] bin = new char[10];
		sc.close();
		int quotient = 0;
		int div = dec;
		int i = 0;
		while(div > 1){
			while(div >= 2){
				div = div - 2;
				quotient++;
			}
				bin[i]  = Character.forDigit(div, 10); 
				i++;
				div = quotient;
				if(div==1){
					bin[i] = Character.forDigit(div, 10);
					break;
				}
			
		}
		for(char a:bin){
			System.out.println(a);
		}
	}

}
