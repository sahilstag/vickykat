package Blog1;

import java.util.Scanner;

public class factorial1 {
	
	public static void main(String[] args) {
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number a=");
		
		int a = obj.nextInt();
		int b=1;
		for (int c=a;c>=1;c--)
		{
			b=b*c;
		}
		System.out.println(b);
	}

}
