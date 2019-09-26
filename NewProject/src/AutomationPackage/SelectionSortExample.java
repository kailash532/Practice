package AutomationPackage;

public class SelectionSortExample {
	
	public void selectionSort(int[] arr){
		int len=arr.length;
		
		for (int i=0;i<len-1;i++){
			int index=1;
			for(int j=i+1;j<len;j++){
				
				if(arr[j]<arr[index]){
					index=j;
				}
				
			}
			int smallerNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallerNumber;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,20,3,40,6,233,1};
SelectionSortExample ins=new SelectionSortExample();
ins.selectionSort(arr);
	}

}
