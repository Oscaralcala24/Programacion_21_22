package U5.Tarea1.Parte3;

public class CajaCarton extends Caja{

    private double pesoTotal;
    private static double totalCarton;

    public CajaCarton(double alto, double ancho, double fondo) {
        super(alto, ancho, fondo, Unidades.CM);
        setTotalCarton(alto, ancho, fondo);
    }


    public static void setTotalCarton(double alto, double ancho, double fondo) {
        CajaCarton.totalCarton += ;
    }

    public void setVolumenCarton(){
        this.pesoTotal = (getAlto()*getAncho()*getFondo())*0.8;
    }
}
