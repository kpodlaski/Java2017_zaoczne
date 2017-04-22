package zajecia3;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Krzysztof Podlaski on 22.04.2017.
 */
public class MyForm {
    private JTextField imieTextField;
    private JPanel panel1;
    private JTextArea eastTextArea;
    private JButton button1;
    private JLabel infoLabel;

    public MyForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imie = imieTextField.getText();
                infoLabel.setText("Witam "+imie);
            }
        });
        imieTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e.getKeyCode()+
                        " "+e.getKeyChar());
                if (e.getKeyCode() == KeyEvent.VK_SHIFT)
                    System.out.println("SHIFT");
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        System.out.println("ENTER");break;
                    case KeyEvent.VK_PAGE_DOWN:
                        System.out.println("PGDOWN");break;
                    case KeyEvent.VK_ESCAPE:
                        System.exit(1);
                }
            }
        });
        imieTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                System.out.println("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                System.out.println("Focus Lost");
            }
        });
    }

    public static void main(String[] a){
        JFrame okno = new JFrame("Moja aplikacja");
        MyForm myForm = new MyForm();
        okno.setContentPane(myForm.panel1);
        okno.setSize(300,300);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

    }
}
