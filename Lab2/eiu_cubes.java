package Lab2;

import java.util.Scanner;

public class eiu_cubes {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	        int Total = 0;
	        int layer = 0;
	        for (int i = 1;i<=n; i++) {
	            int brick = i * (i + 1) / 2;
	            if ((Total + brick) > n) {
	                break;
	            }
	            Total += brick;
	            layer++;
	        }
	        System.out.println(layer);
		}
	}
