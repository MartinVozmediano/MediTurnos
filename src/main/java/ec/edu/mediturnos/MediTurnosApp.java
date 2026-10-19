package ec.edu.mediturnos;

import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

/** Punto de entrada de la aplicación MediTurnos. */
public class MediTurnosApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                JOptionPane.showMessageDialog(null, "MediTurnos iniciado correctamente"));
    }
}
