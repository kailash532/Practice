package Sample;

public class CharactersSample {
	
	public void findCharacterInSentense(String str) {
		char ch,ch1;
		for (ch = 'A' ,ch1='a'; ch <= 'Z' && ch1<='z'; ch++){
			String st=String.valueOf(ch);
			String st1=String.valueOf(ch1);
			if(str.contains(st)==true && str.contains(st1)==true) {
				
			}else {
				System.out.print(ch);
			}
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st="ABCDEFGHIJKLMNanbcyakdad;asfjfpoe";
		CharactersSample cs=new CharactersSample();
		cs.findCharacterInSentense(st);
	}

}
