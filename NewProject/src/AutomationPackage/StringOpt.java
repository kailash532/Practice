package AutomationPackage;

public class StringOpt {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String inputString="I came for an Interview";
char[] vowels={'A','E','I','O','U'};
 int lenth=inputString.length();
for(int i=0;i<lenth;i++){
	for(int j=0;j<vowels.length;j++){
		if(inputString.charAt(i)==vowels[j]){
			String st=Character.toString(inputString.charAt(i));
			inputString=inputString.replaceAll(st,"");
			lenth=inputString.length();
		}
	}
	
}
System.out.println(inputString);
	}

}
