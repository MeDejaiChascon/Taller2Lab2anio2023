import javax.swing.*;
import java.awt.*;

public class VentanaBusquedaSeleccion extends JFrame {
    public VentanaBusquedaSeleccion() {
        setTitle("Buscar Selección");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JLabel lblBuscar = new JLabel("Buscar selección por nombre:");
        JTextField txtBusqueda = new JTextField();
        JButton btnBuscar = new JButton("Buscar");

        JTextArea resultado = new JTextArea();
        resultado.setEditable(false);

        panel.add(lblBuscar);
        panel.add(txtBusqueda);
        panel.add(btnBuscar);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultado), BorderLayout.CENTER);
    }
}
