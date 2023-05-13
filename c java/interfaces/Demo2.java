interface Abc1{
	//By defualt compilor will treat this methods as Abstract methods
	public void display1();
}
interface Abc2 extends Abc1{
	public void display2();
}
interface Abc3 extends Abc2{
	public void display3();
}
class Demo2 implements Abc3{
	public void display1(){
		System.out.println("Implimentation of display1");
	}
	public void display2(){
		System.out.println("Implimentation of display2");
	}
	public void display3(){
		System.out.println("Implimentation of display3");
	}
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}

