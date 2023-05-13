
class Vehicle{  
 
  void run(){
 	 System.out.println("Vehicle is running");
  }  
}  
//Creating a child class  
class Practical5b extends Vehicle{  
  
  void run(){
  	System.out.println("Bike is running safely");
  }  
  
  public static void main(String args[]){  
  Practical5b obj = new Practical5b();//creating object  
  obj.run();//calling method  
  }  
}  