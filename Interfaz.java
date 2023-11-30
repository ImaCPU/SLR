package slr;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Interfaz
 * Omar Israel Navarro Oliva
 * 19 de Noviembre del 2021
 * 
 */
public class Interfaz extends HelperAritmetic {

    double b0;
    double b1;

    // Crear un objeto DecimalFormat con el formato deseado
    DecimalFormat formato = new DecimalFormat("0.00"); // Dos decimales

    // Formatear el número usando el objeto DecimalFormat
    // String numeroFormateado = formato.format(numero);

    public void predict() {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Ingresa El Valor a Predecir"));

        double predict = b0 + b1 * valor;
        System.out.println(predict);
        System.exit(0);
    }

    public void formula() {
        String b0Formateado = String.format("%.2f", b0);
        String b1Formateado = String.format("%.2f", b1);
        String formula = ("Regresion Lineal Simple: y = " + b0Formateado + " + " + b1Formateado + "x");
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(formula);
    }

    public void setB0(double B0) {
        b0 = B0;
    }

    public void setB1(double B1) {
        b1 = B1;
    }

    public void exit() {
        System.exit(0);
    }

}
