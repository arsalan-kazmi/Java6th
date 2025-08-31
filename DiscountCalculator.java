import javax.swing.*;
import java.awt.event.*;

public class DiscountCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Discount Calculator");
        JLabel l1 = new JLabel("Original Price:"), l2 = new JLabel("Discount (%):"), l3 = new JLabel("Final Price:");
        JTextField t1 = new JTextField(), t2 = new JTextField();
        JButton b = new JButton("Calculate");
        l1.setBounds(30,30,120,20); t1.setBounds(160,30,100,20);
        l2.setBounds(30,60,120,20); t2.setBounds(160,60,100,20);
        b.setBounds(100,100,100,30); l3.setBounds(30,150,250,20);
        f.add(l1); f.add(t1); f.add(l2); f.add(t2); f.add(b); f.add(l3);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double price = Double.parseDouble(t1.getText());
                    double discount = Double.parseDouble(t2.getText());
                    if (price < 0 || discount < 0 || discount > 100) {
                        JOptionPane.showMessageDialog(f,"Invalid Input!","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    double finalPrice = price - (price * discount / 100);
                    l3.setText("Final Price: " + String.format("%.2f", finalPrice));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f,"Enter valid numbers!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        f.setSize(350,250); f.setLayout(null); f.setVisible(true);
    }
}

