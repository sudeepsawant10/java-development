//Multitaskin thread

class MyThread implements Runnable{
	String str;
	MyThread(String str){
		this.str=str;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(str + " : "+i);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}

class Multi{
	public static void main(String[] args) {
		MyThread o1 = new MyThread("Cut the ticket");
		MyThread o2 = new MyThread("Show the ticket");
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);
		t1.start();
		t2.start();
	}
}