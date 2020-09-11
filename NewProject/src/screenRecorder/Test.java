package screenRecorder;

public class Test {
	
	static boolean exists(int[] ints,int k) {
		
		
		int len=ints.length;
		if(len!=0) {
		for(int i=0,j=len-1;i<len && j>0 && i<j; i++,j--) {
			if(k==ints[i] || k==ints[j]) {
				return  true;
			}else {
				continue;
			}
		}
		return false;
		}else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int[] ints= {-9,10,37,102,100,33,34,56,36};
System.out.println(Test.exists(ints, 102));
System.out.println(Test.exists(ints, 36));
	}

}
