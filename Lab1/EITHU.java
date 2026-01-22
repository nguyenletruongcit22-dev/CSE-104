import java.util.*;
import java.lang.*;

class Main.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String firstPart = sc.nextLine();
		String secondPart = sc.nextLine();

		int minLength = firstPart.length() + secondPart.length() - overlap(firstPart, secondPart);
		System.out.println(minLength);
	}

	public static int overlap(String firstPart, String secondPart) {
		for (int i = 0; i < firstPart.length(); i++) {
			String suffix = firstPart.substring(i);
			if (secondPart.startsWith(suffix)) {
				return firstPart.length() - i;
			}

		}
		return 0;
	}
}
