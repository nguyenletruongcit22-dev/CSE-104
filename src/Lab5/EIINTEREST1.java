package Lab5;

import java.util.Scanner;

public class EIINTEREST1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double rate = sc.nextDouble();
		double totalMoney = 0;

		for (int i = 0; i < 12; i++) {

			long deposit = sc.nextLong();

			totalMoney += deposit;

			totalMoney = totalMoney * (1 + rate);
		}

		System.out.println(Math.round(totalMoney));

	}
}
