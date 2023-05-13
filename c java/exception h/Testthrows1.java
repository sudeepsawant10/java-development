import java.io.IOException;  
/*
throw = calls exception class.
throws = use in methods
=tells which exception occurs
m1() throws Exception

we have to handle it while creating object
try{
  ob.m1();
}
catch(Exception e){}

*/
class Testthrows1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  