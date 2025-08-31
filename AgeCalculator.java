import javax.swing.*;
import java.awt.event.*;
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Age Calculator");
        JLabel l1 = new JLabel("Enter Birth Year:"), l2 = new JLabel("Result:");
        JTextField t1 = new JTextField();
        JButton b = new JButton("Calculate");
        l1.setBounds(30,30,120,20); t1.setBounds(160,30,100,20);
        b.setBounds(100,70,100,30); l2.setBounds(30,120,300,20);
        f.add(l1); f.add(t1); f.add(b); f.add(l2);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int birthYear = Integer.parseInt(t1.getText());
                    int currentYear = Year.now().getValue();
                    if (birthYear <= 0 || birthYear > currentYear) {
                        JOptionPane.showMessageDialog(f,"Invalid Birth Year!","Error",JOptionPane.ERROR_MESSAGE);
                    } else {
                        int age = currentYear - birthYear;
                        l2.setText("Result: Your Age is " + age + " years");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f,"Please enter a valid number!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        f.setSize(350,200); f.setLayout(null); f.setVisible(true);
    }
}
