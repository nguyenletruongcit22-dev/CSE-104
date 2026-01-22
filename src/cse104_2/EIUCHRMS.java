package cse104_2;

import java.util.Scanner;

public class EIUCHRMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long levels[] = { 2_000_000, 5_000_000, 10_000_000, 20_000_000, 50_000_000, 100_000_000, 200_000_000,
				Long.MAX_VALUE };
		double rates[] = { 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1 };

		long total = 0;

		for (int i = 0; i < n; i++) {
			int money = sc.nextInt();
			for (int j = 0; j < levels.length; j++) {
				if (money <= levels[j]) {
					total += Math.round(money * (1 - rates[j]));
					break;
				}
			}
		}

		System.out.println(total);

	}

}
