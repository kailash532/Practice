package AutomationPackage;

public class Traingle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
