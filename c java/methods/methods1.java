import java.util.Scanner;

class Methods1{
	int a, b;				//INstance variable
	public void get(){
		System.out.println("Enter values of a and b : ");
		 Scanner obj = new Scanner(System.in);
		 a = obj.nextInt();
		 b = obj.nextInt();
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
		
		
		Methods1 ob = new Methods1();		//Object of Method class
		ob.get();
		ob.add();
/*		ob.add(a,b);
		ob.subtract(a,b);
		ob.product(a,b);
		ob.divide(a,b);
		ob.mod(a,b);
	*/
	 }
}