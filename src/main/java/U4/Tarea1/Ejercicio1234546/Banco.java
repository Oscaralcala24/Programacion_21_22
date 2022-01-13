package U4.Tarea1.Ejercicio1234546;

public class Banco {

    private final String nombreBanco;
    private double capitalBanco = 5.2;
    private String direccionCentral;

    public Banco(String nombreBanco, double capitalBanco, String direccionCentral) {
        this.nombreBanco = nombreBanco;
        this.capitalBanco = capitalBanco;
        this.direccionCentral = direccionCentral;
    }

    public void setCapitalBanco(double capitalBanco) {
        this.capitalBanco = capitalBanco;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }

}
