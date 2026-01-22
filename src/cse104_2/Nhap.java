package cse104_2;

import java.util.Scanner;

public class Nhap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double rate = 0.1;
		for (int i = 1; i <= n; i++) {
			double net = sc.nextDouble();
			double tax = net / 0.9 * rate;
			System.out.printf("%.1f%n", tax);
		}
		sc.close();
	}
}
