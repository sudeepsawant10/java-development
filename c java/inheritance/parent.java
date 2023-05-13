//herarghi level Inheritance
import java.util.Scanner;

class Parent{

	int a,b;
	void getdata(){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value of a and b: ");
		a = obj.nextInt();
		b = obj.nextInt();
	}

	void calculate(){
		System.out.println("Addition: " + (a+b));
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Division : " + (a/b));
		System.out.println("Multiplicatin: " + (a*b));
		System.out.println("Modulo : " + (a%b));

	}
	
}
class Child1 extends Parent{
	
}

class Child2 extends Parent{
	
}

class call{
	public static void main(String args[]){
		Child1 ob = new Child1();
		ob.getdata();
		ob.calculate();
		Child2 ob2 = new Child2();
		ob2.getdata();
		ob2.calculate();
	}
}



