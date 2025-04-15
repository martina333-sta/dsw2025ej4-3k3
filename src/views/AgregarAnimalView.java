package views;

import javax.swing.*;
import domain.*;

public class AgregarAnimalView extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEspecie;
    private JTextField txtEdad;

    public AgregarAnimalView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Agregar Nuevo Animal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblEspecie = new JLabel("Especie:");
        JLabel lblEdad = new JLabel("Edad:");

        txtNombre = new JTextField(20);
        txtEspecie = new JTextField(20);
        txtEdad = new JTextField(5);

        JButton btnGuardar = new JButton("Guardar");
        JButton btnVolver = new JButton("Volver");

        btnGuardar.addActionListener(e -> guardarAnimal());
        btnVolver.addActionListener(e -> {
            new MenuPrincipalView().setVisible(true);
            this.dispose();
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblEspecie);
        panel.add(txtEspecie);
        panel.add(lblEdad);
        panel.add(txtEdad);
        panel.add(btnGuardar);
        panel.add(btnVolver);

        add(panel);
    }

    private void guardarAnimal() {
        String nombre = txtNombre.getText();
        String especie = txtEspecie.getText();
        String edadStr = txtEdad.getText();

        try {
            int edad = Integer.parseInt(edadStr);
            JOptionPane.showMessageDialog(this, "Animal guardado:\nNombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Edad inválida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
