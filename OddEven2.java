class OddEven2 
{
	public static void main(String[] args) 
	{
		int num=5;
		boolean b=isOddEven(num);
		if(isOddEven(num))
		{
			System.out.println(num +"is even");

		}
		else
		{
			System.out.println(num+ " is odd");

		}
	}
	public static boolean isOddEven(int num)
	{
		return num/2*2 == num;
	}
}
