package Assignment2a;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		double root1, root2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A:");
		int a = sc.nextInt();
		System.out.println("enter B:");
		int b = sc.nextInt();
		System.out.println("enter C:");
		int c = sc.nextInt();
		sc.close();
		
		double det = b*b - 4*a*c;
		
		if (det == 0){
			root1 = root2 = -b/2*a;
		} else if(det > 0){
			root1 = (-b-Math.sqrt(det))/2*a;
			root2 = (-b+Math.sqrt(det))/2*a;
		} else {
			root1 = (-b/2*a) + Math.sqrt(-det)/2*a ;
			root2 = (-b/2*a) - Math.sqrt(-det)/2*a;
		}
		
		System.out.println(root1);
		System.out.println(root2);
	}
	
}