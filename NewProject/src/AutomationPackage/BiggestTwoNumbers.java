package AutomationPackage;

public class BiggestTwoNumbers {

    public void largestTwoNumberinAnArray(int[] arr){
int n=arr.length;
int temp=0;
for(int i=0;i<n;i++){
    for(int j=1;j<(n-i);j++){
        if(arr[j-1]>arr[j]){
            temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
        }
    }
    
}

                        System.out.print(arr[n-1] + " and "+arr[n-2] );  
              
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
       
        int arr[]= {12,3,9,1,23,43,32,55,78,79,11,2};
    
    BiggestTwoNumbers sol=new BiggestTwoNumbers();
    sol.largestTwoNumberinAnArray(arr);
    }
} 