interface Abc{
	public void add(int a,int b);
	public void show();
}
class xyz implements Abc{
	int sum;
	public void add(int a,int b){
		sum = a + b;
	}
	public void show(){
		System.out.println("Addition = "+sum);
	}
}
class Demo2{
	public static void main(String args[]){
		xyz obj = new xyz();
		obj.add(10,30);
		obj.show();
	}
}