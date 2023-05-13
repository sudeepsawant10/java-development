class MyParentClass {
  /* MyParentClass(){
	System.out.println("MyParentClass Constructor");
   }*/
    MyParentClass(int i){
    System.out.println("i = "+i);
	System.out.println("MyParentClass Constructor");
   }
}
class MyChildClass extends MyParentClass{
	
   MyChildClass() {
   	//super()=>Automatically gets called for default constructoer
   	super(10);
	System.out.println("MyChildClass Constructor");
   }
   public static void main(String args[]) {
	new MyChildClass();
   }
}
