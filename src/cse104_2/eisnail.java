package cse104_2;

import java.util.Scanner;

public class eisnail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long V = sc.nextInt();
		
		
		long day = (long) (1 + Math.ceil((double)(V - A) / (A - B)));

		System.out.println(day);
	}

}
