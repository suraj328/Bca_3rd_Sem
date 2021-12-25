import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
// import java.awt.Button;
public class JavaApplication{
    public static void main(String[] args) {
       JFrame frame = new JFrame("Java Swing Frame");
       frame.setSize(400,600);
       JPanel panel = new JPanel();
       panel.setLayout(null); 
       frame.add(panel);
       
       JLabel lblFirstName = new JLabel("First Name");
    //    firstName.setText("First Name");
        panel.add(lblFirstName);
        lblFirstName.setBounds(10,10,100,30);
        JTextField txtFirstName = new JTextField(15);
        txtFirstName.setBounds(120,10,150,30);
        panel.add(txtFirstName);

        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setBounds(10,50,100,30);
       panel.add(lblLastName);
       JTextField txtLastName = new JTextField(15);
       txtLastName.setBounds(120,50,150,30);
        panel.add(txtLastName);

        JCheckBox chkBCA = new JCheckBox("BCA");
        // chkBCA.setText("BCA");
        panel.add(chkBCA);
        JCheckBox chkCSIT = new JCheckBox("CSIT");
        panel.add(chkCSIT);
        JCheckBox chkBBM = new JCheckBox("BBM");
        panel.add(chkBBM);

        JRadioButton rbtnMale = new JRadioButton("Male");
        panel.add(rbtnMale);
        JRadioButton rbtnFemale = new JRadioButton("Female");
        panel.add(rbtnFemale);
        rbtnMale.setSelected(true);
        ButtonGroup rbtng = new ButtonGroup();
        rbtng.add(rbtnMale);
        rbtng.add(rbtnFemale);

        String program[] = {"BCA","CSIT","BIM","BBM"};
        JComboBox jcbProgram = new JComboBox(program);
        // jcbProgram.setSelectedItem(program[2]);
        panel.add(jcbProgram);
        
        String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        JList jlist = new JList(day);
        jlist.setSelectedIndex(4);
        panel.add(jlist);

        JButton btnSubmit = new JButton("Submit");
        panel.add(btnSubmit);
        JButton btnCancel = new JButton("Cancel");
        panel.add(btnCancel);
        

        // Button btnCancelAWT = new Button("Cancel AWT");
        // panel.add(btnCancelAWT);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.setVisible(true);
       
    }
}