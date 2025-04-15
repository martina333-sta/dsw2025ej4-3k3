package views;

import javax.swing.*;

public class MenuPrincipalView extends JFrame {

    public MenuPrincipalView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JButton btnListar = new JButton("Listar Animales");
        JButton btnAgregar = new JButton("Agregar Animal");

        btnListar.addActionListener(e -> {
            ListarAnimalesView listarView = new ListarAnimalesView();
            listarView.setVisible(true);
            this.dispose();
        });

        btnAgregar.addActionListener(e -> {
            AgregarAnimalView agregarView = new AgregarAnimalView();
            agregarView.setVisible(true);
            this.dispose();
        });

        JPanel panel = new JPanel();
        panel.add(btnListar);
        panel.add(btnAgregar);

        add(panel);
    }
}
