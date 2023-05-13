class MyThread extends Thread{
	public void run(){
		for(int i=1; i<=1000;i++){
			System.out.println(i);
			if(stop) return;
		}
	}
}

class Dd{
	public static void main(String args[]){
		MyThread o1 = new MyThread();
		Thread t1 = new Thread(o1);
		t1.start();
		System.in.read();
		o1.stop=true;
	}
}