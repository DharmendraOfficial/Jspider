class LargePrimeArray 
{
	public static void main(String[] args) 
	{
		int[] a={6,12,13,17,19,45,57,69};

		printLargePrime(a);
	}

	public static void printLargePrime(int[] a)
	{
		System.out.println("Largest of the Prime Numbers in the array is ");
		int large=0;
		for (int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				if(a[i]>large)
					large=a[i];
			}
		}
		System.out.println(large);
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


