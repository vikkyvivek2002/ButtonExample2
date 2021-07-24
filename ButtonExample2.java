import java.awt.*; import java.awt.event.*; 
public class ButtonExample2 {  
public static void main(String[] args) {  
    Frame f=new Frame("Button Example");  
    Button b1=new Button("YES");
    Button b2=new Button("NO");
    Button b3=new Button();
    b3.setLabel("cancel");
    b1.setBackground(Color.red);
    b1.setForeground(Color.green);
    Font myFont = new Font("Courier", Font.BOLD,40);
     b1.setFont(myFont);// use "setFont(Font f)" method
    System.out.print(b2.getLabel());
    f.add(b1);  
    f.add(b2);
    f.add(b3);
    f.setSize(400,400);  
    f.setLayout(new FlowLayout());//Setting the layout for the Frame 
    f.setVisible(true);   
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
}  
}