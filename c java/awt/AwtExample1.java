import java.awt.*;  


public class AwtExample1 extends Frame{   //create Frame[AwtExample1] ...Frame 

AwtExample1(){
	 	Button b1 = new Button("Click");
	 	Button b2 = new Button("Press");
	 	Label l1=new Label("First Label.");  
    Label l2=new Label("Second Label.");  
    TextField t1=new TextField("Welcome to Javatpoint.");  
        
		CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkbox1 = new Checkbox("C++", cbg, false);  
        Checkbox checkbox2 = new Checkbox("Java",cbg, true);  
        
      		    add(b1);
              add(b2);
              add(l1);
              add(l2);
              add(t1);
              add(checkbox1);
              add(checkbox2);
	 	          setSize(600,600);  
             setLayout(new GridLayout(2,3));  

	 	// FlowLayout fv= new FlowLayout(FlowLayout.CENTER) ; 
         //setLayout(fv);
         //setLayout(new FlowLayout(FlowLayout.RIGHT));
         //setLayout(new FlowLayout());
  
         setVisible(true);  
}


	 public static void main(String arg[]){
	 	 AwtExample1 ob = 	new AwtExample1();
	
   }

}