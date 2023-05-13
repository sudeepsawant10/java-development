class Abc extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println(i+"");
	}
	}
}
class Demo3{
	public static void main(String args[]){
	Abc obj = new Abc();
	Abc obj2 = new Abc();
	Abc obj3 = new Abc();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj2);
	Thread t3 = new Thread(obj3);
	t1.start();
	 try {
          t1.join();
     	 } 
	catch (Exception ie) {
          System.out.println(ie);
        }
	t2.start();
	t3.start();
	//System.in.read();
	//o1.stop=true;
	}
}