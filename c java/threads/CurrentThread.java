
class CurrentThread{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread is = "+t);
		//setting thread name
		t.setName("My thread");
		System.out.println("After changing Name is = "+t);
	}
}