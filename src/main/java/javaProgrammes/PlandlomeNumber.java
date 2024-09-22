package javaProgrammes;

import java.util.Scanner;

public class PlandlomeNumber {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num=sc.nextInt();
		//int num=123456;
		int originalnum=num;
		
		int rev=0;
		
		while(num!=0) 
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(originalnum==rev)
		{
			System.out.println(originalnum+" "+"palandlome number");
		}
		else 
		{
		System.out.println(originalnum+" "+"not a paldolomenumber");
		}
	}

}
