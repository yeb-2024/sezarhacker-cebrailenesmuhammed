package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaesarŞifreleme implements ActionListener {
    JFrame frame;
    JButton encryptButton, decryptButton, bruteForceButton;
    Font font;

    public CaesarŞifreleme() {
        frame = new JFrame("Caesar Şifreleme");
        font = new Font("Arial", Font.PLAIN, 24);

        encryptButton = createButton("Şifrele");
        decryptButton = createButton("Şifre Çöz");
        bruteForceButton = createButton("Brute-Force");
    }

    public void basla() {
        frame.setLayout(new GridLayout(4, 1));
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JLabel("Sezar Şifreleme Yöntemi", SwingConstants.CENTER));
        frame.add(encryptButton);
        frame.add(decryptButton);
        frame.add(bruteForceButton);

        frame.setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(font);
        button.addActionListener(this);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == encryptButton) {
            EncryptScreen encryptScreen = new EncryptScreen();
            encryptScreen.basla();
            frame.dispose();
        }
        if (e.getSource() == decryptButton) {
            ŞifrelemeÇözSayfa şifrelemeÇözSayfa = new ŞifrelemeÇözSayfa();
            şifrelemeÇözSayfa.basla();
            frame.dispose();
        }  else if (e.getSource() == bruteForceButton) {
            BruteForceScreen bruteForceScreen = new BruteForceScreen();
            bruteForceScreen.basla();
            frame.dispose();

        }
    }
}


