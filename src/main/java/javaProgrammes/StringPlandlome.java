package javaProgrammes;

import java.util.Scanner;

public class StringPlandlome {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String str=sc.next();
		String original=str;
		String rev="";
		
int len=str.length();
		
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
	if(original.equals(rev)) 
	{
		System.out.print(original+ "palendrolam string");
	}
	else{
	System.out.println(original+"not plandrelome number");
	}
	}

}
