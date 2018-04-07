package Assignment2a;
import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		String c = sc.nextLine();
		sc.close();
		int d = c.charAt(0);
		if (d >= 65 && d < 97){
			System.out.println("Upper case character");
		} else if (d>=97 && d<122){
			System.out.println("Smaller case character");
		} else {
			System.out.println("Invalid character");
		}
	}
}
