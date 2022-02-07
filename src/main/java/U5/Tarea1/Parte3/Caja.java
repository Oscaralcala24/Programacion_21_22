package U5.Tarea1.Parte3;

public class Caja {

    private String etiqueta;
    private double alto;
    private double ancho;
    private double fondo;
    private Unidades unidad;

    public Caja(double alto, double ancho, double fondo, Unidades unidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public enum Unidades{
        M,
        CM;
    }

    double getVolumen(){
        return this.alto*this.ancho*this.fondo;
    }

    @Override
    public String toString(){
        return "Alto de la caja: " + this.alto + this.unidad +
        "\n Anchura de la caja: " + this.ancho + this.unidad +
        " \n Fondo de la caja: " + this.fondo + this.unidad;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }


    public String getEtiqueta() {
        return etiqueta;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getFondo() {
        return fondo;
    }
}



