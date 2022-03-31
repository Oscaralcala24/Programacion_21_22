package U7.Alcala_Espigares_U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Comparable<Pelicula>, Serializable {

    private String titulo;
    private String anoEstreno;
    private String paisOrigen;
    private String genero;
    private String director;
    private int idPelicula;
    private static int contador = 0;

    public Pelicula(String titulo, String anoEstreno, String paisOrigen, String genero, String director) {
        setTitulo(titulo);
        setAnoEstreno(anoEstreno);
        setPaisOrigen(paisOrigen);
        setGenero(genero);
        setDirector(director);
        this.idPelicula = contador++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return titulo.equals(pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(String anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pelicula o) {
        return -getTitulo().compareTo(o.getTitulo());
    }
}
