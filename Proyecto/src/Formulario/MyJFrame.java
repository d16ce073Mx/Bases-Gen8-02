package Formulario;
import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public MyJFrame(){
        setTitle("My Swing Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Example layout manager

        // Add components
        JButton button = new JButton("Click Me!");
        add(button);

        setVisible(true); // Make the frame visible
    }
}