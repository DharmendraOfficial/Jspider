//program to find whether given number is prime or not
class Prime 
{
	public static void main(String[] args) 
	{
		boolean b=isPrime(12);
		if(b)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	public static boolean isPrime(int n)
	{
		boolean b=true;
		if(n==1)
		{
			b=true;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					b=false;
					break;
				}
				else
				{
					b=true;
				}
			}
		}
		return b;
	}
}
