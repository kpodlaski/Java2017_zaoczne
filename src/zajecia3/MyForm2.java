package zajecia3;

import javafx.scene.control.RadioButton;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 22.04.2017.
 */
public class MyForm2 {
    private JRadioButton lubieToRadioButton;
    private JRadioButton a2PtRadioButton;
    private JRadioButton a5ptRadioButton;
    private JRadioButton a10ptRadioButton;
    private JTextPane textPane1;
    private JSlider slider1;
    private JPanel panel;


    public MyForm2() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton radio = (JRadioButton) e.getSource();
                System.out.println("Wybrano " + radio.getText());
            }
        };

        a2PtRadioButton.addActionListener(listener);
        a2PtRadioButton.addActionListener(listener);
        a5ptRadioButton.addActionListener(listener);
        a10ptRadioButton.addActionListener(listener);
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("ZMIANA");
            }
        });
    }

    public static void main(String[] a){
        JFrame okno = new JFrame("Moja aplikacja 2");
        MyForm2 myForm = new MyForm2();
        okno.setContentPane(myForm.panel);
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        okno.setSize((int) width/4, (int) height/4);
        okno.setLocation((int) (3*width/8),(int) (3*height/8));
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

    }
}
