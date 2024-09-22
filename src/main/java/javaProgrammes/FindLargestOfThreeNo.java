package javaProgrammes;

import java.util.Scanner;

public class FindLargestOfThreeNo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second no");
		int b=sc.nextInt();
		
		System.out.println("enter third no");
		int c=sc.nextInt();
		
		if( a>b && a>c) 
		{
			System.out.println("a is largestnumber");
		}
		else if(b>a && b>c) 
		{
			System.out.println("b is largestnumber");
		}
		else
		{
			System.out.println("c is largest");
		}

	}

}
