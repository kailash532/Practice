package AutomationPackage;

class GFG { 
	
	/* function to multiply two numbers x and y*/
	static int multiply(int x, int y) { 
		
		/* 0 multiplied with anything gives 0 */
		if (y == 0) 
			return 0; 
	
		/* Add x one by one */
		if (y > 0) 
			return (x + multiply(x, y - 1)); 
	
		/* the case where y is negative */
		if (y < 0) 
			return -multiply(x, -y); 
			
		return -1; 
	} 
	
	 static int multiply1(int n, int m) 
	    {  
	        int ans = 0, count = 0; 
	        while (m > 0) 
	        { 
	            // check for set bit and left  
	            // shift n, count times 
	            if (m % 2 == 1)              
	                ans += n << count; 
	      
	            // increment of place  
	            // value (count) 
	            count++; 
	            m /= 2; 
	        } 
	          
	        return ans; 
	    } 
	
	
	
	// Driver code 
	public static void main(String[] args) { 
		
		System.out.print("\n" + multiply(5, -11)); 
		System.out.println("\n"+multiply1(5, 6));
	} 
	
	

} 

// This code is contributed by Anant Agarwal. 
