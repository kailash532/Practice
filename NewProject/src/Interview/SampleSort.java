package Interview;

import java.util.ArrayList;

public class SampleSort {
	
	public void sort(int[] arr) {
		
		int len=arr.length;
		int temp=0;
		
		for(int i=0;i<len;i++) {
			for(int j=1;j<(len-i);j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[i];
					arr[i]=temp;
					
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,4,6,9,5,2};
	

	}

}
