package Lab4;

import java.util.Scanner;

public class ei_tax {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		long levels[]= {0,5_000_000,10_000_000,18_000_000,32_000_000,52_000_000,80_000_000,Long.MAX_VALUE};
		long tax[]= {5,10,15,20,25,30,35};
		long amount=0;
		if (n>9_000_000) 
			n-=9_000_000;
		else n=0;
		for (int i=levels.length-1;i>0;i--) {
			if(n>levels[i-1]) {
				 amount+=(n-levels[i-1])*tax[i-1]/100;
			n=(int) levels[i-1];
		}
		}
		System.out.println(amount);
	}

}
