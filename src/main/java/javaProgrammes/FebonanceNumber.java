package javaProgrammes;

public class FebonanceNumber {
	// two numbers 0,1 adding series manner 0+1=1,1+1=2,2+1=3,3+2=5
	public static void main(String[] args)
	{
		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++) 
		{
			sum=n1+n2;
		System.out.print(" "+n2);
		n1=n2;
		n2=sum;
			
			
		}
		
	}

}
