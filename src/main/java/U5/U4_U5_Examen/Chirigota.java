package U5.U4_U5_Examen;

public class Chirigota extends AgrupacionOficial implements Callejera{

    private int numeroCuples;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,int numeroCuples,int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObtenidos);
        this.numeroCuples = numeroCuples;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre "+ this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La Chirigota " + this.getNombre() + " va de " + this.getTipoDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La Chirigota " +  this.getNombre() +" va caminito del falla");

    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + this.getNombre());
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                super.toString()+
                "numeroCuples=" + numeroCuples +
                '}';
    }
}
