package bo.edu.umss.cs.ceis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiqueta;
    private JTextField campo;
    private JButton jugar;

    public Ventana() {
        super("Juego de Números");
        etiqueta = new JLabel("Dime un número:");
        campo = new JTextField(3);
        jugar = new JButton("Jugar");

        setLayout(new FlowLayout());

        add(etiqueta);
        add(campo);
        add(jugar);

        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hola");
                JDialog dialog = new JDialog();
                
                dialog.setVisible(true);
            }
        });
    }
}
