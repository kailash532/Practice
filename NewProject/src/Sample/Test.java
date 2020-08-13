package Sample;
public class Test{
     public static void main(String []args){
        System.out.println("Hello World");
        Test h=new Test();
        h.test();
     }
     public void test()
     {
         myname().getname().sample();
     }
      public check myname()
      {
         return new check();
      }
}
class check{
     public check getname()
      {
    	 return new check();
      }
     
     public void sample() {
    	 
     }
}