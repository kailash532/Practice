package Sample;

public class SampleTest {
	
	public void StringCountInFile(String str) {
		
		int count=0;
		String[] st2=str.split("\\ ");
		for(int i=0;i<st2.length;i++) {
			if(st2[i].equals("kailash")) {
				count=count+1;
			}
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is kailash My name is kailash";
		SampleTest st=new SampleTest();
		st.StringCountInFile(str);

	}

}
