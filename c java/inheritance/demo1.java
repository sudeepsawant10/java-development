class abc{
	int sum;
	public void add(int a,int b){
		sum = a+b;
	}
	public void show(){
		System.out.println("abc Addition="+sum);
	}
}
class demo1 extends abc{
	public void show(){
		System.out.println("Addition = "+sum);
	}

	public static void main(String[] args) {
		demo1 ob = new demo1();
		ob.add(10,20);
		ob.show();
	}
}