package AutomationPackage;

public class ReplaceChars {

	
	public static void ReplacingChars(char[] str,int index){
		
		
		if (index == str.length) 
		{ 
			System.out.println(str); 
			return; 
		} 

		if (str[index] == '?') 
		{ 
			
			str[index] = '0'; 
			ReplacingChars(str, index + 1); 
			
			
			str[index] = '1'; 
			ReplacingChars(str, index + 1); 
			
			
			str[index] = '?'; 
		} 
		else
			ReplacingChars(str, index + 1); 
	} 
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String input = "a?b?c?"; 
			char[] str = input.toCharArray(); 
			ReplacingChars(str, 0); 
		}
		
	}
