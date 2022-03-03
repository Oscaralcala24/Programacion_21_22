package U5.U4_U5_Examen;

public class Coro extends AgrupacionOficial{
    private int numeroBandurrias;
    private int numeroGuitarras;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,int numeroBandurrias,int numeroGuitarras,int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObtenidos);
        this.numeroBandurrias = numeroBandurrias;
        this.numeroGuitarras = numeroGuitarras;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre "+ this.getNombre());

    }

    @Override
    void hacer_tipo() {
        System.out.println("El Coro " + this.getNombre() + " va de " + this.getTipoDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El coro " +  this.getNombre() +" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Coro{" +
                "numeroBandurrias=" + numeroBandurrias +
                ", numeroGuitarras=" + numeroGuitarras +
                '}';
    }
}
