package Lab5;

import java.util.Scanner;

public class EIUPASSBOOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		int n = sc.nextInt();
		int m = sc.nextInt();
		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();

		double passbookMaturity = X * (1 + (r1 / 100) * ((double) n / 12));

		int duration = n - m;
		int years = duration / 12;
		int months = duration % 12;

		double compoundFactor = Math.pow(1 + r2 / 100, years);

		double simpleFactor = 1 + (r2 / 100) * ((double) months / 12);

		double loanFactor = compoundFactor * simpleFactor;

		double Y = passbookMaturity / loanFactor;

		double result = Math.max((double) X, Y);

		System.out.println(Math.round(result));
	}
}
