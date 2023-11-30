/*
 * 
 *  
 */
package slr;

/**
 * Data Set.
 * Omar Israel Navarro Oliva
 * 19 de Noviembre del 2021
 * 
 */

public class DataSet {
    private int[] x = { 23, 26, 30, 34, 43, 48, 52, 57, 58 };
    private int[] y = { 651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518 };

    public int[][] data = {
            { 23, 651 },
            { 26, 762 },
            { 30, 856 },
            { 34, 1063 },
            { 43, 1190 },
            { 48, 1298 },
            { 52, 1421 },
            { 57, 1440 },
            { 58, 1518 }
    };

    public int contador = 0;

    public DataSet() {
    }

    public void tamaño(int n) {
        this.x = new int[n];
        this.y = new int[n];
    }

    public void setVal(int xn, int yn) {
        x[contador] = xn;
        y[contador] = yn;
        contador++;
    }

    public int[] getMatrizX() {
        return x;
    }

    public int[] getMatrizY() {
        return y;
    }

    public int[][] getMatriz() {
        return data;
    }
}
