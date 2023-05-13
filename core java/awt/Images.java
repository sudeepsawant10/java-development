
import java.awt.*;
import java.awt.event.*;

class Images extends Frame{
	static Image img;	//object
	Images(){
		img=Toolkit.getDefaultToolkit().getImage("sudeep 2.jpg");
		Media Tracker track = new Media Tracker(this);
		track.addImage(img,0);
		try{
			track.waitForID(0);
		}
		catch(InterruptedException ie){}
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void paint(Graphic g){
		g.drawImage(img,50,50,null);
	}
	public static void main(String[] args) {
		Images i = new Images();
		i.setSize(500,400);
		i.setTitle("My Images");
		i.setIconImage(img);
		i.setVisible(true);
	}
}