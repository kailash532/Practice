package Interview;

public class stringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits= {"apples","oranges"}; 
		int len=fruits.length;
		String str="";
		for(int i=0;i<len;i++) {
			str=str+fruits[i];
		}
		System.out.println(str);
	}

}
