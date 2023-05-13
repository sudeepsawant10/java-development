class A extends Thread
{ 
	public void run(){
		for(int i=1;i<=15;i++){
			System.out.println("BIT");
		}
	}
}
class B extends Thread
{ 
	public void run(){
		for(int i=1;i<=15;i++){
			System.out.println("Computer");
		}
	}
}
class C extends Thread
{ 
	public void run(){
		for(int i=1;i<=15;i++){
			System.out.println("Education");
		}
	}
}
class Thread04
{ 
	public static void main( String args[])
	{ 
		System.out.println("Hello!!");
		A a =new A();
		B b =new B();
		C c =new C();

		a.start();
		b.start();
		c.start();
		System.out.println("Bye-Bye!!");
	}
}