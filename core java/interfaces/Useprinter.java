import java.io.*;

interface printer{
	void printit(String text);
	void disconnect();
}

class IBMprinter implements printer{
	public void printit(String text){
		System.out.println(text);
	}
	public void disconnect(){
		System.out.println("Printing completed...");
		System.out.println("Disconnecting IBMprinter...");
	}
}
class EPSONprinter implements printer{
	public void printit(String text){
		System.out.println(text);
	}
	public void disconnect(){
		System.out.println("Printing completed...");
		System.out.println("Disconnecting EPSONprinter...");
	}
}
class Useprinter {
	public static void main(String args[]) throws Exception{
		FileReader fr = new FileReader("a.text");
		//Helps to take contain from text file
		LineNumberReader inr = new LineNumberReader(fr);
		String printername = inr.readLine();
		System.out.println("Loading the driver for " + printername);

		Class c = Class.forName(printername);
		printer ref = (printer)c.newInstance();
		ref.printit("HELLO!");
		ref.disconnect();
	}
}