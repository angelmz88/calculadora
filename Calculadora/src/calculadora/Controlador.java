package calculadora;

/**
 *
 * @author Angel
 */
public class Controlador {

    Operaciones op = new Operaciones();

    public double validacion(int opcion, double a, double b) {
        double respuesta = 0;
        switch (opcion) {
            case 0 ->
                respuesta = op.suma(a, b);
            case 1 ->
                respuesta = op.resta(a, b);
            case 2 ->
                respuesta = op.multiplicacion(a, b);
            case 3 ->
                respuesta = op.division(a, b);
        }
        return respuesta;
    }
}
