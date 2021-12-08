import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameButton extends JFrame implements ActionListener {
    JButton btn;
    ImageIcon icon;
    // action listener helps to perfrorm action or respoinses after clicking
    JFrameButton(){
        icon=new ImageIcon("hello.png");
        btn=new JButton();
        btn.setBounds(100,100,250,100);
        btn.setText("Click");
        btn.setFocusable(false);
        btn.setIcon(icon);
        // btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalAlignment(JButton.TOP);
        btn.setIconTextGap(15);
        btn.setForeground(Color.ORANGE);
        btn.setBackground(Color.CYAN);
        btn.setBorder(BorderFactory.createEtchedBorder());
        
        btn.addActionListener(this);
        // btn.addActionListener(e->System.out.println("working"));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(btn);

    }
    @Override
    // action listener for printing btn response
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn) {
            System.out.println("work sucessfully");
            // btn.setEnabled(false);//it gives action of one click only to button
        }
        
    }
    public static void main(String[] args) {
        JFrameButton btn1=new JFrameButton();
        
    }
    
}