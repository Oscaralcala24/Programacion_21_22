package U5.Examen1920;

public class Pico extends Herramientas implements Minar{
    private double grosorPico;

    public Pico(String nombre, long masa, int capQuemar, int capDiluir, boolean movible,double grosorPico) {
        super(nombre, masa, capQuemar, capDiluir, movible);
        this.grosorPico = grosorPico;
    }
}
