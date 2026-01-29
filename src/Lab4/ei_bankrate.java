package Lab4;

import java.util.Scanner;

public class ei_bankrate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		int month = sc.nextInt();
		double monthrate = money * month * (0.09 / 12);
		double total = monthrate + money;
		System.out.println(total);
	}

}
