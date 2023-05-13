import java.awt.*;
import java.awt.event.*;

class Draw2 extends Frame{
	Draw2(){
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		this.setBackground(new Color(100,20,20));
		Font f = new Font("Arial",Font.BOLD+Font.ITALIC,30);
		g.setFont(f);
		g.setColor(Color.green);
		g.drawString("Hello, How are you?",100,100);
		
	}
	public static void main(String[] args) {
		Draw2 d = new Draw2();
		d.setSize(500,500);
		d.setTitle("This is Text");
		d.setVisible(true);
	}
}