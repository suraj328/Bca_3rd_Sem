import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GuiProgram extends JFrame {
    JLabel l;
    JTextField t1,t2;
    JCheckBox c1;
    JRadioButton r1,r2;
    GuiProgram(){
        l=new JLabel();
        l.setBounds(90, 100, 350, 60);
        l.setText("hello world");
        l.setForeground(Color.GRAY);
        l.setBackground(Color.BLUE);
        this.add(l);

        t1=new JTextField();
        t1.setBounds(50, 80, 300, 80);
        t1.setText("input1");
        t1.setForeground(Color.BLACK);
        
        this.add(t1);

        c1= new JCheckBox("Bca");
        c1.setBounds(100, 120, 300, 80);
        this.add(c1);

        r1= new JRadioButton();
        r1.setBounds(100, 120, 120, 60);
        this.add(r1);

        r2= new JRadioButton();
        r2.setBounds(200, 300, 120, 60);
        this.add(r2);

        ButtonGroup Bg=new ButtonGroup();
        Bg.add(r1);
        Bg.add(r2);

        this.setTitle("Gui");
        this.getContentPane().setBackground(Color.yellow);
        this.setSize(450,540);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        GuiProgram gui=new GuiProgram();
    }
    
}
