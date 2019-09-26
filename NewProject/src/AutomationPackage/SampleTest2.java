package AutomationPackage;

public class SampleTest2 {
	public String str="Sample";
	
	public SampleTest2(String str) {
		this.str=str;
	}
	
	public void display(){
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleTest2 test=new SampleTest2("Hello");
test.display();
SampleTest2 test1=new SampleTest2("Bye");
test1.display();
	}

}
