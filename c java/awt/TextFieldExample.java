
import java.awt.*;  
import java.awt.event.*;  
public class TextFieldExample extends Frame implements ActionListener{  
    TextField tf1,tf2,tf3;  
    Button b1,b2,mlt,div,cnl;  
    TextFieldExample(){  
        tf1=new TextField();  
        tf1.setBounds(50,50,150,20);
        tf2=new TextField();  
        tf2.setBounds(50,100,150,20);  
        tf3=new TextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        b1=new Button("+");  
        b1.setBounds(50,200,50,50);  
        b2=new Button("-");  
        b2.setBounds(120,200,50,50);  
         mlt = new Button("*");
         div = new Button("/");
         cnl = new Button("cnl");

        mlt.setBounds(100,250, 80,20);
        div.setBounds(200,250, 80,20);
        cnl.setBounds(150,300, 80,20);

        b1.addActionListener(this);  
        b2.addActionListener(this);  
        mlt.addActionListener(this);
        div.addActionListener(this);
        cnl.addActionListener(this);
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);  
        add(mlt);
        add(div);
        add(cnl);
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1){  
            c=a+b;  
        }else if(e.getSource()==b2){  
            c=a-b;  
        } 
        else if(e.getSource()==mlt){  
            c=a*b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new TextFieldExample();  
}  
}  