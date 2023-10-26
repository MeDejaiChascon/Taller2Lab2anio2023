import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarSeleccion extends JFrame {
    private JTextField nombreField;
    private JTextField rankingField;

    public VentanaAgregarSeleccion() {
        setTitle("Agregar Selección");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel lblNombre = new JLabel("Nombre de la Selección:");
        nombreField = new JTextField();

        JLabel lblRanking = new JLabel("Ranking FIFA:");
        rankingField = new JTextField();

        JButton btnAgregar = new JButton("Agregar");

        panel.add(lblNombre);
        panel.add(nombreField);
        panel.add(lblRanking);
        panel.add(rankingField);
        panel.add(new JLabel());
        panel.add(btnAgregar);

        add(panel, BorderLayout.NORTH);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar la selección en la base de datos
                String nombre = nombreField.getText();
                int ranking = Integer.parseInt(rankingField.getText());
                // Lógica para insertar en la base de datos
                // Seleccion nuevaSeleccion = new Seleccion(nombre, ranking, ...);
                // SeleccionDAO.insertSeleccion(nuevaSeleccion);
                // Mostrar un mensaje de confirmación
                JOptionPane.showMessageDialog(VentanaAgregarSeleccion.this, "Selección agregada exitosamente.");
                dispose();
            }
        });
    }
}
