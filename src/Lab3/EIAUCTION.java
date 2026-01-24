package Lab3;

import java.util.Scanner;

public class EIAUCTION {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[7];
		int c[] = new int[7];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[a[i]]++;
			c[a[i]] = i;
		}
		int max = -1;
		for (int i = 6; i >= 1; i--) {
			if (b[i] == 1) {
				System.out.println(c[i] + 1);
				return;
			}
		}
		System.out.println("none");
	}
}
