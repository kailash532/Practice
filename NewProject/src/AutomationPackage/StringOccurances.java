package AutomationPackage;

public class StringOccurances {
	
	
	static void convert(int n, char arr[]
									, int L) 
	{ 
		int len=arr.length;
		
		for (int i = 0; i < L; i++) 
		{ 
			
			System.out.print(arr[n % len]); 
			n /= len; 
		} 
		System.out.println(); 
	} 

	
	static void combinations(char arr[],  int Length) 
	{ 
		int len=arr.length;
		for (int i = 0; 
				i < (int)Math.pow(len, Length); i++) 
		{ 
			
			convert(i, arr,  Length); 
		} 
	} 

	
	public static void main (String[] args) 
	{ 
		char arr[] = { 'a','b','c' }; 
		int len = arr.length; 
		int Length = 3; 
		
		
		combinations(arr,Length); 
	} 

}
