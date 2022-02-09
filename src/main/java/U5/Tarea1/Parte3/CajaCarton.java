package U5.Tarea1.Parte3;

public class CajaCarton extends Caja{

    private double volumenTotal;
    private static double totalCarton;
    private int etiqueta;

    public CajaCarton(double alto, double ancho, double fondo) {
        super(alto, ancho, fondo, Unidades.CM);
        setTotalCarton(alto, ancho, fondo);
    }


    public static void setTotalCarton(double alto, double ancho, double fondo) {
        CajaCarton.totalCarton += (2*alto*ancho)+(2*alto*fondo)+(2*ancho*fondo);
    }

    public void setVolumenCarton(){
        this.volumenTotal = (getAlto()*getAncho()*getFondo())*0.8;
    }


    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString(){
        return "Alto de la caja: " + this.alto + this.unidad +
                "\n Anchura de la caja: " + this.ancho + this.unidad +
                " \n Fondo de la caja: " + this.fondo + this.unidad +
                " \n Etiqueta de la caja: " + this.etiqueta;
    }


}
