import java.util.*;

class  ReverseStringArray
{
	public static void main(String[] args) 
	{
		String [] data = readString();
		System.out.println("Before Reversing");
		printString(data);
		System.out.println();
		System.out.println("After Reversing");
		reverseArrayOfStringOptimal(data);
	}


	public static String[] readString(){
		System.out.println("Enter the length of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] data = new String[n];
		for(int i =0 ; i < n; i++){
			data[i] = sc.next();
		}
		return data;

	}
	public static void printString(String[] data){
		for(String s : data){
			System.out.print(s + " ");
		}
		System.out.println();
	}
   // linear approach 0(N) time Complexity
	public static void reverseArrayOfString(String[] data){
		// code
		for(int i = data.length - 1; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}


	}
	// optimal approach 0(N/2) time Complexity
	public static void reverseArrayOfStringOptimal(String[] data){
		int i = 0;
		int j = data.length - 1;
		String temp;
		while(i < j) {
			temp = data[i];
			data[i] = data[j];
			data[j] = temp;
			i++;
			j--;
		}
		for(String s : data) {
			System.out.print(s + " ");
		}

	}

}
