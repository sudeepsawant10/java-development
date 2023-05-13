
class Abc{
	//data store in variables
	int a=100;	//1000
	String s ="Ram";//Sam
	float f = 34.5f;//444.44
	public static void main(String[] args) {
		Abc ob = new Abc();

		System.out.println("a = "+ob.a);
		System.out.println("s = "+ob.s);
		System.out.println("f = "+ob.f);

		ob.a=1000;
		ob.s="Sam";
		ob.f=444.4f;

		System.out.println("a = "+ob.a);
		System.out.println("s = "+ob.s);
		System.out.println("f = "+ob.f);

		System.out.println("");
		ob.a=(1000-100);
		System.out.println("a = "+ob.a);
		
	}
}