import pack.Addition;
import pack.Subtraction;
import pack.Multiplication;
import pack.Division;

class Practical6a{
	public static void main(String args[]){
		Addition obj1 = new Addition(20.5,10.5);
		Subtraction obj2 = new Subtraction(20.5,10.5);
		Multiplication obj3 = new Multiplication(20.5,10.5);
		Division obj4 = new Division(20.5,10.5);
		obj1.show();
		obj2.show();
		obj3.show();
		obj4.show();

	}
}