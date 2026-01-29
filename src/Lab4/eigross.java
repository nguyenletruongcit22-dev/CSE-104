package Lab4;

import java.util.Scanner;

public class eigross {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        for (int i = 0; i < n; i++) {
	            double netIncome = scanner.nextDouble();
	            double taxAmount = netIncome / 9.0;
	            System.out.println(taxAmount);
	        }

	        
	}
}
