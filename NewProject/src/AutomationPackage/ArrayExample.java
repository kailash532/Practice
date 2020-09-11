package AutomationPackage;

import java.util.ArrayList;
public class ArrayExample {
	
	public int solution(int[] arr) {
		
		 int n = arr.length;  
		 ArrayList<Integer>  listOfInts=new ArrayList<Integer>();
	    //   ArrayList<Integer> listOfInts = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
	       int len=listOfInts.size();
	       int temp=0;
	       int count=0;
	       for(int i=0;i<listOfInts.size();i++) {
	    	if(listOfInts.contains(i+1)) {
	    		temp=temp+1;
	    	}else {
	    		count=i+1;
	    		break;
	    	}
	    	if(temp==listOfInts.size()) {
	    		count=i+2;
	    	}
	    	
	    	if(listOfInts.get(i)<0) {
	    		count=1;
	    	}
	    }
	      
	       
	         
	        
	         
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExample exmp=new ArrayExample();
		int[] arr= {1,4,6,3,2,1};
		System.out.println(exmp.solution(arr));
		
	}

}
