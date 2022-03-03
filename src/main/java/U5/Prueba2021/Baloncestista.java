package U5.Prueba2021;

public class Baloncestista extends Participante implements MovimientoEncestar{

    private double altura;

    public Baloncestista(String nombreAtleta, int edadAtleta, double altura) {
        super(nombreAtleta, edadAtleta);
        this.altura = altura;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo " + super.getNombreAtleta()+ ", como jugador de baloncesto, juro los valores deportivos mundiales");
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
