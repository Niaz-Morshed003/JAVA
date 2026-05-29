import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class Janinabal {


    public static void main(String[] args) {
        JFrame frame = new JFrame("CALC");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        JLabel lab = new JLabel("ok ig");
        JTextField text = new JTextField(10);
        panel.add(lab);
        panel.add(text);
        JButton add2 = new JButton("add 2");
        JButton minus2 = new JButton("minus 2");
        JButton reset = new JButton("reset");
        panel.add(add2);
        panel.add(minus2);
        panel.add(reset);


        add2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int anum = Integer.parseInt(text.getText());
                    text.setText(String.valueOf(anum + 2));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "error nigga", "error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        minus2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int anum = Integer.parseInt(text.getText());
                    text.setText(String.valueOf(anum - 2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "wrong", "error", JOptionPane.ERROR_MESSAGE);

                }
            }
        });


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int anum = Integer.parseInt(text.getText());
                    text.setText(String.valueOf(100));
                } catch (InputMismatchException ex) {
                    JOptionPane.showMessageDialog(frame, "wrong", "error", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        frame.setVisible(true);


    }}