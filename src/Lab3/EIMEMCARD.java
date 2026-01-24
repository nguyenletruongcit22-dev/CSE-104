package Lab3;

import java.util.Scanner;

public class EIMEMCARD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] prices = new long[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();
        }

        long[] thresholds = {200_000_000, 50_000_000, 20_000_000, 1_000_000, 0};
        double[] discounts = {0.07, 0.05, 0.03, 0.02, 0.0};

        long total = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            double discountRate = 0;

            for (int j = 0; j < thresholds.length; j++) {
                if (total >= thresholds[j]) {
                    discountRate = discounts[j];
                    break;
                }
            }

            double discountAmount = prices[i] * discountRate;
            double rounded = Math.round(discountAmount * 100.0) / 100.0;

            long intPart = (long) rounded;
            int decimalPart = (int) Math.round((rounded - intPart) * 100);

           
            if (decimalPart == 0) {
                sb.append(intPart).append(" ");
            } else if (decimalPart % 10 == 0) {
                sb.append(intPart).append(".").append(decimalPart / 10).append(" ");
            } else {
                if (decimalPart < 10) {
                    sb.append(intPart).append(".0").append(decimalPart).append(" ");
                } else {
                    sb.append(intPart).append(".").append(decimalPart).append(" ");
                }
            }

            total += prices[i];
        }

     
        System.out.println(sb.toString().trim());
    }
}
	

