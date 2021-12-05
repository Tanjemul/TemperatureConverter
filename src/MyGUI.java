import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI extends JFrame {
    private JPanel mainName;
    private JTextField celsiusTextField;
    private JLabel celsius;
    private JButton convertButton;
    private JLabel farenheight;

    public MyGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainName);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(celsiusTextField.getText()))
                        * 1.8 + 32);
                farenheight.setText(tempFahr + " Fahrenheit");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new MyGUI("My Celsius Converter");
        frame.setVisible(true);

    }

}
