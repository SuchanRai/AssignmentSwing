import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_Interest extends JFrame implements ActionListener {
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JButton button;

    public Simple_Interest(){
        setTitle("Simple Interest");
        setBounds(10,20,30,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        label1 = new JLabel("Simple Interest");
        label1.setBounds(30,10,150,30);
        add(label1);

        label3 = new JLabel("Enter the Principal:");
        label3.setBounds(30,40,150,30);
        add(label3);

        text1 = new JTextField();
        text1.setBounds(30,75,150,30);
        add(text1);

        label4 = new JLabel("Enter the time:");
        label4.setBounds(30,110,150,30);
        add(label4);

        text2 = new JTextField();
        text2.setBounds(30,145,150,30);
        add(text2);

        label5 = new JLabel("Enter the Rate:");
        label5.setBounds(30,180,150,30);
        add(label5);

        text3 = new JTextField();
        text3.setBounds(30,215,150,30);
        add(text3);

        label2 = new JLabel("Output");
        label2.setBounds(30,295,150,30);
        add(label2);

        button = new JButton("Enter");
        button.setBounds(30,260,150,30);
        add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float p = (float) Double.parseDouble(text1.getText());
        float t = (float) Double.parseDouble(text2.getText());
        float r = (float) Double.parseDouble(text3.getText());
        float si = 0;
        if(e.getSource().equals(button)){
            si = (p*t*r)/100;
            label2.setText(String.valueOf("Rs"+si));

        }

    }

    public static void main(String[] args) {
        new Simple_Interest();
    }
}
