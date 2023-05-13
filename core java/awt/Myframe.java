import java.awt.*;
import java.awt.event.*;

class Myframe{
	public static void main(String[] args) {
		Frame f = new Frame("MS-office 2021");
		f.setSize(500,300);
		f.setVisible(true);
		//To close the frame
		f.addWindowListener(new Myclass());
	}
}
//One Way to close the frame
/*
class Myclass implements WindowListener{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeconified(WindowEvent e){}
	public void windowConified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
*/

//Another way to close the frame

class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
