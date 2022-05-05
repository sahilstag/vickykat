package Blog1;

import java.util.Scanner;

public class prac {
public static void main(String[] args) {
	
	Scanner obj =new Scanner(System.in);
	
	System.out.println("Enter the first number a=");
	int a=obj.nextInt();
	System.out.println("Enter the second number b=");
	int b= obj.nextInt();
	System.out.println("Enter the third number c=");
	int c= obj.nextInt();
	
	if((a>b)&&(a>c))
	{
		System.out.println("a is greater="+a);
		
	}
	else
	{
		if((b>a)&&(b>c))
		{
			System.out.println("b is greater ="+b);
		}
		else 
		{
			System.out.println("c is greater="+c);
		}
		
	}
	
	
	}
}


