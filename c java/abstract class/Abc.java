abstract class animal1{
	abstract public void sound1();
}
//abstract class animal2 extends animal1 for not overrideing
abstract class animal2 extends animal1{
	abstract public void sound2();
}
class Abc extends animal2{
	public void sound1(){
		System.out.println("woof1");
	}
	public void sound2(){
		System.out.println("woof2");
	}

	public static void main(String args[]){
		Abc obj = new Abc();
		animal2 obj2 = new Abc();
		obj.sound1();
		obj2.sound2();
	
	}
}