package AutomationPackage;

public class BinSearchOwn {
	
	public int search(int[] arr,int left,int right,int key) {
		
		if(right>=left) {
			int mid=left+(right-left)/2;
			if(key==arr[mid])
				return mid;
			if(key<arr[mid])
				return search(arr, left, mid-1, key);

			return search(arr, mid+1, right, key);
				
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinSearchOwn ob = new BinSearchOwn(); 
	        int arr[] = { 2, 3, 4, 10, 40,43,51,62,76,88,90}; 
	        int n = arr.length; 
	        int x = 88; 
	        int position=ob.search(arr, 0, n, x);
	        System.out.println("position is"+position);
	}

}
