package cse104_2;

import java.util.Scanner;

public class EIUSALES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long levels[] = { 0, 20, 50, 200, 500, 2000, Long.MAX_VALUE };
		double rates[] = { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
		double Total = 0;
		for (int i = 0; i < levels.length-1; i++) {
			if (n > levels[i]) {
				long amountThisLevel = Math.min((levels[i + 1] - levels[i]), n - levels[i]);
				double m=  Math.round(amountThisLevel * rates[i]);
				Total += m;
				n -= amountThisLevel;
			}
		}
		System.out.println(Total);
	}

}
