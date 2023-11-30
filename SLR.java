package slr;

public class SLR {
    public static void main(String[] args) {

        DataSet DA = new DataSet();
        HelperAritmetic HA = new HelperAritmetic();

        Interfaz IN = new Interfaz();

        HA.setX(DA.getMatrizX());
        HA.setY(DA.getMatrizY());

        IN.setB1(HA.B1());
        IN.setB0(HA.B0());

        IN.formula();
        IN.predict();
    }

}
