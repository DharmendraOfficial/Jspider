//program to calc. sum of given digits
class DigitSum
{
	public static void main(String[] args) 
	{
		int num=1234;
		int digit=digitSum(num);
		System.out.println("sum of given digits"+digit);
	}
	public static int digitSum(int x)
	{
		int sum=0;
		int rem;
		while(x>0)
		{
			rem=x%10;
			x=x/10;
			sum=sum+rem;
			
		}
		return sum;
	}
}
