class Current{
	public static void main(String args[]){
		System.out.println("Let us find current thread");
		Thread t = Thread.currentThread();	//=> Static method of current classes.
		System.out.println("Current thread is = "+t);
		System.out.println("Its Name = "+t.getName());
	}
}

