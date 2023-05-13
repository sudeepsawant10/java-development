class JavaExample3{
 public static int var1=10;
  static String var2="Sudeep";
  //This is a Static Method
  static void disp(){
      System.out.println("Var1 is: "+var1);
      System.out.println("Var2 is: "+var2);
  }
  public static void main(String args[]) 
  {
     JavaExample3 obj = new JavaExample3();
     System.out.println(obj.var1);
     System.out.println(JavaExample3.var2);
  }
}