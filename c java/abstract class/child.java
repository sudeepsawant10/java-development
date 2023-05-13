abstract class Customer{
	abstract void CustomerData();
}

abstract class Bank extends Customer{
	abstract void rate();
	void detail(){					//normal method
		System.out.println("Bank detail");
	}
	
}

class child extends Bank{
	void rate(){
		System.out.println("Rate");
	}
	void CustomerData(){
		System.out.println("CustomerData");
	}
	public static void main(String args[]){
		Bank obj1 = new child();
		obj1.detail();
		obj1.rate();
		obj1.CustomerData();
	}
}