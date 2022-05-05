package Blog1;

import java.util.Scanner;

public class pallendrom1 {
public static void main(String[] args) {
	
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter the string=");
	
	String a=obj.nextLine();//next() or nextLine() methode me differ he next sir space tak read karta, 
	                        //nextLine() methode space ke bad bhi puri line read karti
	
	//String b;// yaha per initialise nahi kiya fir use nahi hota yaha
	String b="";// b initalise karna jaruri 
	
	int length =a.length();// a.length(); methode use for count the lenth of string which is integer 
	System.out.println("lenght of string="+length);//show the lenth 3
	
	int index =length-1; // indext start from 0,1,2
	System.out.println("index of string is="+index);//2
	
	for (int c=index;c>=0;c--)
	{
		b=b+a.charAt(c);
	}
	System.out.println(a+"=Reverse is ="+b);
	
	
	if (a.equals(b))
	{
		System.out.println(a+ " =is pallendrom");
	}
	else
	{
		System.out.println(a+" =is not pallendrom");
	}
	
}
}
