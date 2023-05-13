class A extends Thread
{ 
	public A( String s)
	{ 
		super(s);	
		//It calls Thread class Constructor:
		// Thread(String s){ 
		// 	setName(s);
		// }
	}

	public void run() 
	{
		for(int i=1;i<=15; i++) 
		{
			System.out.println( getName() );
		}
	}
}

class Thread01
{ 
	public static void main( String args[])
	{ 
		A a1 = new A("BIIT");
		A b1 = new A("SITH");

		A a2 = new A("Computer");
		A a3 = new A("Education");
		//method to execute thread=>start()
		a1.start();	//It calls run method internally.
		b1.start();
		a2.start();
		a3.start();

	System.out.println(" Hello !!! ");
	}
}