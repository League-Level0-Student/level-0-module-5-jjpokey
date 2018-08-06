package algorithms;

public class Fibonacci {

	public static void main(String[] args) {

		int temp = 0;
		int f = 0;
		int fa = 1;
		System.out.print("0 " +  "1" + " ");
		for(int a = 0; a < 11; a++) {
			temp = f;
			f = fa;
			fa = temp;
			f = f + fa;
			System.out.print(fa + f + " ");
			
		}
		
	}

	
}
