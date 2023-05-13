import java.awt.*;
import java.awt.event.*;  


class AbcListener extends Frame implements ActionListener{
	TextField tf=new TextField();  
	int i =1 ;

    int n=5,sum=0;
	public void actionPerformed(ActionEvent e){  
                sum=n*i;
                String s=String.valueOf(sum);
                tf.setText(s);
                i++;
     //System.out.println("User is Clicked");
    }  

	
	AbcListener(){
	
	tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30); 
	
	add(b);
	add(tf);

	b.addActionListener(this);//  
    
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);

	}
/*

	 public void mouseClicked(MouseEvent e) {  
        tf.setText("Mouse Clicked");  
        System.out.println("Mouse Clicked");
        //tf.setText(i+" Welcome to Javatpoint.");
    }  
    public void mouseEntered(MouseEvent e) {  
        tf.setText("Mouse Entered");  
        System.out.println("Mouse Entered");
    }  
    public void mouseExited(MouseEvent e) {  
        tf.setText("Mouse Exited");  
        System.out.println("Mouse Exited");
    }  
    public void mousePressed(MouseEvent e) {  
        tf.setText("Mouse Pressed");  
        System.out.println("Mouse Pressed");
    }  
    public void mouseReleased(MouseEvent e) {  
        tf.setText("Mouse Released");  
        System.out.println("Mouse Released");
    }  
*/
public static void main(String[] args) {  
    
new AbcListener();
     
}  

}