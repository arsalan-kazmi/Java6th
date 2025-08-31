import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        JFrame f = new JFrame("Currency Converter");
        JTextField t = new JTextField();
        String[] currencies = {"USD","EUR","INR"};
        JComboBox<String> from = new JComboBox<>(currencies);
        JComboBox<String> to = new JComboBox<>(currencies);
        JButton b = new JButton("Convert");
        JLabel l = new JLabel("Result:");
        t.setBounds(30, 30, 100, 20);
        from.setBounds(150, 30, 60, 20);
        to.setBounds(220, 30, 60, 20);
        b.setBounds(100, 70, 100, 30);
        l.setBounds(30, 120, 300, 20);
        f.add(t); f.add(from); f.add(to); f.add(b); f.add(l);
        Map<String,Double> rate = new HashMap<>();
        rate.put("USD",1.0); rate.put("EUR",0.9); rate.put("INR",83.0);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amt = Double.parseDouble(t.getText());
                String s = (String)from.getSelectedItem();
                String d = (String)to.getSelectedItem();
                double res = amt / rate.get(s) * rate.get(d);
                l.setText("Result: " + String.format("%.2f", res) + " " + d);
            }
        });
        f.setSize(350,200); f.setLayout(null); f.setVisible(true);
    }
}
