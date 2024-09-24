package javaProgrammes;

public class SumofARRAY14elements {

	public static void main(String[] args) 
	{
		int a[]= {5,4,5,4,8,9,8};
		long sum=0;
		
		for (int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
