

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.font.*;
import java.awt.Font;




public class SumGui extends JFrame implements ActionListener {
    JButton jb;
    JTextField jt1,jt2;
    JLabel lbl,lbl0;
    Font f;
    ImageIcon img;

    SumGui(){

        img=new ImageIcon("download.png");

        f=new Font("SansSerif", Font.ITALIC, 16);
        lbl0=new JLabel();
        lbl0.setBounds(90,10,150,30);
        
        lbl0.setBackground(Color.BLACK);
        lbl0.setText("Enter Two Integers");
        lbl0.setForeground(Color.darkGray);
        lbl0.setFont(f);
        this.add(lbl0);

        jt1=new JTextField();
        jt1.setBounds(90,50,150,30);
        jt1.setText("");
        jt1.setForeground(Color.WHITE);
        jt1.setBackground(Color.MAGENTA);
        this.add(jt1);


        jt2=new JTextField();
        jt2.setBounds(90,80,150,30);
        jt2.setText("");
        jt2.setForeground(Color.WHITE);
        jt2.setBackground(Color.MAGENTA);
        this.add(jt2);


        lbl=new JLabel();
        lbl.setBounds(90,140,150,30);
        lbl.setText("Your Result");
        lbl.setBackground(Color.YELLOW);
        lbl.setForeground(Color.LIGHT_GRAY);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        this.add(lbl);

        jb=new JButton();
        jb.setBounds(90, 200, 100, 30);
        jb.setText("Total");
        jb.setBackground(Color.GREEN);
        jb.setFocusable(false);
        this.add(jb);

        jb.addActionListener(this);

        this.setLayout(null);
        
        this.setSize(650,400);
        this.getContentPane().setBackground( Color.CYAN );
        this.setVisible(true);
        this.setIconImage(img.getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1=Integer.parseInt(jt1.getText());
        int num2=Integer.parseInt(jt2.getText());
        int result;
        if (e.getSource()==jb) {
            result=num1+num2;
            lbl.setText(String.valueOf(result));
        } 
        
    }
    public static void main(String[] args) {
        SumGui obj=new SumGui();

    }



    
}