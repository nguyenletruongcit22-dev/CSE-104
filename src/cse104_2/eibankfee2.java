package cse104_2;

import java.util.Scanner;

public class eibankfee2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int balances[] = { 5000, 2000, 500, 0 };
		double fees[] = { 0, 5, 7.5, 12 };
		double check[] = { 0, 0.1, 0.2, 0.2 };
		double payment = 0;
		long Total_check=0;
		for (int i = 0; i < n; i++) {
			double money = sc.nextDouble();
			int noCheck = sc.nextInt();
			for (int j = 0; j< balances.length; j++) {
				if (money >= balances[j]) {
					payment += fees[j] + check[j]* noCheck;
					Total_check+=noCheck;
					break;
				}
			}
			
		}
		    System.out.println( payment / Total_check); 
	}

}
