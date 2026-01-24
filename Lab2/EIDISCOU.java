package Lab2;

import java.util.Scanner;

public class EIDISCOU {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); 

		
		long[] limits = { 1_000, 2_000_000, 10_000_000L, 50_000_000, 100_000_000, 200_000_000, 500_000_000,
				 Long.MAX_VALUE };
		int[] discounts = { 0, 3, 5, 7, 10, 12, 15};

		long totalPay = 0;

		for (int i = limits.length - 1; i > 0; i--) {
			if (n > limits[i - 1]) {
				long amountInThisLevel = n - limits[i - 1];
				long discounted = amountInThisLevel * (100 - discounts[i - 1]) / 100;
				totalPay += discounted;
				n = limits[i - 1];
			}
		}
		totalPay+=n;
		System.out.println(totalPay);
	}
}
