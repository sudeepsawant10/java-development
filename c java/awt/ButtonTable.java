
import java.awt.*;
import java.awt.event.*;

class ButtonTable extends Frame implements ActionListener{
	ButtonTable(){
		Button b1 = new Button("Click");
		TextField tf1 = new TextField();
		tf1.setBounds(50,50,150,20);
		b1.setBounds(50,100,60,30);
		add(b1);
		add(tf1);
		b1.addActionListener(this);
		setSize(400,600);
		setLayout(null);
		setVisible(true);
		int n=5;
		int i=1;
		public void actionPerformed(ActionEvent e){
			for(i=1;i<=10;i++){
				tf1.setText(n*i);
			}
		}

	}
	
	public static void main(String[] args) {
		new ButtonTable();
	}
}