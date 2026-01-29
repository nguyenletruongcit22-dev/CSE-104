package Lab5;

import java.util.Scanner;

public class EIVCHR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long discount = N * 3 / 10;
		if (discount > 50_000) {
			discount = 50_000;
		}
		N -= discount;
		System.out.println(N);
	}
}
