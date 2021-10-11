
package db_Darbas;

import Objektai.Naudotojas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App2 {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JPanel welcome_panel;
    private JPanel klausimai_panel;
    private JTextField klausimas_field;

    public App2() {
        klausimai_panel.setVisible(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vardas = textField1.getText();
                JOptionPane.showMessageDialog(null, "Sveiki " + vardas);
                Naudotojas naudotojas = new Naudotojas();
                naudotojas.vardas = vardas;

                NaudotojasService naudotojasService = new NaudotojasService();
                naudotojasService.createNaudotojas(naudotojas);

                welcome_panel.setVisible(false);
                klausimai_panel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App2");
        frame.setContentPane(new App2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
