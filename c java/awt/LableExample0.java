
import java.awt.*;  
class LabelExample0 implements ActionListener{  
public static void main(String args[]){  
    Frame f= new Frame("Label Example");  
    Label l1,l2;  
    l1=new Label("First Label.");  
    l1.setBounds(50,100, 100,30);  
    l2=new Label("Second Label.");  
    l2.setBounds(50,150, 100,30);  
    Label l3;
    l3 = new Label("Third Lable");
    l3.setBounds(50,200,100,40);

    Button b1 = new Button();
    f.add(l1); f.add(l2); f.add(l3); f.add(b1);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
}  