package Lab4;

import java.util.Scanner;

public class EIDINRATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int testCases = sc.nextInt();

	        for (int t = 0; t < testCases; t++) {
	            double N = sc.nextDouble();
	            double L = sc.nextDouble();
	            double M = sc.nextDouble(); 

	            int years = 0;
	            while (N < M) {
	                N *= (1 + L / 100);
	                years++;
	            }

	            System.out.println(years);
	        }
	    }
	}