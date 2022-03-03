package U5.Prueba2021;

public class Atletas extends Participante implements MovimientoCorrer{

    private String nombrePrueba;

    public Atletas(String nombreAtleta, int edadAtleta, String nombrePrueba) {
        super(nombreAtleta, edadAtleta);
        this.nombrePrueba = nombrePrueba;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+ super.getNombreAtleta() +", como atleta, juro los valores deportivos mundiales");
    }
}
