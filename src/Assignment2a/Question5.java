package Assignment2a;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		char[] ch = a.toCharArray();
		for(int i = 0; i<ch.length; i++){
			if (Character.getNumericValue(ch[i]) % 2 == 0){
				sumEven = sumEven + Character.getNumericValue(ch[i]);
			} else {
				sumOdd = sumOdd + Character.getNumericValue(ch[i]);
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}

}
