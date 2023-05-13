interface Myinter{
	void connect();
	void disconnect();
}
class OracleDB implements Myinter{
	public void connect(){
		System.out.println("connecting to oracle Database...");
	}
	public void disconnect(){
		System.out.println("Disconnecting from oracle Database!");
	}
}
class SybaseDB implements Myinter {
	public void connect(){
		System.out.println("connecting to SybaseDB Database...");
	}
	public void disconnect(){
		System.out.println("Disconnecting from SybaseDB Database!");
	}
}
class InterfaceDemo{
	public static void main(String[] args) throws Exception{
		Class c = Class.forName(args[0]);
		//c contains Sybasedb or oracle Database. It takes the name of class in cmd;
		Myinter mi = (Myinter)c.newInstance();
		mi.connect();
		mi.disconnect();
	}
}