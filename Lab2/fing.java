package Lab2;

import java.util.Scanner;

public class fing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        String[] fingers = {"cai", "tro", "giua", "ap ut", "ut"};

        String finger = "";
        String hand = "";

       
        if (n > 18) {
            n %= 18;
            if (n == 0) {
                n = 18; 
            }
        }

        if (n >= 11 && n <= 17) {
            n = 20 - n;
        }

        if (n >= 1 && n <= 5) {
            hand = "trai";
            finger = fingers[(int) n - 1];
        } else if (n >= 6 && n <= 10) {
            hand = "phai";
            finger = fingers[10 - (int) n];
        }

        System.out.println("Ngon " + finger + " cua ban tay " + hand);

        scanner.close();
}
}
