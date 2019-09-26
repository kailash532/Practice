package AutomationPackage;

public class LCMOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1=72, number2=120,lcm;
		lcm=(number1>number2)?number1:number2;
		
		while(true){
			if(lcm%number1==0 && lcm%number2==0){
				System.out.println("lcm is"+ lcm);
				break;
			}
			++lcm;
		}
		
	}

}
