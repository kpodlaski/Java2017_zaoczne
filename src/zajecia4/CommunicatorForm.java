package zajecia4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 06.05.2017.
 */
public class CommunicatorForm {
    public JTextArea history;
    public JTextField toSend;
    public JButton button1;
    public Client client;

    public CommunicatorForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = toSend.getText();
                toSend.setText("");
                try {
                    client.sendToSocket(msg);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}
