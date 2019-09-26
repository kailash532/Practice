package AutomationPackage;

import java.util.Arrays;

public class SubsctractNumberArray {
	
	public void SubstarctNumber(int[] arr){
		
		int len=arr.length;
		String st="";
		for(int i=0;i<len;i++){
			st=st+Integer.toString(arr[i]);
		}
		
	int num=Integer.parseInt(st);
	num=num-1;
	String st2=Integer.toString(num);
	
	
	int[] numarr=new int[st.length()];
	for(int j=0;j<st2.length();j++){
		numarr[j]=Integer.parseInt(st2.substring(j, j+1));
	}
	System.out.println(Arrays.toString(numarr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={0,1,1};
		
		SubsctractNumberArray num=new SubsctractNumberArray();
		num.SubstarctNumber(arr);
		
	}

}
