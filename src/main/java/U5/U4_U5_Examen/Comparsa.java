package U5.U4_U5_Examen;

public class Comparsa extends AgrupacionOficial{

    private String empresaAtrezzo;


    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,String empresaAtrezzo,int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObtenidos);
        this.empresaAtrezzo = empresaAtrezzo;
    }

    void insertar_integrante(Integrante i){

    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre "+ this.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La Comparsa " + this.getNombre() + " va de " + this.getTipoDisfraz());
    }


    @Override
    void caminito_del_falla() {
        System.out.println("La comparsa " +  this.getNombre() +" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "empresaAtrezzo='" + empresaAtrezzo + '\'' +
                '}';
    }
}
