import javax.swing.*;
import java.awt.*;

public class VentanaMostrarSelecciones extends JFrame {
    public VentanaMostrarSelecciones() {
        setTitle("Mostrar Selecciones");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea resultado = new JTextArea();
        resultado.setEditable(false);

        // Lógica para cargar las selecciones desde la base de datos y mostrarlas en el JTextArea
        // List<Seleccion> selecciones = SeleccionDAO.getAllSelecciones();
        // for (Seleccion seleccion : selecciones) {
        //     resultado.append(seleccion.toString() + "\n");
        // }

        add(new JScrollPane(resultado));
    }
}
