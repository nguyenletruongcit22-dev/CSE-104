package Lab3;

import java.util.Scanner;

public class eiu_markup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int count = 200;
		int price = 0;
		int tram = 100;
		while (money > 0) {
			if (count < 180)
				count = 180;
			
			if (money < 100)
				tram = money;
			price += tram * count;
			count--;
			money -= tram;
		}
		System.out.println(price);
	}

}
