package Lab3;

import java.util.Scanner;

public class EIDISCOUNT3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long[] limits = { 1, 5_000_000, 20_000_000L, 100_000_000, 300_000_000, 600_000_000, 900_000_000,
				Long.MAX_VALUE };
		int[] discounts = { 0, 3, 5, 7, 10, 12, 15 };

		long totalPay = 0;

		for (int i = limits.length - 1; i > 0; i--) {
			if (n > limits[i - 1]) {
				long amountInThisLevel = n - limits[i - 1];
				long discounted = amountInThisLevel * (100 - discounts[i - 1]) / 100;
				totalPay += discounted;
				n = limits[i - 1];
			}
		}
		totalPay += n;
		int TetDis[]= new int[3];
		for (int i=0; i<TetDis.length; i++) {
			TetDis[i]=sc.nextInt();
			if (TetDis[i]==1) {
				totalPay*=0.98;
			}
		}
		System.out.println(totalPay);	
	}
}
