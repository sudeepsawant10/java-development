//Single level Inheritance
class Abc{

	int a=10;
	void m1(){
		System.out.println("a = " +a);
	}
	
}
public class Abc2 extends Abc{

	public static void main(String args[]){
		Abc2 ob = new Abc2();
		System.out.println(ob.a);
		ob.m1();
		ob.a =100;
		ob.m1();
	}
}

