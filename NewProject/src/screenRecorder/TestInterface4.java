package screenRecorder;

interface Printable{  
	int i=10;
void print();  
default void print3() {
	System.out.println("sysout printable2");
	
	
}
}  

interface Printable2{  
	static void print2() {
		System.out.println("sysout printable2");
		
	}
}
interface Showable extends Printable,Printable2{  
void show();  
}  
class TestInterface4 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
Printable2.print2();
obj.print3();

 }
  
}  