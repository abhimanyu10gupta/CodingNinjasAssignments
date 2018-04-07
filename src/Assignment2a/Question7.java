package Assignment2a;

import java.util.Scanner;

public class Question7 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int x = sc.nextInt();
		sc.close();
		String num = String.valueOf(x);
		char[] numReverse = new char[num.length()];
		int y = num.length() - 1;
		for (int i = 0; i < num.length(); i++){
			numReverse[y] = num.charAt(i); 
			y--;
		}
		String a = new String(numReverse);
		System.out.println(a);
	}
}
