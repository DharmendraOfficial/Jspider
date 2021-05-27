//Program to check palindrome
class Palindrome
{
	public static void main(String[] args) 
	{
		int num=1221;
		int p=isPalindrome(num);
		if(num==p)
		{
			System.out.println(num+" is palindrome");
		}
		else
		{
			System.out.println(num+" is not palindrome");
		}
	}
	public static int isPalindrome(int n)
	{
		int rev=0;
		int rem;
		while (n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
