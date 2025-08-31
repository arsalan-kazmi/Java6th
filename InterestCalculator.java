import javax.swing.*;
import java.awt.event.*;

public class InterestCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Interest Calculator");
        JLabel l1 = new JLabel("Principal:"), l2 = new JLabel("Rate (%):"), l3 = new JLabel("Time (years):"), l4 = new JLabel("Result:");
        JTextField t1 = new JTextField(), t2 = new JTextField(), t3 = new JTextField();
        JButton b1 = new JButton("Calculate"), b2 = new JButton("Reset");
        l1.setBounds(30,30,100,20); t1.setBounds(150,30,100,20);
        l2.setBounds(30,60,100,20); t2.setBounds(150,60,100,20);
        l3.setBounds(30,90,100,20); t3.setBounds(150,90,100,20);
        b1.setBounds(50,130,100,30); b2.setBounds(170,130,100,30);
        l4.setBounds(30,180,300,20);
        f.add(l1); f.add(t1); f.add(l2); f.add(t2); f.add(l3); f.add(t3);
        f.add(b1); f.add(b2); f.add(l4);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                double t = Double.parseDouble(t3.getText());
                double si = (p * r * t) / 100;
                l4.setText("Result: Simple Interest = " + String.format("%.2f", si));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(""); t2.setText(""); t3.setText(""); l4.setText("Result:");
            }
        });
        f.setSize(350,280); f.setLayout(null); f.setVisible(true);
    }
}
