package U5.Prueba2021;

public class Atletismo extends Deporte{
    private int numeroPruebas;


    public Atletismo(String nombreDeporte, String nombrePabellon,int numeroPruebas) {
        super(nombreDeporte, nombrePabellon);
        this.numeroPruebas = numeroPruebas;
    }
}
