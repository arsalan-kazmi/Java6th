import javax.swing.*;
import java.awt.event.*;

public class BMICalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("BMI Calculator");
        JTextField t1 = new JTextField(), t2 = new JTextField();
        JButton b = new JButton("Calculate");
        JLabel l1 = new JLabel("Weight (pounds):"), l2 = new JLabel("Height (inches):"), l3 = new JLabel("Result:");
        l1.setBounds(30, 30, 120, 20); t1.setBounds(150, 30, 100, 20);
        l2.setBounds(30, 60, 120, 20); t2.setBounds(150, 60, 100, 20);
        b.setBounds(100, 100, 100, 30); l3.setBounds(30, 150, 300, 20);
        f.add(l1); f.add(t1); f.add(l2); f.add(t2); f.add(b); f.add(l3);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double w = Double.parseDouble(t1.getText());
                double h = Double.parseDouble(t2.getText());
                double bmi = 703 * w / (h * h);
                String status = bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : bmi < 30 ? "Overweight" : "Obese";
                l3.setText("BMI: " + String.format("%.1f", bmi) + " (" + status + ")");
            }
        });
        f.setSize(400, 250); f.setLayout(null); f.setVisible(true);
    }
}
