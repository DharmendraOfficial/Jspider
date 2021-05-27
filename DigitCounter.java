//program to count number of digits
class DigitCounter
{
	public static void main(String[] args) 
	{
		int num=1234;
		int digit=digitCount(num);
		System.out.println("total no of digit in given number is"+digit);
	}
	public static int digitCount(int x)
	{
		int count=0;
		while(x>0)
		{
			count++;
			x=x/10;
			
		}
		return count;
	}
}
