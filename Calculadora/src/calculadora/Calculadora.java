package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador cn = new Controlador();
        String[] options = {"Suma", "Resta", "Multiplicación", "División"};

        double a = Double.parseDouble(JOptionPane.showInputDialog("Inserte primer número"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inserte segundo número"));
        var s = JOptionPane.showOptionDialog(null, "Selecciona una operación:", "Operación", 0, 3, null, options, options[0]);

        JOptionPane.showMessageDialog(null, String.valueOf(cn.validacion(s, a, b)));
    }

}
