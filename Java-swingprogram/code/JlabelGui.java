

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class JlabelGui {
    
    public static void main(String[] args) {
        ImageIcon img= new ImageIcon("hello.png");
        Border b1=BorderFactory.createLineBorder(Color.BLUE);//it creates border 
        JLabel l1=new JLabel();//jlabel is area for our text,images ||jlabel is a body part of gui
        l1.setText("Hello Begineers");//text area for message
        l1.setIcon(img);//set image in gui area
        l1.setHorizontalTextPosition(JLabel.CENTER);//for center and horizental
        l1.setVerticalTextPosition(JLabel.TOP);//for top vertical
        l1.setForeground(Color.green);//change color of text
        l1.setFont(new Font("MV Boli",Font.PLAIN,20));//set font color size or proprties
        l1.setBackground(Color.black);//set background colors
        l1.setOpaque(true);//it works with bolean value for background color
        l1.setBorder(b1);//it will set border inside gui for body part of the gui
        l1.setVerticalAlignment(JLabel.TOP);//it  will vertical alligin body part to top
        l1.setHorizontalAlignment(JLabel.CENTER);//it  will horizentally alligin body part to center
        // l1.setBounds(0,0,250,250);//it works with setLayout.we can give x,y axis for representation of our body part
        

        JFrame f1=new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setTitle("Running");
        f1.setResizable(true);
        f1.setSize(500,500);
        f1.setVisible(true);
        // f1.pack();//it take gui size after resizing by users
        f1.add(l1);//it will add all the content of label in frame
        f1.setIconImage(img.getImage());
        f1.getContentPane().setBackground(Color.yellow);
        // f1.setLayout(null);//it will remove all the thing from gui body
    }
    
}
