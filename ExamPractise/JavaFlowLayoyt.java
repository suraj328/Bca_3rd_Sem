import javax.swing.JButton;
import javax.swing.JFrame;
import java.applet.*;
import java.awt.Button;


public class JavaFlowLayoyt extends  Applet {
    // JButton b1,b2,b3;
    // JavaFlowLayoyt(){
    //     JFrame f1=new JFrame();

    //     b1 = new JButton("Ok");
    //     b2 = new JButton("Open");
    //     b3 = new JButton("Close");

    //     f1.add(b1);
    //     f1.add(b2);
        // f1.setSize(500,500);
        // f1.setTitle("hello");
        // f1.setVisible(true);
    // }
    public void init() {
        Button b1,b2,b3;
        
    
            b1 = new Button("Ok");
            b2 = new Button("Open");
            b3 = new Button("Close");
    
            add(b1);
            add(b2);
         add(b3);
    }
    
}
