import java.util.*;

class  CheckStringInStringArray
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of Array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Array Elements");
		String data[] = new String[n];
		for(int i = 0;i < n; i++){
			data[i] = sc.next();
		}
		System.out.println("Enter the key:");
		String key = sc.next();
		CheckStringPresentInStringArray(data, key);
	}

	public static void CheckStringPresentInStringArray(String data[] , String key){
		for(int i = 0; i < data.length; i++){
			if(key.equals(data[i])){
				System.out.println("The String is present at "+ (i + 1) + " th position");
				return;
			}
		}
		System.out.println("The given Key is Not found in String Array");
	}
}