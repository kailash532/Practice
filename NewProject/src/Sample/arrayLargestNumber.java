package Sample;

public class arrayLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] test= {10,6,3,12,18,4,5};
int max=test[0];
for(int i=0;i<test.length;i++) {
	if(max<test[i]) {
		max=test[i];
	}
	
	
}
System.out.println(max);
	}

}
