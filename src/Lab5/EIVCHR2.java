package Lab5;

import java.util.Scanner;

public class EIVCHR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Total = 0;

		for (int i = 0; i < N; i++) {
			int prices = sc.nextInt();
			Total += prices;
		}
		int discount = Total * 3 / 10;
		if (discount > 50_000) {
			discount = 50_000;
		}
		Total -= discount;
		System.out.println(Total);
	}

}
