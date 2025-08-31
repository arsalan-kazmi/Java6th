import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class UnitConverter {
    public static void main(String[] args) {
        JFrame f = new JFrame("Unit Converter");
        JLabel l1 = new JLabel("Value:"), l2 = new JLabel("Result:");
        JTextField t = new JTextField();
        String[] units = {"Meters","Kilometers","Grams","Kilograms"};
        JComboBox<String> from = new JComboBox<>(units);
        JComboBox<String> to = new JComboBox<>(units);
        JButton b = new JButton("Convert");
        l1.setBounds(30,30,60,20); t.setBounds(100,30,100,20);
        from.setBounds(220,30,100,20); to.setBounds(330,30,100,20);
        b.setBounds(150,70,100,30); l2.setBounds(30,120,300,20);
        f.add(l1); f.add(t); f.add(from); f.add(to); f.add(b); f.add(l2);

        Map<String,Double> factors = new HashMap<>();
        factors.put("Meters",1.0); factors.put("Kilometers",1000.0);
        factors.put("Grams",1.0); factors.put("Kilograms",1000.0);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double val = Double.parseDouble(t.getText());
                    String u1 = (String)from.getSelectedItem();
                    String u2 = (String)to.getSelectedItem();
                    if ((u1.equals("Meters")||u1.equals("Kilometers")) && (u2.equals("Grams")||u2.equals("Kilograms")) ||
                        (u1.equals("Grams")||u1.equals("Kilograms")) && (u2.equals("Meters")||u2.equals("Kilometers"))) {
                        JOptionPane.showMessageDialog(f,"Incompatible units!","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    double base = val * factors.get(u1);
                    double res = base / factors.get(u2);
                    l2.setText("Result: " + String.format("%.4f", res) + " " + u2);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f,"Enter a valid number!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        f.setSize(480,200); f.setLayout(null); f.setVisible(true);
    }
}

