package javaProgrammes;

public class Countdigits {

	public static void main(String[] args) 
	{
		int num=123456789;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
