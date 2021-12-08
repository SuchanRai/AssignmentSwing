import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divide extends JFrame implements ActionListener {
    JTextField text1;
    JTextField text2;
    JLabel label1;
    JLabel label2;
    JButton button;

    public Divide(){
        setTitle("Divide");
        setBounds(10,20,30,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        label1 = new JLabel("Division");
        label1.setBounds(30,20,150,30);
        add(label1);

        text1 = new JTextField();
        text1.setBounds(30,55,150,30);
        add(text1);

        text2 = new JTextField();
        text2.setBounds(30,110,150,30);
        add(text2);

        label2 = new JLabel("Output");
        label2.setBounds(30,200,150,30);
        add(label2);

        button = new JButton("Enter");
        button.setBounds(30,160,150,30);
        add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float a = Integer.parseInt(text1.getText());
        float b = Integer.parseInt(text2.getText());
        float c = 0;
        if(e.getSource().equals(button)){
            c = a/b;
            label2.setText(String.valueOf(c));

        }

    }

    public static void main(String[] args) {
        new Divide();
    }
}
