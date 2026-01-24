package Lab3;

import java.util.Scanner;

public class eiu_bankfee2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        double totalFees = 0.0;
	        long totalChecks = 0;

	        for (int i = 0; i < n; i++) {
	            long balance = scanner.nextLong();
	            long numChecks = scanner.nextLong();

	            double monthlyFee = 0.0;
	            double perCheckFee = 0.0;

	            if (balance < 500) {
	                monthlyFee = 12.00;
	                perCheckFee = 0.20;
	            } else if (balance >= 500 && balance < 2000) {
	                monthlyFee = 7.50;
	                perCheckFee = 0.20;
	            } else if (balance >= 2000 && balance < 5000) {
	                monthlyFee = 5.00;
	                perCheckFee = 0.10;
	            } else { 
	                monthlyFee = 0.00;
	                perCheckFee = 0.00;
	            }

	            double accountTotalFee = monthlyFee + (numChecks * perCheckFee);

	            totalFees += accountTotalFee;
	            totalChecks += numChecks;
	        }

	        if (totalChecks == 0) {
	            System.out.println(0.0);
	        } else {
	            System.out.println(totalFees / totalChecks);
	        }
	}}
