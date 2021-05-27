class PerfectArray 
{
	public static void main(String[] args) 
	{
		int[] a={2,6,12,13,45,56,128};

		printPerfect(a);
	}

	public static void printPerfect(int[] a)
	{
		System.out.println("Perfect Numbers in the array are ");
		for (int i=0;i<a.length;i++ )
		{
			if(isPerfect(a[i]))
			{
				System.out.println(a[i]);
			}
		}
	}

	public static boolean isPerfect(int num)
	{
		int sum=0;
		int temp=num;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==temp? true:false;


	}
}
