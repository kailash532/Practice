package AutomationPackage;

public class PrimeNum {
	
	public void primeNumb(int num1,int num2){
		
		int num=0,i=1,j=1;
		int count=0;
		
		for(num1=0;num1<num2;num1++){
			 count=0;
					 j=1;
			while(j<=i){
				
				if(i%j==0){
					count++;
					
				}
				j++;
			}
			
			if(count==2){
				System.out.println(i);
				
			}
			i++;
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNum pr=new PrimeNum();
		pr.primeNumb(1,50);

	}

}
