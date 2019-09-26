package AutomationPackage;

import java.util.TreeSet;

public class SubStrInBinString {
	
	
	public void substrsInBinStr(String binstr){
		
		int len=binstr.length();
		int count=0;
		TreeSet<String> mainstr=new TreeSet<String>();
		for(int i=count;i<len;i++){
			
			for(int j=count+1;j<len;j++){
				String str=binstr.substring(count, j);
				
				if(verifyNumberOfZerosAndOnes(str)==true){
					mainstr.add(str);
				}
			}
			count++;
		}
		
		System.out.println(mainstr);
		
	}
	
	public boolean verifyNumberOfZerosAndOnes(String str1){
		
		String str2=str1;
		int length=str1.length();
		
		str1=str1.replace("0", "");
		int Zerolength=length-str1.length();
		str2=str2.replace("1", "");
		int Oneslength=length-str2.length();
		if(Oneslength==Zerolength){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="10110010110100011";
		SubStrInBinString st=new SubStrInBinString();
		st.substrsInBinStr(str);
	}

}
