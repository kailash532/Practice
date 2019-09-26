package AutomationPackage;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Java";
String s3="Java";
String s2=new String("Java");
String s4=new String("Java");
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s2==s4);
System.out.println(s1.equals(s2));
s1=s1+"Updated";
System.out.println(s1);
	}

}
