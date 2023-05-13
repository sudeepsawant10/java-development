
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Example1 extends JFrame{
	JTextField tf;
	JPanel p1;
	JButton b1,b2;
	Example1(){
		tf=new JTextField();
		p1 = new JPanel();
		b1 = new JButton("One");
		b2 = new JButton("Two");
		p1.add(b1);
		p1.add(b2);

		add(tf);
		add(p1);
		setLayout(new GridLayout(2,1));
		setSize(300,300);
		setVisible(true);

		b1.addActionListener(
			 new ActionListener(){			//Annonomous ActionListener class
				public void actionPerformed(ActionEvent e){	//Action Listener interface methods
					System.out.println("b1 button clicked");
					tf.setText("b1 button clicked!");
				}
			}
		);

		b2.addMouseListener(
			new MouseListener(){			//Annonomous MouseListener class
					public void mouseClicked(MouseEvent e) { //Action Listener interface methods
						System.out.println("b2 Mouse Clicked"); 
				        tf.setText("Mouse Clicked");  
				    }  
				    public void mouseEntered(MouseEvent e) { 
						System.out.println("b2 Mouse Entered"); 

				        tf.setText("Mouse Entered");  
				    }  
				    public void mouseExited(MouseEvent e) {  
						System.out.println("b2 Mouse Exited"); 
				        tf.setText("Mouse Exited");  
				    }  
				    public void mousePressed(MouseEvent e) {  
						System.out.println("b2 Mouse Pressed"); 
				        tf.setText("Mouse Pressed");  
				    }  
				    public void mouseReleased(MouseEvent e) { 
						System.out.println("b2 Mouse Released"); 
				        tf.setText("Mouse Released");  
				    }  
				}

/*	Using adaptor class
			new MouseAdaptor(){			//Annonomous MouseListener class
					public void mouseClicked(MouseEvent e) { //Action Listener interface methods
						System.out.println("b2 Mouse Clicked"); 
				        tf.setText("Mouse Clicked");  
				    }  
				    public void mouseEntered(MouseEvent e) { 
						System.out.println("b2 Mouse Entered"); 

				        tf.setText("Mouse Entered");  
				    }  
				    public void mouseExited(MouseEvent e) {  
						System.out.println("b2 Mouse Exited"); 
				        tf.setText("Mouse Exited");  
				    }  
				    public void mousePressed(MouseEvent e) {  
						System.out.println("b2 Mouse Pressed"); 
				        tf.setText("Mouse Pressed");  
				    }  
				    public void mouseReleased(MouseEvent e) { 
						System.out.println("b2 Mouse Released"); 
				        tf.setText("Mouse Released");  
				    }  
				}
				*/
		);
	}
	public static void main(String[] args) {
		// Example1 ob = new Example1();
	 	new Example1();
	}
}