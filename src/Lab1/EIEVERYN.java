package cse104_2;

import java.util.Scanner;

public class EIEVERYN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // số lượng test case

        for (int t = 0; t < T; t++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            boolean[] seen = new boolean[m];
            int count = 0;

            for (int i = 0; i < m; i++) {
                int ai = sc.nextInt();
                if (ai >= 1 && ai <= n && seen[ai] == false) {
                    seen[ai] = true;
                    count ++;
                }
            }

            if (count == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}

}
