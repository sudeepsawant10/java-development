class Practical4b
{
	Practical4b()
	{
		System.out.println("Constructor method........");
	}
	protected void finalize()
	{
		System.out.print("Garbage Collected.....");
	}
}
class prac4B
{
		public static void main(String args[])
		{
			Practical4b ob=new Practical4b();
			ob=null;
			System.gc();
		}
}