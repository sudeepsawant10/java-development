class xyz implements Runnable{
	String str;
	xyz(String str){
		this.str=str;
	}
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(str+" : "+i);
			try{
				Thread.sleep(1000);
				
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class Demo4{
	public static void main(String args[]){
	xyz obj1 = new xyz("This is thread A");
	xyz obj2 = new xyz( "This is thread B");
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();
	try{
		
		t1.join();
	}
	catch(Exception e){
		System.out.println(e);
	}
	t2.start();
	}
}