package vicky;

public class triangle4 {

	public static void main(String[] args) {
		
		
		for (int a=1; a<=5 ; a++)
		{
			for (int b=5; b>=a; b--)
			{
				System.out.print(" ");
			}
			for (int b=1; b<=a;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
