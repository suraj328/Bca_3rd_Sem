import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GuiProgram extends JFrame {
    JLabel l;
    JTextField t1,t2;
    GuiProgram(){
        l=new JLabel();
        l.setBounds(90, 100, 150, 60);
        l.setText("hello world");
        l.setForeground(Color.GRAY);
        this.add(l);

        t1=new JTextField();
        t1.setBounds(10,10,100,40);
        t1.setText("input1");
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.DARK_GRAY);
        this.add(t1);

        

        this.setTitle("Gui");
        this.setSize(450,540);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        GuiProgram gui=new GuiProgram();
    }
    
}
