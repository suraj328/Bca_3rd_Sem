import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class JFramePannel {
    public static void main(String[] args) {
        //ImageIcon is for importing images
        ImageIcon img= new ImageIcon("hello.png");
        
        //Jlabel is body part for adding text and images
        JLabel red=new JLabel();
        red.setText("I  am here for red Layout");

        JLabel blue=new JLabel();
        blue.setText("I  am here for blue Layout");
        blue.setForeground(Color.RED);
        // blue.setVerticalAlignment(JLabel.TOP);

        JLabel black=new JLabel();
        black.setText("i am for black layout");//set text to corressponding layout
        black.setForeground(Color.WHITE);//set color of text to corressponding layout

        JLabel green=new JLabel();
        green.setText("I  am here for green Layout");
        green.setForeground(Color.DARK_GRAY);


        //Jpannel are used to create a layout in the body part of gui 
        // its make easy to differnt section
        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,150,150);
        redpanel.add(red);


        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(150,0,150,150);
        bluepanel.add(blue);
        // bluepanel.setLayout(new BorderLayout());

        JPanel blackpanel=new JPanel();
        blackpanel.setBackground(Color.BLACK);
        blackpanel.setBounds(0,150,150,150);
        blackpanel.add(black);
        

        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(150,150,150,150);
        greenpanel.add(green);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(blackpanel);
        frame.add(greenpanel);
        frame.setIconImage(img.getImage());//it helps to get image for gui icon
    }
}
