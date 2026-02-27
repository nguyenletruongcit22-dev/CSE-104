package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class EIUTRIGLE {
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        Arrays.sort(arr);
        int count = 0;

       
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

           
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i); 
                    j--;
                } else {
                    i++;
                }
            }
        }

        System.out.println(count);
    }
}
	
	
