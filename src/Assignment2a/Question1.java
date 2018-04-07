package Assignment2a;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input your name");
		String name = sc.nextLine();
		System.out.println("Enter marks for Test A:");
		int marks1 = sc.nextInt();
		System.out.println("Enter marks for Test B:");
		int marks2 = sc.nextInt();
		System.out.println("Enter marks for Test C:");
		int marks3 = sc.nextInt();
		sc.close();
		
		int av = average(marks1, marks2, marks3);
		System.out.println("Name =" + name);
		System.out.println("average marks = " + av);
	}
	
	public static int average(int mark1, int mark2, int mark3){
		int av = 0;
		if (mark1 > mark2){
			if(mark2 > mark3){
				av = (mark1 + mark2)/2;
			} else {
				av = (mark1 + mark3)/2;
			}
		} else if (mark1 > mark3) {
			av = (mark1 + mark2)/2;
			
		} else {
			av = (mark2 + mark3)/2;
		}
		return av;
	}

}
