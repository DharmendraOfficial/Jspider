//program to check odd even
class OddEven 
{
	public static void main(String[] args) 
	{
		int num=5;
		if(isOddEven(num))
		{
			System.out.println(num+"  is even");
		}
		else
		{
			System.out.println(num+"  is odd");
		}
	}
	public static boolean isOddEven(int num)
	{
		return (num &1)==0? true:false;
	}
}
