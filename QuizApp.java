import javax.swing.*;
import java.awt.event.*;

public class QuizApp {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Quiz");
        JLabel q = new JLabel("Q: What is the capital of France?");
        JRadioButton o1 = new JRadioButton("Berlin");
        JRadioButton o2 = new JRadioButton("Paris");
        JRadioButton o3 = new JRadioButton("Rome");
        JRadioButton o4 = new JRadioButton("Madrid");
        ButtonGroup bg = new ButtonGroup();
        JButton b = new JButton("Submit");
        q.setBounds(30,30,300,20);
        o1.setBounds(50,60,100,20); o2.setBounds(50,90,100,20);
        o3.setBounds(50,120,100,20); o4.setBounds(50,150,100,20);
        b.setBounds(100,190,100,30);
        bg.add(o1); bg.add(o2); bg.add(o3); bg.add(o4);
        f.add(q); f.add(o1); f.add(o2); f.add(o3); f.add(o4); f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (o2.isSelected())
                    JOptionPane.showMessageDialog(f,"Correct!","Result",JOptionPane.INFORMATION_MESSAGE);
                else if (o1.isSelected()||o3.isSelected()||o4.isSelected())
                    JOptionPane.showMessageDialog(f,"Wrong Answer!","Result",JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(f,"Please select an option!","Error",JOptionPane.WARNING_MESSAGE);
            }
        });
        f.setSize(350,300); f.setLayout(null); f.setVisible(true);
    }
}
