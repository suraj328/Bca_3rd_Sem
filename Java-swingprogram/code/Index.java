
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class Index {
    public static void main(String[] args) {
        
        JFrame Frame=new JFrame();//creates a frame
        Frame.setTitle("hello begineers");//sets title of frame
        Frame.setResizable(true);//prevent frame from being resized
        Frame.setSize(420,420);//sets the x-dimenso,and y-dimenson of frame
        Frame.setVisible(true);//make fame visble
        
        ImageIcon image =new ImageIcon("wolves.jpg");//create an image
        Frame.setIconImage(image.getImage());//change icon for image
        Frame.getContentPane().setBackground(Color.yellow);//chanage color of background
    }
    
}