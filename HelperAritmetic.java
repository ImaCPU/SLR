
package slr;

/**
 * Helper Aritmetic
 * Omar Israel Navarro Oliva
 * 19 de Noviembre del 2021
 * 
 */
public class HelperAritmetic extends DataSet {

    int x[];
    int y[];

    public void setX(int[] matrizX) {
        x = matrizX;
    }

    public void setY(int[] matrizY) {
        y = matrizY;
    }

    public int SumaX() {
        int suma = 0;
        for (int i = 0; i < instancias(); i++) {
            suma += getMatrizX()[i];
        }
        return suma;
    }

    public int SumaY() {
        int suma = 0;
        for (int i = 0; i < instancias(); i++) {
            suma += getMatrizY()[i];
        }
        return suma;
    }

    public int SumaXY() {
        int suma = 0;
        for (int i = 0; i < instancias(); i++) {
            suma += getMatrizX()[i] * getMatrizY()[i];
        }
        return suma;
    }

    public int SumaXX() {
        int suma = 0;
        for (int i = 0; i < instancias(); i++) {
            suma += getMatrizX()[i] * getMatrizX()[i];
        }
        return suma;
    }

    // public double B0() {
    // double b0 = ((this.SumaXX() * this.SumaY()) - (this.SumaX() * this.SumaXY()))
    // / ((getMatrizX().length * this.SumaXX()) - (this.SumaX() * this.SumaX()));
    // return b0;
    // }

    public double B1() {
        // System.out.println("Instancias: " + instancias());
        // System.out.println("Suma XY: " + SumaXY());
        // System.out.println("Suma X: " + SumaX());
        // System.out.println("Suma Y: " + SumaY());
        // System.out.println("Suma XX: " + SumaXX());

        double b1 = (((instancias()) * SumaXY()) - (SumaX() * SumaY())) /
                (((instancias()) * SumaXX()) - (SumaX() * SumaX()));

        // System.out.println("B1: " + b1);

        return b1;
    }

    public double B0() {
        // System.out.println("Instancias: " + instancias());
        // System.out.println("Suma X: " + SumaX());
        // System.out.println("Suma Y: " + SumaY());

        double b0 = ((SumaY()) - B1() * (SumaX())) / instancias();

        // System.out.println("B0: " + b0);

        return b0;
    }

    public double instancias() {
        double num = getMatrizX().length;
        return num;
    }

}
