/*1. components  => user interaction classes
2. container => 
3. layout => used for arranging the components
Inheritance
pqr extends sudeep3
*/
Abstract Window Toolkit
import java.awt.*;  
import java.awt.event.*;  

//using inherinting the properties
/*
class First extends Frame{  
	First(){  
		Button b=new Button("click me");  
		b.setBounds(30,100,80,30);// setting button position  x,y,length,breadth
		add(b);//adding button into frame  
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);//now frame will be visible, by default not visible  
	}  
	public static void main(String args[]){ 	 
		First f=new First();  
	}
} */ 

//Using object of the awt classes
class First {
	First(){
		Frame f1 = new Frame();
		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		b1.setBounds(30,100,80,30);
		b2.setBounds(30,200,80,30);
		f1.add(b1);
		f1.add(b2);
		f1.add(l1);
		f1.add(l2);
		f1.setSize(400,600);
		f1.setLayout(null);
		f1.setVisible(true);

	}
	public static void main(String[] args) {
		First f1 = new First();
	}
}