import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area extends JFrame implements ActionListener {
    JTextField text1;
    JTextField text2;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JButton button;

    public Area(){
        setTitle("Area of Triangle");
        setBounds(10,20,30,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        label1 = new JLabel("Area");
        label1.setBounds(30,10,150,30);
        add(label1);

        label3 = new JLabel("Enter the height:");
        label3.setBounds(30,40,150,30);
        add(label3);

        text1 = new JTextField();
        text1.setBounds(30,75,150,30);
        add(text1);

        label4 = new JLabel("Enter the breath:");
        label4.setBounds(30,110,150,30);
        add(label4);

        text2 = new JTextField();
        text2.setBounds(30,145,150,30);
        add(text2);

        label2 = new JLabel("Output");
        label2.setBounds(30,215,150,30);
        add(label2);

        button = new JButton("Enter");
        button.setBounds(30,180,150,30);
        add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float h = (float) Double.parseDouble(text1.getText());
        float b = (float) Double.parseDouble(text2.getText());
        float area = 0;
        if(e.getSource().equals(button)){
            area = b*h/2;
            label2.setText(String.valueOf(area+"cm2"));

        }

    }

    public static void main(String[] args) {
        new Area();
    }
}
