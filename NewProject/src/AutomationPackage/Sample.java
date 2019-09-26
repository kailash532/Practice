package AutomationPackage;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer I1=new Integer(10);
		Integer I4=new Integer("10");
		Integer I2=new Integer("20");
		Integer I3=new Integer(30);
		String str="hello";
		String str1="hello";
		
		String str2=new String("hello");
		String str3=new String("hello");
		System.out.println(I1.compareTo(I2));
		System.out.println(I1.equals(I4));
		System.out.println(I1==I4);
		
		System.out.println(str.equals(str2));
		System.out.println(str==str2);
		
		System.out.println(str3.equals(str2));
		System.out.println(str3==str2);
	}

}
