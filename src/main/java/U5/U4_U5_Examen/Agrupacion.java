package U5.U4_U5_Examen;

public abstract class Agrupacion extends COAC{
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipoDisfraz;
    private int contadorAgrupaciones = 0;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipoDisfraz = tipoDisfraz;
        contadorAgrupaciones++;
    }

    abstract void cantar_la_presentacion();
    abstract void hacer_tipo();

    public String getNombre() {
        return nombre;
    }

    public String getTipoDisfraz() {
        return tipoDisfraz;
    }

    public String getAutor() {
        return autor;
    }

    public void getContadorAgrupaciones() {
        System.out.println("Hay "+ this.contadorAgrupaciones + "agrupaciones");
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipoDisfraz='" + tipoDisfraz + '\'' +
                ", contadorAgrupaciones=" + contadorAgrupaciones +
                '}';
    }
}
