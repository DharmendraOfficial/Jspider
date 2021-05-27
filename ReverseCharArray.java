import java.util.*;
class ReverseCharArray 
{
	public static void main(String[] args) 
	{
		char arr[]=readArray();
		System.out.println("Array before Reversing: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array after Reversing: ");
		printReverseArray(arr);
	}

	public static char[] readArray()
	{
		System.out.println("Enter the length of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] data = new char[n];
		for(int i =0 ; i < n; i++){
			data[i] = sc.next().charAt(0);
		}
		return data;
	}
	public static void printReverseArray(char arr[])
	{
		int i = 0;
		int j = arr.length - 1;
		char temp;
		while(i < j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(char ch : arr){
			System.out.print(ch + " ");
		}
	}

}
