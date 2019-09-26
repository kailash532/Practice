package AutomationPackage;

public class StringReverse {

	public StringBuffer ReverseTheString(String SampleString){
		StringBuffer resultString=new StringBuffer();
		int length=SampleString.length();
		
		for(int i=length-1;i>=0;i--){
			resultString.append(SampleString.charAt(i));
		}
		
		return resultString;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String StringToReverse="CLEARED";
StringReverse _stringReverse=new StringReverse();
System.out.println("Reversed String is "+_stringReverse.ReverseTheString(StringToReverse));
	}

}
