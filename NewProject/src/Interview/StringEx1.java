package Interview;

public class StringEx1 {

	public static void main(String[] args) {
		
		String s1="abc";
		String s2=new String("abc");
		String s3="abc";
		String s4=new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.compareTo(s3));
	}

}
