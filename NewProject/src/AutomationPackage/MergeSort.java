package AutomationPackage;

public class MergeSort {
	
	public void merge(int[] arr,int left,int mid,int right) {
		
		int n1=mid-left+1;
		int n2=right-mid;
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		
		for(int i=0;i<n1;++i) {
			leftarr[i]=arr[left+i];
		}
		for(int j=0;j<n2;++j) {
			rightarr[j]=arr[mid+1+j];
		}
		
		int i=0,j=0,k=left;
		while(i<n1 && j<n2) {
			if(leftarr[i]<=rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
				
			}else {
				arr[k]=rightarr[j];
				j++;
			}
			k++;
		}
		
		while (i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while (j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
		}
		
	}
	
	public void sort(int[] arr,int left,int right) {
		
		if(left<right) {
			int mid=(left+right)/2;
			sort(arr, left, mid);
			sort(arr,mid+1,right);
			merge(arr,left, mid, right);
		}
		
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);
		int length=arr.length;
		MergeSort obj=new MergeSort();
		obj.sort(arr,0,length-1);
		printArray(arr);
	}

}
