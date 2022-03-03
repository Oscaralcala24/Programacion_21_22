package U5.U4_U5_Examen;

public class Cuarteto extends AgrupacionOficial implements Callejera{

    private int numeroMiembros;


    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,int numeroMiembros,int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObtenidos);
        this.numeroMiembros = numeroMiembros;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto con nombre "+ this.getNombre());

    }

    @Override
    void hacer_tipo() {
        System.out.println("El Cuarteto " + this.getNombre() + " va de " + this.getTipoDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El Cuarteto " +  this.getNombre() +" va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto" + this.getNombre());
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "numeroMiembros=" + numeroMiembros +
                '}';
    }
}
