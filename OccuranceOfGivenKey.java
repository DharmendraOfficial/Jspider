import java.util.*;

class  OccuranceOfGivenKey
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the array Elements:");
		int arr[] = new int[n];
		for(int i = 0;i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Key");
		int key = sc.nextInt();
		int occurance = CountOccuranceInArray(arr, key);
		System.out.println(occurance);
	}

	public static int CountOccuranceInArray(int arr[] , int key){
		int count = 0;
		if(count==0)
		{
			System.out.println("Key not found");
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == key) {
				count++;
			}
		}
		return count;
	}
}