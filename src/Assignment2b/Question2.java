package Assignment2b;

public class Question2{

	public static void main(String[] args) {
		int counter = 1;
		int j = 1;
		while(counter<21){
			int num = 3*j+2;
			if(num%4 != 0){
				counter++;
				System.out.println(num);
			}
			j++;
		}
	}

}
