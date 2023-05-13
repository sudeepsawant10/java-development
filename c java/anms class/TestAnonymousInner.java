
// *Annonomous class in java:
// 1. No name
// 2. Creaing object[class,Interface]
// 3.methods()
// =>only relate to one object which created

//  class Person{  
//    void eat1();  
//    void eat2();  
//    void eat3();  
// }  


interface Person{  
   public void eat1();  
   public void eat2();  
   public void eat3();  
}  
class TestAnonymousInner{  
 public static void main(String args[]){  
  Person p1=new Person(){  
  public void eat1(){System.out.println("nice fruits");}  
  public void eat2(){System.out.println("eat2 method");}
  public void eat3(){System.out.println("Eat 3 method"); }
  };  

  p1.eat1();

  Person p2=new Person(){  
  public void eat1(){System.out.println("p2 object:nice fruits");}  
  public void eat2(){System.out.println("p2 object: eat2 method");}
  public void eat3(){ System.out.println("p2 object:Eat 3 method"); }
  };    
  p2.eat2();


  
}
}  