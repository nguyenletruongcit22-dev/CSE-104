package Lab2;

import java.util.Scanner;

public class EIBIRTH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long Total = 0;
		long costblue;
		long costred;
		for (long i = 0; i < T; i++) {
			long B = sc.nextInt();
			long R = sc.nextInt();
			long X = sc.nextInt();
			long Y = sc.nextInt();
			long Z = sc.nextInt();
			
			costblue=Math.min(Y+Z, X);
			costred=Math.min(X+Z, Y);
			
			Total = costblue * B + (costred * R) ;
			System.out.println(Total);
		}
		
	}

}
