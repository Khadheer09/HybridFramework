package javaProgrammes;

public class Even15OddinARRY {

	public static void main(String[] args) 
	{
		int a[]= {5,4,11,10};
		
		
		
		for (int i=0;i<=a.length-1;i++) 
		{
			if (a[i]%2 ==0) 
			
				System.out.println(a[i]);
			
		}
		for (int i=0;i<=a.length;i++)
		{
			if (a[i]%2!=0)
				System.out.println(a[i]);
		}
	

	}

}
