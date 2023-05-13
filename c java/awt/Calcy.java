
import java.awt.*;
import java.awt.event.*;

public class Calcy extends Frame implements ActionListener{
	TextField tf1,tf2,result;
	Button add,sub,mlt,div,cnl;
	Label l1,l2,l3,l4;
	Calcy(){
		l1 = new Label("First Number:");
		l2 = new Label("Second Number: ");
		l3 = new Label("Result:");
		l4 = new Label();
		l1.setBounds(50,50,100,20);
		l2.setBounds(50,100,100,20);
		l3.setBounds(50,150,100,20);
		l4.setBounds(100,350,200,20);
		add(l1);
		add(l2);
		add(l3);
		add(l4);

		tf1 = new TextField();
		tf2 = new TextField();
		result = new TextField();

		tf1.setBounds(200,50,170,20);
		tf2.setBounds(200,100,170,20);
		result.setBounds(200,150,170,20);
		result.setEditable(false); 

		 add = new Button("+");
		 sub = new Button("-");
		 mlt = new Button("*");
		 div = new Button("/");
		 cnl = new Button("cnl");

		add.setBounds(200,200,80,20);
		sub.setBounds(300,200, 80,20);
		mlt.setBounds(200,250, 80,20);
		div.setBounds(300,250, 80,20);
		cnl.setBounds(250,300, 80,20);

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
			
	        try{
		        String s1=tf1.getText();  //Taking text from text field in string 
		        String s2=tf2.getText(); 
		        if(s1.isEmpty() || s2.isEmpty()){
		        		System.out.println("Please enter the numbers!");
		        		l4.setText("Please enter the numbers!");
		        }
		        else{
					l4.setText("");

			        int a=Integer.parseInt(s1);  //converting string to integer
			        int b=Integer.parseInt(s2);  
			        
			        int cal=0;
			        if(e.getSource()==add){  
		            	cal=a+b;  
		            	result.setText(cal+"");		//result.setText(String.valueOf())
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

		        	if (e.getSource()==cnl) {	//e.getActionCommannd.equals("ADD");
		        		tf1.setText("");
		        		tf2.setText("");
		        		result.setText("");
		        		
		        	}
	        	}
	        }
	        catch (Exception f){
	        	 System.out.println("Warning: The TextFields are empty!!");
	        }

        	
        	// if(e.getActionCommand().equals("+")){
        	// 	cal=a+b;  
         //    	result.setText(cal+"");	
        	// }
        	// else if(e.getActionCommand().equals("-")){

        	// }

        //	String res=String.valueOf(cal);  
        	
        	
        	addWindowListener(new Myclass());

	}
	
	public static void main(String[] args) {
		new Calcy();

	}
}
// way to close the frame
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
