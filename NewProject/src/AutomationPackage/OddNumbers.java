package AutomationPackage;

public class OddNumbers {
	
	/*public void oddNumber(int l, int r){
		
		for(int i=1;i<=r;i++){

			 if(i%2!=0 && i>=l){
			     System.out.println(i+"   Odd number");
			 }
		}
	}*/
	
	private double de,ie;
	public OddNumbers(double de,double ie){
		
		this.de=de;
		this.ie=ie;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OddNumbers od=new OddNumbers(10,15);
OddNumbers od1=new OddNumbers(10,15);
//od.oddNumber(3, 9);

/*double var1=1+5;
double var2=var1/4;
System.out.println(var2);*/

if(od==od1){
	System.out.println("Equal");
}else if(od.equals(od1)){
	System.out.println("Object values are equal");
}
else{
	System.out.println("No");
}

	}

}
