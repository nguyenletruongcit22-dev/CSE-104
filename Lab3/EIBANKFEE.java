package Lab3;

import java.util.Scanner;

public class EIBANKFEE {

    public static void main(String[] args) {
        Scanner sc   = new Scanner (System.in);
        double n     = sc.nextDouble();
        long noCheck = sc.nextLong();
        long balances[] = { 5000,2000,500,0};
        double fees[] = { 0, 5, 7.5, 12 };
        double check[] = { 0, 0.1, 0.2, 0.2 };
        double payment=0;
        for  (int i=0; i<balances.length; i++) {
            if(n>=balances[i]) {
                payment= fees[i]+check[i]*noCheck;
                break;
            }
        }
        System.out.println(payment);
    }

}

