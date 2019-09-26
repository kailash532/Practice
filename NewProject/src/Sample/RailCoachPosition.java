package Sample;

import java.util.HashMap;

public class RailCoachPosition {
	
	public void getBerthposition(int number){
		HashMap<Integer, String> postion=new HashMap<Integer, String>();
		postion.put(1, "L");
		postion.put(2, "M");
		postion.put(3, "U");
		postion.put(4, "L");
		postion.put(5, "M");
		postion.put(6, "U");
		postion.put(7, "SL");
		postion.put(8, "SU");
		
		
		if(number>8 && number%8>=0 && number<=72){
			
			int num=number%8;
			
		if(num==0){
			num=8;
		}
			
			System.out.println(postion.get(num));
		}else if(number >0 && number <=8){
			System.out.println(postion.get(number));
		}else{
			System.out.println("Invalid berth number: Enter berth number between 1 to 72");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RailCoachPosition rc=new RailCoachPosition();
		rc.getBerthposition(18);
		
		
	}

}
