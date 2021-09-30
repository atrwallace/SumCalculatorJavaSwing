package calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraEmSwing {
    private JPanel painel;
    private JButton somar;
    private JLabel res;
    private JTextField numero1;
    private JTextField numero2;

    public CalculadoraEmSwing() {
        somar.addActionListener((event) -> {
                int n1 = Integer.parseInt(numero1.getText());
                int n2 = Integer.parseInt(numero2.getText());
                int s = n1 + n2;
                res.setText(Integer.toString(s));

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora feita em Swing");
        frame.setContentPane(new CalculadoraEmSwing() .painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
