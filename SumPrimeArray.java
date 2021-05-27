class SumPrimeArray 
{
	public static void main(String[] args) 
	{
		int[] a={2,6,12,13,17,19,45,57,69};

		printSumPrime(a);
	}

	public static void printSumPrime(int[] a)
	{
		System.out.println("Sum of the Prime Numbers in the array are ");
		int sum=0;
		for (int i=0;i<a.length;i++ )
		{
			if(isPrime(a[i]))
			{
				sum+=a[i];	
			}
		}
		System.out.println(sum);
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
