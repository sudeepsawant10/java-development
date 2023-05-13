import java.util.Scanner;
class Methods2{

	public int add(int a, int b){
	//	System.out.println("A + B = " +(a+b));
		return (a+b);
	}
	public int subtract(int a, int b){
	//	System.out.println("A - B = " +(a-b));
		return (a-b);

	}
	public int product(int a, int b){
	//	System.out.println("A * B = " +(a*b));
		return (a*b);

	}
	public float divide(int a, int b){
	//	System.out.println("A / B = " +(a/b));
		return (a/b);

	}
	public int mod(int a, int b){
	//	System.out.println("A % B = " +(a%b));
		return (a%b);
	}
	
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);	//Object of Scanner class
		System.out.println("Enter values of a and b : ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		Methods2 ob = new Methods2();		//Object of Method class
		int add = ob.add(a,b);
		int sub = ob.subtract(a,b);
		int pro = ob.product(a,b);
		float div =ob.divide(a,b); 
		int rem = ob.mod(a,b);

		System.out.println("Addition = " + add);
		System.out.println("Subtraction =  " + sub);
		System.out.println("A * B = " + pro);
		System.out.println("A / B = " + div);
		System.out.println("A % B = " + rem);
	 }
}