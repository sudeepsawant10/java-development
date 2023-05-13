import java.util.Scanner;
class Methods{

	public void add(int a, int b){
		System.out.println("A + B = " +(a+b));
	}
	public void subtract(int a, int b){
		System.out.println("A - B = " +(a-b));
	}
	public void product(int a, int b){
		System.out.println("A * B = " +(a*b));
	}
	public void divide(int a, int b){
		System.out.println("A / B = " +(a/b));
	}
	public void mod(int a, int b){
		System.out.println("A % B = " +(a%b));
	}
	
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);	//Object of Scanner class
		System.out.println("Enter values of a and b : ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		Methods ob = new Methods();		//Object of Method class
		ob.add(a,b);
		ob.subtract(a,b);
		ob.product(a,b);
		ob.divide(a,b);
		ob.mod(a,b);
	 }
}