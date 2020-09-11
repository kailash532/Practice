package screenRecorder;

public class HelloWorld{
    public static void main(String []args){
        
        String a="madam",rev="";
       char x ;
        int i;
        
        for( i=a.length()-1;i>0;i--){
            x=a.charAt(i);
            rev=rev+x;
             
        }
        System.out.println(rev);
        
        if(a.equals(rev)){
        System.out.println("Is a palindrome");
        }
        else{
        System.out.println("Not a palindrome");
       
    }
    }
}