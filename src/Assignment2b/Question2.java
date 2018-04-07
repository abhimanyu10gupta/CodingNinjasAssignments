package Assignment2b;

public class Question2{

	public static void main(String[] args) {
		int j = 1;
		while(j<21){
			int num = 3*j+2;
			if(num%4 != 0){
				j++;
				System.out.println(num);
			} else{
				System.out.println("haha");
			}
		}
	}

}
