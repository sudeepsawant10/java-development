class MyThread implements Runnable{
	public void run(){
		task1();
		task2();
		task3();
	}
	void task1(){
		System.out.println("This is task1");
	}
	void task2(){
		System.out.println("This is task2");
	}
	void task3(){
		System.out.println("This is task3");
	}
}

class Single{
	public static void main(String args[]){
		MyThread ob1 = new MyThread();
		Thread t1 = new Thread(ob1);
		t1.start();	//=> It will call to run()
	}
}