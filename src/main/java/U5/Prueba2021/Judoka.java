package U5.Prueba2021;

public class Judoka extends Participante implements MovimientoLuchar{

    private int peso;

    public Judoka(String nombreAtleta, int edadAtleta) {
        super(nombreAtleta, edadAtleta);
        this.peso = peso;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo " + super.getNombreAtleta() + ", como judoka, juro los valores deportivos mundiales");
    }
}
