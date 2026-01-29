package Lab4;

import java.util.Scanner;

public class eiu_saving1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double total =N;
		int M = sc.nextInt();
		int year =M/12;
		int month=M%12;
		double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
				0.0692 };
		
		if (year>0)
			total= total*Math.pow(1+rates[11],year);
		if (month>0)
			total= total*(1+rates[month-1]*month/12);
		
		System.out.println(Math.round(total));

	}

}
