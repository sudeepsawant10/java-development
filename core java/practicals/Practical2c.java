
class Practical2c{
	public static void main(String[] args) {
		String str = "This is reversed string!";
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);     
		}
	}
}
