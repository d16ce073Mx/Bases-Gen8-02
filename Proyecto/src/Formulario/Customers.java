package Formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;
import java.util.ArrayList;

public class Customers extends JFrame {
    private JPanel customersPanel;
    private JTextField JTFFirstName;
    private JButton guardarButton;
    private JTextField JTFEmail;
    private JButton limpiarButton;
    private JTextField JTFLastName;
    private JTextField JTFBirthdate;
    private JRadioButton solteroRadioButton;
    private JRadioButton casadoRadioButton;

    public Customers() {
        // Inicialización de componentes
        customersPanel = new JPanel();
        customersPanel.setLayout(new GridLayout(6, 2, 10, 5));

        JTFFirstName = new JTextField(20);
        JTFLastName = new JTextField(20);
        JTFBirthdate = new JTextField(10);
        JTFEmail = new JTextField(20);

        guardarButton = new JButton("Guardar");
        limpiarButton = new JButton("Limpiar");

        solteroRadioButton = new JRadioButton("Soltero");
        casadoRadioButton = new JRadioButton("Casado");

        // Grupo de radio buttons
        ButtonGroup grupoEstadoCivil = new ButtonGroup();
        grupoEstadoCivil.add(solteroRadioButton);
        grupoEstadoCivil.add(casadoRadioButton);

        // Placeholder correo electrónico
        JTFEmail.setForeground(Color.GRAY);
        JTFEmail.setText("correo@ejemplo.com");
        JTFEmail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (JTFEmail.getText().equals("correo@ejemplo.com")) {
                    JTFEmail.setText("");
                    JTFEmail.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (JTFEmail.getText().isEmpty()) {
                    JTFEmail.setForeground(Color.GRAY);
                    JTFEmail.setText("correo@ejemplo.com");
                }
            }
        });

        // Agregar componentes al panel
        customersPanel.add(new JLabel("Nombre:"));
        customersPanel.add(JTFFirstName);
        customersPanel.add(new JLabel("Apellido:"));
        customersPanel.add(JTFLastName);
        customersPanel.add(new JLabel("Fecha de Nacimiento:"));
        customersPanel.add(JTFBirthdate);
        customersPanel.add(new JLabel("Correo:"));
        customersPanel.add(JTFEmail);
        customersPanel.add(solteroRadioButton);
        customersPanel.add(casadoRadioButton);
        customersPanel.add(guardarButton);
        customersPanel.add(limpiarButton);

        // Configuración del JFrame
        setTitle("Empleados: ");
        setContentPane(customersPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!validarCampos()) return;
                if (!validarCorreo()) return;
                if (!validarDuplicado()) return;

                // Si todo está bien, guardar cliente
                Employee nuevo = new Employee(JTFFirstName.getText(), JTFLastName.getText(), JTFEmail.getText());
                Employees.add(nuevo);
                JOptionPane.showMessageDialog(this, "Cliente guardado exitosamente.");
            }
        });
    }

    private boolean validarCorreo() {
        String correo = JTFEmail.getText();
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(this, "Correo electrónico inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarCampos() {
            if (JTFFirstName.getText().isEmpty() ||
                JTFLastName.getText().isEmpty() ||
                JTFBirthdate.getText().isEmpty() ||
                JTFEmail.getText().isEmpty() ||
                (!solteroRadioButton.isSelected() && !casadoRadioButton.isSelected())) {
            JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }



    public static void main(String[] args) {
        new Customers();
    }

    class Employee {
        String firstName;
        String lastName;
        String email;
        LocalDate birthdate;
        boolean married;

        public Employee(String firstName, String lastName, String email, LocalDate birthdate, boolean married) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.birthdate = birthdate;
            this.married = married;
        }
    }

    private ArrayList<Employee> employees = new ArrayList<>();

    private boolean validarDuplicado() {
        String correo = JTFEmail.getText();
        for (Employee c : employees) {
            if (c.email.equalsIgnoreCase(correo)) {
                JOptionPane.showMessageDialog(this, "Ya existe un cliente con este correo.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

}