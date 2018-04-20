package Assignment2b;

import java.util.Scanner;
import java.util.Stack;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number:");
		Stack<Integer> st = new Stack<Integer>();
		int dec = sc.nextInt();
		sc.close();
		while(dec>0){
			st.push(dec%2);
			dec=dec/2;
			}
		
		while(!st.isEmpty()){
			System.out.print(st.pop());
		}
		
	}
}
