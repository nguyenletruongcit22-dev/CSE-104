package Lab4;

import java.util.Scanner;

public class eidinrate {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int testCases = sc.nextInt();

	        for (int t = 0; t < testCases; t++) {
			double N = sc.nextDouble();
	 		double L = sc.nextDouble();
	 		double M = sc.nextDouble();
	 		int years = (int) Math.ceil(Math.log(M / N) / Math.log(1 + L / 100));
			System.out.println(years);
	        }
	    }
	}
