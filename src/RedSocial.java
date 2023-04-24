import javax.swing.*;
import java.awt.*;

public class RedSocial extends JFrame {

    private JTabbedPane tabbedPane1;

    public RedSocial() {
        super("Mi aplicación con pestañas");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel agregarParticipantePanel = new JPanel();
        tabbedPane.addTab("Agregar participante", agregarParticipantePanel);

        JPanel buscarParticipantePanel = new JPanel();
        tabbedPane.addTab("Buscar participante", buscarParticipantePanel);

        JPanel datosPredeterminadosPanel = new JPanel();
        tabbedPane.addTab("Datos predeterminados", datosPredeterminadosPanel);

        JPanel administracionRedPanel = new JPanel();
        tabbedPane.addTab("Administración de la red", administracionRedPanel);

        JPanel mostrarParticipantesPanel = new JPanel();
        tabbedPane.addTab("Mostrar todos los participantes activos", mostrarParticipantesPanel);

        // Agregamos el JTabbedPane al JFrame
        add(tabbedPane);

        // Configuramos el JFrame
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RedSocial();
    }
}
