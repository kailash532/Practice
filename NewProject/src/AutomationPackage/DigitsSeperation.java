package AutomationPackage;

import java.util.Arrays;

public class DigitsSeperation {

	public void seperateDisgits(int[] arr){
		int len=arr.length;
		int count=0;
		for (int i=0;i<len;i++){
			
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
				while(count<len)
					arr[count++]=0;
				
				System.out.println(Arrays.toString(arr));
			}
		
		

	
	public static void main(String[] args) {

int[] arr={1,4,0,0,3,0,3,0};
DigitsSeperation ds=new DigitsSeperation();
ds.seperateDisgits(arr);
	}

}
