package AutomationPackage;

import java.util.HashMap;

public class StringWeight {
	
	public void weightOfString(String str ,int vowelsValue){
	
		HashMap<Character, Integer> stringkeyValue=new HashMap<Character, Integer>();
		char ch;
		
		int i=1;
		for (ch = 'A'; ch <= 'Z'; ch++){
			stringkeyValue.put(ch, i++);
		
		}
		char[] c=str.toCharArray();
		int number=0;
		char[] vowelArray={'A','E','I','O','U'};
		for(char cht:c){			
			
			boolean vowel=false;
			if(stringkeyValue.containsKey(Character.toUpperCase(cht))){
				
				for(char VowelChar:vowelArray){
					if(VowelChar==Character.toUpperCase(cht)){						
						
						int	vowelvalue=stringkeyValue.get(Character.toUpperCase(cht))*vowelsValue;
							number=number+vowelvalue;
							vowel=true;
							break;
					}
				}
				if(!vowel){
					number =number+stringkeyValue.get(Character.toUpperCase(cht));
				}				
			}
		}
		System.out.println(number);
	}
	public static void main(String args[])
	{
	
		String sample="Z234 %%%%%% &&&& ((((";
		StringWeight w=new StringWeight();
		w.weightOfString(sample, 1);
		
}
}
