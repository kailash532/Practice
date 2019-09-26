package AutomationPackage;

import java.util.ArrayList;

public class ReplacingSpecialChar {
	
	public void ReplaceSpecialCharInString(String str){
		
		int len=str.length();
		ArrayList<String> strList=new ArrayList<String>();
		
		String st2=str.replaceAll("\\?", "");
		int len2=st2.length();
		int numberOfSpecialChars=len-len2;
		String str2="";
		String str1="";
		str1=str.replaceAll("\\?", "0");
		
		strList.add(str1);
		str2=str1;	
		for(int i=1;i<=numberOfSpecialChars+1;i++){		
				
		int position=str2.indexOf('0');
		String temp="";
		if(position>=len){
			temp=str1.substring(0,position)+"1"+str1.substring(position,len);
			if(!strList.contains(temp)){
				strList.add(temp);
			}
			
		}else if(position>0 && position<len){
			temp=str1.substring(0,position)+"1"+str1.substring(position+1,len);
			if(!strList.contains(temp)){
				strList.add(temp);
			}
		}	
			
		str2=str2.replaceFirst("0", "1");
			
		}
		
		str1=str.replaceAll("\\?", "1");
		if(!strList.contains(str1)){
			strList.add(str1);
		}
		
		str2=str1;	
		
		for(int i=1;i<=numberOfSpecialChars+1;i++){		
			
			int position=str2.indexOf('1');
			String temp="";
			if(position>=len){
				temp=str1.substring(0,position)+"0"+str1.substring(position,len);
				if(!strList.contains(temp)){
					strList.add(temp);
				}
				
			}else if(position>0 && position<len){
				temp=str1.substring(0,position)+"0"+str1.substring(position+1,len);
				if(!strList.contains(temp)){
					strList.add(temp);
				}
			}	
				/*if(strList.contains(str1)){
					continue;
				}else{
					strList.add(str1);
				}*/
			str2=str2.replaceFirst("1", "0");
				
			}
		
		System.out.println(strList);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="a?b?c?";		

		
		ReplacingSpecialChar rsc=new ReplacingSpecialChar();
		
		rsc.ReplaceSpecialCharInString(str);

	}

}
