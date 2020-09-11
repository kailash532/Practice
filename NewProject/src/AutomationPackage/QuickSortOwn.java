package AutomationPackage;

public class QuickSortOwn {
	
	
	
	public static int partition(int arr[],int low,int high) {
		
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				 arr[i]=arr[j];
				arr[j]=temp;
			}
			
			int temp=arr[i+1];
			arr[i+1]=arr[high];
			arr[high]=temp;
			
		}
		
		
		
		return i+1;
		
	}
	
	
	public static void sort(int[] arr,int low,int high) {
		
		if(low<high)
		{
			int pos=partition(arr, low, high);
			sort(arr,low,pos-1);
			sort(arr,pos+1,high);
		}
	}
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
public static void main(String[] args) {
	int arr[] = {10, 7, 8, 9, 1, 5}; 
	int n = arr.length; 

	QuickSortOwn ob = new QuickSortOwn(); 
	printArray(arr);
	ob.sort(arr, 0, n-1);
	System.out.println("After Sort");
	printArray(arr);
}
}
