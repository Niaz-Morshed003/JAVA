import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class THATSHITISTOUGH {


    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULATOR");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        JLabel labe1 = new JLabel("DIG 1");
        JTextField text1 = new JTextField(20);
        JLabel labe2 = new JLabel("DIG 2");
        JTextField text2 = new JTextField(20);
        JLabel labe3 = new JLabel("result");
        JTextField textr = new JTextField(20);
        textr.setEditable(false);
        JButton butt1 = new JButton("+");
        JButton butt2 = new JButton("-");
        JButton butt3 = new JButton("*");
        JButton butt4 = new JButton("/");
        JButton butt5 = new JButton("RESET");
        panel.add(labe1);
        panel.add(text1);
        panel.add(labe2);
        panel.add(text2);
        panel.add(labe3);
        panel.add(textr);
        panel.add(butt1);
        panel.add(butt2);
        panel.add(butt3);
        panel.add(butt4);
        panel.add(butt5);

        butt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());

                    int b = Integer.parseInt(text2.getText());

                    int r = a+b;
                    textr.setText(String.valueOf(r));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "DO NOT PUT ZERO", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (InputMismatchException ex) {
                    JOptionPane.showMessageDialog(frame, "PUT APPROPIATE VALUE NIGGA", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "WRONG", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        butt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());

                    int b = Integer.parseInt(text2.getText());

                    int r = a-b;
                    textr.setText(String.valueOf(r));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "DO NOT PUT ZERO", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (InputMismatchException ex) {
                    JOptionPane.showMessageDialog(frame, "PUT APPROPIATE VALUE NIGGA", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "WRONG", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        butt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());

                    int b = Integer.parseInt(text2.getText());

                    int r = b*a;
                    textr.setText(String.valueOf(r));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "DO NOT PUT ZERO", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (InputMismatchException ex) {
                    JOptionPane.showMessageDialog(frame, "PUT APPROPIATE VALUE NIGGA", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "WRONG", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        butt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());

                    int b = Integer.parseInt(text2.getText());

                    int r =a/b;
                    textr.setText(String.valueOf(r));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "DO NOT PUT ZERO", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (InputMismatchException ex) {
                    JOptionPane.showMessageDialog(frame, "PUT APPROPIATE VALUE NIGGA", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "WRONG", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


butt5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        text1.setText(String.valueOf(0));
text2.setText(String .valueOf(0));
textr.setText(String.valueOf(0));
    }
});

frame.setVisible(true);
    }}

