package assignment4;

public class Question4 {
	public void triplets(int[] A, int x){
		for(int i:A){
			for(int j : A){
				for(int k : A){
					if(i + j + k == x){
						System.out.print(i);
						System.out.print(j);
						System.out.print(k);
						System.out.println("");
					}
				}
			}
		}
	}

}
