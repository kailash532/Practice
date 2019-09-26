package Sample;

public class Example {
	
	public static int number =1;
	
	public Example() {
		this(number);
		System.out.println(number);
	
	}
	
public Example(int num) {
		
		this(num,number);
		number=num;
		System.out.println("single parameter"+number);
	}
public Example(int num1,int num2){
	System.out.println(num1+"----"+num2);
}

public static void main(String[] args) {
	
	
	Example ex=new Example();
	
}
}


