package org.infotec.view;

import javax.swing.*;
import java.awt.*;

public class Cliente extends JFrame{
    private JPanel clientePanel;

    private JTextField JTNumeroCliente;
    private JTextField JTNombre;
    private JTextField JTRFC;
    private JTextField JTCorreo;

     public Cliente () {
         clientePanel = new JPanel();
         clientePanel.setLayout(new GridLayout(6,2,10,5));

         setTitle("Cliente:");
         setContentPane(clientePanel);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         pack();
         setVisible(true);

         JTNumeroCliente = new JTextField(20);
         JTNombre = new JTextField(20);
         JTRFC = new JTextField(20);
         JTCorreo = new JTextField(20);

         clientePanel.add(new Label("Número de Cliente"));
         clientePanel.add(JTNumeroCliente);
         clientePanel.add(new Label("Nombre"));
         clientePanel.add(JTNombre);
         clientePanel.add(new Label("RFC"));
         clientePanel.add(JTRFC);
         clientePanel.add(new Label("Correo"));
         clientePanel.add(JTCorreo);

     }

}
