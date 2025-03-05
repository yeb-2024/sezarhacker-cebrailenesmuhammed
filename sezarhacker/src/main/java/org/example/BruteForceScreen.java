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
        panel = new JPanel(new GridLayout(3, 1, 10, 10));
        font = new Font("Arial", Font.PLAIN, 18);
        cipherTextField = new JTextField();
        startButton = new JButton("Şifreyi Çöz");

        cipherTextField.setFont(font);
        cipherTextField.setPreferredSize(new Dimension(300, 30));
        startButton.setFont(font);
        startButton.addActionListener(this);
    }

    public void basla() {
        // Panel düzeni
        panel.add(new JLabel("Şifreli Metni Girin:"));
        panel.add(cipherTextField);
        panel.add(startButton);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Brute Force şifre çözme işlemi
    public void bruteForceDecrypt(String cipherText) {
        String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String allResults = "";

        // 0'dan 25'e kadar tüm anahtarları dene
        for (int key = 0; key < SYMBOLS.length(); key++) {
            String decryptedText = "";
            for (int i = 0; i < cipherText.length(); i++) {
                char c = cipherText.charAt(i);
                if (SYMBOLS.indexOf(c) != -1) {
                    int newIndex = (SYMBOLS.indexOf(c) - key + SYMBOLS.length()) % SYMBOLS.length();
                    decryptedText += SYMBOLS.charAt(newIndex);
                } else {
                    decryptedText += c;
                }
            }
            String result = "Anahtar #" + key + ": " + decryptedText;
            allResults += result + "\n";
        }
        JOptionPane.showMessageDialog(frame, allResults, "Şifreleme Sonucu", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cipherText = cipherTextField.getText().toUpperCase();
        bruteForceDecrypt(cipherText);
    }
}
