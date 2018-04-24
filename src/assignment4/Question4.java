package assignment4;

public class Question4 {
	public void triplets(int[] A, int x){
		for(int i:A){
			for(int j : A){
				for(int k : A){
					if(i + j + k == x){
						System.out.println(i+j+k);
					}
				}
			}
		}
	}

}
