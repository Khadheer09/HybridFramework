package javaProgrammes;

public class PrimeNumber {
	//number should be greater than 1>
	//number which have only two factors 1&self like 3,5,7,11,17,13

	public static void main(String[] args)
	{
		int num=0;
		int count=0;
		
		if(num>1) 
		{
			for(int i=1;i<=num;i++) 
			{
				if(num%i ==0)
					count++;
			}
		if(count==2) 
		{
			System.out.println("prime number");
		}
		else {System.out.println("not prime number");}
			
			
		}
		else 
		{
			System.out.println("not prime number"); 
			
		}

	}

}
