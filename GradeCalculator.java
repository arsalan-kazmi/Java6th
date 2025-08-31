import javax.swing.*;
import java.awt.event.*;

public class GradeCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Grade Calculator");
        JLabel[] ls = new JLabel[5];
        JTextField[] ts = new JTextField[5];
        for(int i=0;i<5;i++){
            ls[i]=new JLabel("Subject "+(i+1)+":");
            ts[i]=new JTextField();
            ls[i].setBounds(30,30+i*30,80,20);
            ts[i].setBounds(120,30+i*30,80,20);
            f.add(ls[i]); f.add(ts[i]);
        }
        JButton b=new JButton("Calculate");
        JLabel res=new JLabel("Result:");
        b.setBounds(80,190,100,30); res.setBounds(30,230,250,20);
        f.add(b); f.add(res);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double sum=0;
                    for(int i=0;i<5;i++){
                        double m=Double.parseDouble(ts[i].getText());
                        if(m<0||m>100){
                            JOptionPane.showMessageDialog(f,"Marks must be 0-100","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        sum+=m;
                    }
                    double avg=sum/5;
                    String grade=avg>=90?"A":avg>=75?"B":avg>=60?"C":avg>=50?"D":"F";
                    res.setText("Result: Average = "+String.format("%.2f",avg)+" | Grade = "+grade);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(f,"Enter valid marks!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        f.setSize(300,320); f.setLayout(null); f.setVisible(true);
    }
}
