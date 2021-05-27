class SmallPrimeArray 
{
	public static void main(String[] args) 
	{
		int[] a={6,12,13,17,19,45,57,69};

		printSmallPrime(a);
	}

	public static void printSmallPrime(int[] a)
	{
		System.out.println("Smallest of the Prime Numbers in the array is ");
		int small=Integer.MAX_VALUE;
		for (int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				if(a[i]<small)
					small=a[i];
			}
		}
		System.out.println(small);
	}

	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;


	}
}

