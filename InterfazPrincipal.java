import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazPrincipal extends JFrame {
    public InterfazPrincipal() {
        setTitle("Super Campeones Cup 2023");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu menuSelecciones = new JMenu("Selecciones");

        JMenuItem itemBuscarSeleccion = new JMenuItem("Buscar Selección");
        itemBuscarSeleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaBusquedaSeleccion ventanaBusquedaSeleccion = new VentanaBusquedaSeleccion();
                ventanaBusquedaSeleccion.setVisible(true);
            }
        });

        JMenuItem itemAgregarSeleccion = new JMenuItem("Agregar Selección");
        itemAgregarSeleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAgregarSeleccion ventanaAgregarSeleccion = new VentanaAgregarSeleccion();
                ventanaAgregarSeleccion.setVisible(true);
            }
        });

        JMenuItem itemMostrarSelecciones = new JMenuItem("Mostrar Selecciones");
        itemMostrarSelecciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMostrarSelecciones ventanaMostrarSelecciones = new VentanaMostrarSelecciones();
                ventanaMostrarSelecciones.setVisible(true);
            }
        });

        JMenuItem itemEliminarJugador = new JMenuItem("Eliminar Jugador");
        itemEliminarJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaEliminarJugador ventanaEliminarJugador = new VentanaEliminarJugador();
                ventanaEliminarJugador.setVisible(true);
            }
        });

        menuSelecciones.add(itemBuscarSeleccion);
        menuSelecciones.add(itemAgregarSeleccion);
        menuSelecciones.add(itemMostrarSelecciones);
        menuSelecciones.add(itemEliminarJugador);

        menuBar.add(menuSelecciones);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazPrincipal ventanaPrincipal = new InterfazPrincipal();
            ventanaPrincipal.setVisible(true);
        });
    }
}
