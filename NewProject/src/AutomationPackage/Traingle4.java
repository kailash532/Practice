package AutomationPackage;

public class Traingle4 {
	 public void traingle4() {
		 System.out.println("-----------------");
		 
		 int n=5;
			for(int i=1;i<=n;i++){
				
				for(int j=1;j<i;j++){
					System.out.print(" ");
				}
					
					for(int k=n;k>=i;k--){
						System.out.print("*");
					}
					System.out.println("");
				}
	 }
	 
	 public void tri3() {
		 System.out.println("-----------------");
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 
			 
			 System.out.println("");
			 
		 }
				 
	 }
	 
	 public void tri5() {
		 System.out.println("-----------------");
		 int n=5;
		 for(int i=0;i<n;i++) {
			 for(int j=n;j>i;j--) {
				 System.out.print("*");
			 }
			 
			 
			 System.out.println("");
			 
		 }
				 
	 }
	 
	 public void tri6() {
		 System.out.println("-----------------");
		 int n=6;
		 for(int i=0;i<n;i++) {
			 for(int j=n-i;j>1;j--) {
				 System.out.print(" ");
			 }
			 for(int j=0;j<=i;j++) {
				 System.out.print("* ");
			 }
			 
			 
			 System.out.println();
			 
		 }
		 for(int i=n;i>=1;i--) {
			 for(int j=0;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(int j=i;j>1;j--) {
				 System.out.print("* ");
			 }
			 
			 
			 System.out.println("");
			 
		 }
				 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traingle4 t4=new Traingle4();
		/*t4.tri3();
		
		t4.traingle4();
		
		t4.tri5();*/
		
		t4.tri6();
		
	}

}
