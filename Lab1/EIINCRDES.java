import java.util.*;
import java.lang.*;

class Main.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
        }
        
        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1])
                decreasing = true;
            else if (a[j] < a[j + 1])
                increasing = true;
            else {
                increasing = true;
                decreasing = true;
            }
        }
        if (increasing && !decreasing)
            System.out.println("increasing");
        else if (!increasing && decreasing)
            System.out.println("decreasing");
        else
                System.out.println("none");
	}
}
