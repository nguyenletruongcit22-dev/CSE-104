package cse104_2;

import java.util.Scanner;

public class EIMONE {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) 
	{
			int n = sc.nextInt();
		int count20=0;
		int count10=0;
		int count5=0;
		int count1=0;
		while (n>=20) {
			n-=20;
			count20++;
		}
		if (count20>0)
			System.out.println("20 "+ count20);
		while (n>=10) {
			n-=10;
			count10++;
		}
		if (count10>0)
			System.out.println("10 "+ count10);
		while (n>=5) {
			n-=5;
			count5++;
		}
		if (count5>0)
			System.out.println("5 "+ count5);
		while (n>=1) {
			n-=1;
			count1++;
		}
		if (count1>0)
			System.out.println("1 "+ count1);
	}
}

