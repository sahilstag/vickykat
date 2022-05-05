package vicky;

public class tringle6 {

	public static void main(String[] args) {
		
		for (int a=1;a<=5;a++)//1,2
		{
			for (int b=5;b>=a;b--) //  ,
			{
				System.out.print("  ");
			}
			for (int b=1;b<=a;b++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}
}
//           *
//         * *