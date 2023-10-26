import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEliminarJugador extends JFrame {
    private JTextField numeroField;

    public VentanaEliminarJugador() {
        setTitle("Eliminar Jugador");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JLabel lblNumero = new JLabel("Número de Jugador a eliminar:");
        numeroField = new JTextField();

        JButton btnEliminar = new JButton("Eliminar");

        panel.add(lblNumero);
        panel.add(numeroField);
        panel.add(new JLabel());
        panel.add(btnEliminar);

        add(panel, BorderLayout.NORTH);

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar el jugador de la base de datos
                int numero = Integer.parseInt(numeroField.getText());
                // Lógica para eliminar de la base de datos
                // JugadorDAO.deleteJugadorByNumero(numero);
                // Mostrar un mensaje de confirmación o error
                JOptionPane.showMessageDialog(VentanaEliminarJugador.this, "Jugador eliminado exitosamente.");
                dispose();
            }
        });
    }
}
