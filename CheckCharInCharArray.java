import java.util.*;

class  CheckCharInCharArray
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char data[] = new char[n];
		System.out.println("Enter the array Elements");
		for(int i = 0;i < n; i++)
		{
			data[i] = sc.next().charAt(0);
		}
		System.out.println("Enter the Key");
		char key = sc.next().charAt(0);
		CheckCharPresentInCharArray(data, key);
	}

	public static void CheckCharPresentInCharArray(char data[] , char key){
		for(int i = 0; i < data.length; i++){
			if(data[i] == key){
				System.out.println("The character is present at "+ (i + 1) + " th position");
				return;
			}
		}
		System.out.println("The given Key is Not found in Character Array");
	}
}