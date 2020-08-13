package AutomationPackage;

import java.util.Scanner;

public class Solution {

    public void reverseString(String str){
        int len=str.length();
        String strRev="";
        for(int i=len-1;i>=0;i--){
        	strRev=strRev+str.charAt(i);
        }
        palindromesInString(strRev);
    }

public void palindromesInString(String str){
     String[] substrings=str.split("\\ ");
       int Count=0;
       String revWholeString="";
       for(String strs : substrings){
           if(strs.length()>0){
               String strRev="";
              int len=strs.length();
              for(int i=len-1;i>=0;i--){
                  strRev=strRev+strs.charAt(i);
              } 
              if(strs.equalsIgnoreCase(strRev)){
            	  revWholeString=revWholeString+" "+strRev;
            	 
                 Count=Count+1;
              }else {
            	  StringBuffer stbuf=new StringBuffer(strs);
            	  revWholeString=revWholeString+" "+stbuf.reverse();
              }
           }

       }
       System.out.println(revWholeString.trim());
       System.out.println(Count);

}

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

       Scanner scan=new Scanner(System.in);
      
       String str=scan.nextLine();
      
Solution sol=new Solution();
sol.reverseString(str);


    }
}