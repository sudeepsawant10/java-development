
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calcy3 extends JFrame implements ActionListener{
	JTextField tf1,tf2,result;
	JButton add,sub,mlt,div,cnl;
	JLabel l1,l2,l3;
	Calcy3(){
		l1 = new JLabel("First Number:");
		l2 = new JLabel("Second Number: ");
		l3 = new JLabel("Result:");
		//l1.setBounds(50,50,100,20);
		//l2.setBounds(50,100,100,20);
		//l3.setBounds(50,150,100,20);
		add(l1);
		add(l2);
		add(l3);

		tf1 = new JTextField();
		tf2 = new JTextField();
		result = new JTextField();

		//tf1.setBounds(200,50,170,20);
		//tf2.setBounds(200,100,170,20);
		//result.setBounds(200,150,170,20);
		result.setEditable(false); 

		 add = new JButton("+");
		 sub = new JButton("-");
		 mlt = new JButton("*");
		 div = new JButton("/");
		 cnl = new JButton("cnl");

		//add.setBounds(200,200,80,20);
		//sub.setBounds(300,200, 80,20);
		//mlt.setBounds(200,250, 80,20);
		//div.setBounds(300,250, 80,20);
		//cnl.setBounds(250,300, 80,20);

		add(add);
		add(sub);
		add(mlt);
		add(div);
		add(cnl);
		add(tf1);
		add(tf2);
		add(result);
		//b1.addActionListener(this);  
		add.addActionListener(this);
		sub.addActionListener(this);
		mlt.addActionListener(this);
		div.addActionListener(this);
		cnl.addActionListener(this);
		setSize(500,500);  
        setLayout(null);  
        setVisible(true); 
		}
		public void actionPerformed(ActionEvent e){
			String s1=tf1.getText();  //Taking text from text field in string 
	        String s2=tf2.getText(); 
	        int a=Integer.parseInt(s1);  //converting string to integer
	        int b=Integer.parseInt(s2);  
	        int cal=0;
	        if(e.getSource()==add){  
            	cal=a+b;  
            	result.setText(cal+"");
        	}
        	else if(e.getSource()==sub){
        		cal = a-b;
        		result.setText(cal+"");
        	}
        	else if(e.getSource()==mlt){
        		cal = a*b;
        		result.setText(cal+"");
        	}
        	else if(e.getSource()==div){
        		 float divr=0;
        		divr = a/b;
            	result.setText(divr+"");


        	}

        //	String res=String.valueOf(cal);  
        	
        	if (e.getSource()==cnl) {
        		tf1.setText("");
        		tf2.setText("");
        		result.setText("");
        		
        	}
        //	addWindowListener(new Myclass());

	}
	
	public static void main(String[] args) {
		new Calcy3();

	}
}
/*
// way to close the frame
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
*/