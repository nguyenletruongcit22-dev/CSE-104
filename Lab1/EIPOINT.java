import java.util.*;
import java.lang.*;

class Main.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] grades= {90,85,80,75,70,65,60,55,53,52,50,0};
		String [] point= {"A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
		for (int i=0; i<n; i++) {
			if (n>=grades[i]) {
			System.out.println(point[i]);
			break;
			}
		}
	}
	}
