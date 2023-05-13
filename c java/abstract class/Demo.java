abstract class AbstractDemo{
   public void myMethod(){
      System.out.println("Hello");
   }
   abstract public void anotherMethod();
}
public class Demo extends AbstractDemo{

   public void anotherMethod() {                //Abstract Method
        System.out.println("Abstract method"); 
   }
   public static void main(String args[])
   { 
      //error: You can't create object of it
      AbstractDemo obj = new Demo();
      obj.anotherMethod();
      obj.myMethod();
   }
}