
import java.awt.*;
import java.awt.event.*;

class Counter extends Frame implements ActionListener{
		TextField f1;
	Counter(){
		 f1 = new TextField("0");
		Label l1 = new Label("Counter");
		Button b1 = new Button("Count");

		l1.setBounds(50,100,50,20);
		f1.setBounds(100,100,50,20);
		b1.setBounds(160,100,40,30);

		add(l1);
		add(f1);
		add(b1);

		setSize(500,500);  
		setLayout(null);
      //  setLayout(new FlowLayout());  
        setVisible(true);
       // ActionListener ob1 = new Counter();
        b1.addActionListener(this);			//calling interface

	}
	int count=0;
	public void actionPerformed(ActionEvent e){		//Interface method overrided
		count++;
		f1.setText(count+"");
	}
	public static void main(String[] args) {
		new Counter();
	}
}