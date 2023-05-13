import java.util.Scanner;
//Return type without prarameter
class Methods3{
	 static int a, b;				//INstance variable
	public static Methods3 get(){
		System.out.println("Enter values of a and b : ");
		 Scanner obj = new Scanner(System.in);
		 a = obj.nextInt();
		 b = obj.nextInt();
		 Methods3 ob = new Methods3();
		 return ob;
 		}
	public void add(){
		System.out.println("A + B = " +(a+b));
	}
	public void subtract(){
		System.out.println("A - B = " +(a-b));
	}
	public void product(){
		System.out.println("A * B = " +(a*b));
	}
	public void divide(){
		System.out.println("A / B = " +(a/b));
	}
	public void mod(){
		System.out.println("A % B = " +(a%b));
	}
	
	
	public static void main(String[] args){
		
		Methods3 ob;
		ob = Methods3.get();
	//	ob.get();
		ob.add();
		ob.subtract();
		ob.product();
		ob.divide();
		ob.mod();
	
	 }
}