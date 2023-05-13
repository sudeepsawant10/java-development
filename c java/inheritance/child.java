//Multi level Inheritance
class Parent2{

	int a=10;
	void m1(){
		System.out.println("Parent2");
		System.out.println("a = " +a);
	}
	
}
class Parent1 extends Parent2{
	int a=20;
	void m1(){
		super.m1();
		System.out.println(super.a);
		System.out.println("Parent1");
		System.out.println("a = " +a);
	}
}

class Child extends Parent1{
	public static void main(String args[]){
		Child ob = new Child();
		System.out.println(ob.a);
		ob.m1();
	}
}



