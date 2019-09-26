package AutomationPackage;


class Vehicle{
	 Vehicle(){
		System.out.println("Vehicle is Running");
	}
}

class Bike extends Vehicle{
	 Bike(){
		
		System.out.println("Bike is Running ");
	}
}
public class OverRideExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike v=new Bike();

	}

}
