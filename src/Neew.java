import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Neew extends JFrame implements ActionListener{
    JTextField field1;
    JTextField field2;
    JButton button1;
    JLabel label1;
    JLabel main;

    public Neew(){
        setTitle("Addition");
        setBounds(10,20,30,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        main=new JLabel("Addition");
        main.setBounds(30,20,150,30);
        add(main);

        field1=new JTextField();
        field1.setBounds(30,55,150,30);
        add(field1);

        field2=new JTextField();
        field2.setBounds(30,110,150,30);
        add(field2);


        button1=new JButton("click me ");
        button1.setBounds(30,170,150,30);
        add(button1);
        button1.addActionListener(this);

        label1=new JLabel("Result");
        label1.setBounds(30,200,150,30);
        add(label1);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(field1.getText());
        int b=Integer.parseInt(field2.getText());
        int c=0;
        if(e.getSource().equals(button1)){
            c=a+b;
            label1.setText(String.valueOf(c));
        }

    }

    public static void main(String[] args) {
        new Neew();
    }
}