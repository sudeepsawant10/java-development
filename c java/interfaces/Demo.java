interface Myinterface{
	//By defualt compilor will treat this methods as Abstract methods
	public void method1();
	public void method2();
}
class Demo implements Myinterface{
	Demo(){}
	Demo(Myinterface myinterface){
		myinterface.method1();
		myinterface.method2();
	}

	public void method1(){
		System.out.println("implementation of method1");
	}
	public void method2(){
		System.out.println("Implementation of method2");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.method1();
		obj.method2();
		Demo obj2 = new Demo(new Myinterface(){
			public void method1(){
				System.out.println("method1 invoked ");
			}
			public void method2(){
				System.out.println("method2 invoked ");
			}
		});
	}
}