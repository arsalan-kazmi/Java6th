import javax.swing.*;
import java.awt.event.*;

public class TipCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tip Calculator");
        JLabel l1 = new JLabel("Bill Amount:"), l2 = new JLabel("Tip Amount:");
        JTextField t = new JTextField();
        String[] tips = {"10%","15%","20%","25%"};
        JComboBox<String> cb = new JComboBox<>(tips);
        JButton b = new JButton("Calculate");
        l1.setBounds(30,30,100,20); t.setBounds(140,30,100,20);
        cb.setBounds(260,30,80,20); b.setBounds(140,70,100,30);
        l2.setBounds(30,120,250,20);
        f.add(l1); f.add(t); f.add(cb); f.add(b); f.add(l2);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double bill = Double.parseDouble(t.getText());
                    int tipPercent = Integer.parseInt(((String)cb.getSelectedItem()).replace("%",""));
                    double tip = bill * tipPercent / 100.0;
                    l2.setText("Tip Amount: " + String.format("%.2f", tip));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f,"Enter a valid bill amount!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        f.setSize(400,200); f.setLayout(null); f.setVisible(true);
    }
}
