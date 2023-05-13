class Abc{
	String s;
	Abc(String s){
	this.s = s;
}
	void show(){
	System.out.println(s);
}
}
class Demo{
	public static void main(String args[]){
	Abc obj = new Abc("Hello World");
	obj.show();
}	
}