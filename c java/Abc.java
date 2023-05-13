class Abc{
	int a;
	Abc(int x){
		a=x;
		System.out.println("This is constructor");
		System.out.println("Value of a = "+a);
	}
	public static void main(String[] args) {
		new Abc(10);
	}
}