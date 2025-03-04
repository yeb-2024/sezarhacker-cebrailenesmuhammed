package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BruteForceScreen implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JTextField cipherTextField;
    private JButton startButton;
    private Font font;

    public BruteForceScreen() {
        frame = new JFrame("Brute-Force Şifre Çözme");
        panel = new JPanel();
        font = new Font("Arial", Font.PLAIN, 18);
        cipherTextField = new JTextField();
        startButton = new JButton("Şifreyi Çöz");

        cipherTextField.setFont(font);
        cipherTextField.setPreferredSize(new Dimension(300, 30));
        startButton.setFont(font);
        startButton.addActionListener(this);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
