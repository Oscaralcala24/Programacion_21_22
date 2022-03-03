package U5.U4_U5_Examen;

public class Romancero extends Agrupacion implements Callejera{

    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,String tematicaCartelon) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre "+ this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El Romancero " + this.getNombre() + " va de " + this.getTipoDisfraz());

    }


    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero " + this.getNombre());

    }

    @Override
    public String toString() {
        return "Romancero{" +
                "tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }
}
