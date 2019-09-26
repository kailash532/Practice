package AutomationPackage;

public class Palindrome {
	
	public boolean palin(String str){
		
		
		int len=str.length();
		for(int i=len-1, j=0; i>=j;i--,j++){
			if(str.charAt(i)==str.charAt(j)){
				continue;
			}else{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pal=new Palindrome();
		String str="madam";
		System.out.println(pal.palin(str));
		
	}

}
