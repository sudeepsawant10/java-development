
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Counter2 extends JFrame implements ActionListener{
		JTextField f1;
	Counter2(){
		super("Counter");
		 f1 = new JTextField("0");
		JLabel l1 = new JLabel("Counter");
		JButton b1 = new JButton("Count");

		l1.setBounds(50,100,50,20);
		f1.setBounds(50,100,80,30);
		b1.setBounds(50,100,40,30);

		add(l1);
		add(f1);
		add(b1);

		setSize(300,300);  
		//setLayout(new GridLayout(3,1));
        setLayout(new FlowLayout());  
        setVisible(true);
        b1.addActionListener(this);

	}
	int count=0;
	public void actionPerformed(ActionEvent e){
		count++;
		f1.setText(count+"");
	}
	public static void main(String[] args) {
		new Counter2();
	}
}