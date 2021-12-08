import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle extends JFrame implements ActionListener {
    JTextField text1;
    JLabel label1;
    JLabel label2;
    JButton button;

    public Circle(){
        setTitle("Area of Circle");
        setBounds(10,20,30,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        label1 = new JLabel("Enter the radius");
        label1.setBounds(30,10,150,30);
        add(label1);

        text1 = new JTextField();
        text1.setBounds(30,40,150,30);
        add(text1);

        label2 = new JLabel("Output");
        label2.setBounds(30,120,150,30);
        add(label2);

        button = new JButton("Enter");
        button.setBounds(30,80,150,30);
        add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float r = (float) Double.parseDouble(text1.getText());
        float area = 0;
        if(e.getSource().equals(button)){
            area = (float) (3.14*r*r);
            label2.setText(String.valueOf(area+"cm2"));

        }

    }

    public static void main(String[] args) {
        new Circle();
    }
}
