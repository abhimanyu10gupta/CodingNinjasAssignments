package Assignment2a;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Base Salary:");
		double baseSalary = sc.nextDouble();
		System.out.print("Enter your grade:(A,B, or C)");
		String grade = sc.next();
		sc.close();
		
		System.out.println(totalSalary(baseSalary, grade));
	}
	
	public static double totalSalary(double base, String grade){
		double total = base;
		total = total + (20*base)/100 + (50*base)/100 - (11*base)/100;
		switch(grade){
		case "A": total = total + 1700;
		break;
		case "B": total = total + 1500;
		break;
		case "C": total = total + 1300;
		}
		return total;
	}
}
