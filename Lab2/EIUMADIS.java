package Lab2;

import java.util.Scanner;

public class EIUMADIS {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        long[] a = new long[n];

	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextLong(); 
	        }

	        long min = a[0];
	        long max = Long.MIN_VALUE;

	        for (int i = 1; i < n; i++) {
	            long diff = a[i] - min;
	            if (diff > max) {
	                max = diff;
	            }
	            if (a[i] < min) {
	                min = a[i];
	            }
	        }

	        if (max < 0) max = 0;

	        System.out.println(max);
		}
	}
