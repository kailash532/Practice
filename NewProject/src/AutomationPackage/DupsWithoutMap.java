package AutomationPackage;

public class DupsWithoutMap {
	
	public void duplicates(String str){
		
		int len=str.length();
		char[] c =str.toCharArray();
		for(int i=0;i<len-1;i++){
			char ch=str.charAt(i);
			String st2=Character.toString(ch);
			str=str.replaceAll(st2, "");
			int len2=str.length();
			int count=len-len2;
			System.out.println("Count of characters is"+ ch+"---"+ count);
			len=str.length();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABCABBCCAAABCA";
		DupsWithoutMap dup=new DupsWithoutMap();
		dup.duplicates(str);
		
	}

}
