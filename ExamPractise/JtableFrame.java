import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JtableFrame extends JFrame{
    JtableFrame(){
        String std_head []={"ID","Name","Faculty"};
        String std_body[][]={
            {"190620","suraj","Bca"},
            {"154622","Anil","BBA"},
            {"157565","reena","Science"}
        };

        JTable jt =new JTable(std_body,std_head);
        jt.setBounds(30, 40, 200, 300);

        JScrollPane jp=new JScrollPane(jt);
        jp.setSize(300, 250);
        this.add(jp);

        this.setSize(600,600);
        this.setVisible(true);
        this.setTitle("Table");
        this.getContentPane().setBackground(Color.MAGENTA);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        JtableFrame j=new JtableFrame();
        
    }
}
