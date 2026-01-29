package Lab4;

import java.util.Scanner;

public class ei_gross2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();

		double salary = n - 11_000_000;

		long[] taxIncome = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52000000, 80000000, Long.MAX_VALUE };
		double[] rates = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
		for (int i = 0; i < taxIncome.length - 1; i++) {
			if (salary > taxIncome[i]) {
				salary += Math.min(taxIncome[i + 1] - taxIncome[i], (salary - taxIncome[i]) / (1 - rates[i]))
						* rates[i];

			}
		}

		System.out.println(Math.round(salary) + 11_000_000);

	}
}
