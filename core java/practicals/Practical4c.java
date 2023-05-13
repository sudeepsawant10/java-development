
abstract class animal1{
	abstract public void sound1();
}
//abstract class animal2 extends animal1 for not overrideing
abstract class animal2 extends animal1{
	abstract public void sound2();
}
class Practical4c extends animal2{
	public void sound1(){
		System.out.println("woof1");
	}
	public void sound2(){
		System.out.println("woof2");
	}

	public static void main(String args[]){
		Practical4c obj = new Practical4c();
		animal2 obj2 = new Practical4c();
		obj.sound1();
		obj2.sound2();
	
	}
}