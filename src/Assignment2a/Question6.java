package Assignment2a;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x:");
		int x = sc.nextInt();
		System.out.println("enter n:");
		int n = sc.nextInt();
		sc.close();
		int ans = 1;
		for(int i = 0; i < n; i++){
			ans = x*ans;
		}
		System.out.println("Asnwer is : " + ans);
	}

}
