import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class JavaMenuBar extends JFrame {
    JavaMenuBar(){
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(p1);

        JMenuBar menubar=new JMenuBar();
        p1.add(menubar);

        JMenu menufile=new JMenu("FIle");
        menubar.add(menufile);

        JMenuItem filenew=new JMenuItem("new");
        menufile.add(filenew);

        JMenuItem exit=new JMenuItem("exit");
        menufile.add(exit);

        JMenuItem save=new JMenuItem("save as");
        menufile.add(save);

        
        JMenu menuedit=new JMenu("EDit");
        menubar.add(menuedit);
        JMenuItem cut=new JMenuItem("cut");
        menufile.add(cut);
        JMenuItem paste=new JMenuItem("paste");
        menufile.add(paste);

        JMenu menuclose=new JMenu("close");
        menubar.add(menuclose);

        this.setSize(500,650);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JavaMenuBar obj= new JavaMenuBar();
    }
    
}
