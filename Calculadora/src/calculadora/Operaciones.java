package calculadora;

import javax.swing.JOptionPane;

public class Operaciones {
    double result = 0;
    
    public double suma(double a, double b){
        return a+b;
    }
    
    public double resta(double a, double b){
        return a-b;
    }
    
    public double multiplicacion(double a, double b){
        return a*b;
    }
    
    public double division(double a, double b){
        if(a == 0 || b == 0){
            JOptionPane.showMessageDialog(null, "No se pueden hacer operaciones con 0",
                "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        return a/b;
    }
}
