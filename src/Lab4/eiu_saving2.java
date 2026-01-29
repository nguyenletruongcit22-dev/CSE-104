package Lab4;

import java.util.Scanner;

public class eiu_saving2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double sum = 0;
		int m = sc.nextInt();
		for (int i = m; i > 0; i--) {
			double amount = sc.nextDouble();
			sum += calculateTotal(amount, i);

		}
		System.out.println(Math.round(sum));
	}

	public static double calculateTotal(double amount, int m) {
		double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
				0.0692 };
		double total = amount;
		int year = m / 12;
		int month = m % 12;
		if (year > 0)
			total = total * Math.pow(1 + rates[11], year);
		if (month > 0)
			total = total * (1 + rates[month - 1] * month / 12);
		return total;

	}
}
