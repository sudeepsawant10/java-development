import java.awt.*;
import java.awt.event.*;

class Mybutton extends Frame implements ActionListener{
	Button b1,b2,b3;
	Mybutton(){
		this.setLayout(null);
		b1.new Button(Yellow);
		b2.new Button(Blue);
		b3.new Button(Pink);

		b1.setBounds(100,10,70,40);
		b2.setBounds(100,160,70,40);
		b3.setBounds(100,220,70,40);

		this.add(b1);
		this.add(b2);
		this.add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		addWindowLisner(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		public void actionPerformed(ActionEvent ae){
			String str = ae.getActionCommand();
			if(str.equals("Yellow"))this.setBackground(Color.yellow);
			if(str.equals("Blue"))this.setBackground(Color.blue);
			if(str.equals("Pink"))this.setBackground(Color.Pink);
		}

	}

	public static void main(String[] args) {
		Mybutton mb = new Mybutton();
		mb.setSize(400,400);
		mb.setTitle("Click on Buttons");
		mb.setVisible(true);
	}
}