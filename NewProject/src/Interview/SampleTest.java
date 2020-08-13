package Interview;

public class SampleTest {
	
	public void getMaximumnumber(int[] arr) {
		
		int len=arr.length;
		int temp=0;
		for(int i=0;i<len;i++) {
			for(int j=1;j<(len-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[len-1]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] intarray= {10,5,7,13,8,12,6};
		
		SampleTest sm=new SampleTest();
		sm.getMaximumnumber(intarray);
		
	}

}
